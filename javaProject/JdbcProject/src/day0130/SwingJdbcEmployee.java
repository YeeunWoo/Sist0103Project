package day0130;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import oracleDb.DbConnect;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.*;

public class SwingJdbcEmployee extends JFrame implements ActionListener {

	DbConnect db = new DbConnect();
	Container cp;

	DefaultTableModel model; // 테이블 추가 삭제할 때 필요
	JTable table;
	JButton btnAdd, btnDel, btnUpdate;

	// 이미지 파일 경로를 저장할 변수
	private static String imagePath;

	// 이미지 파일 경로를 설정하는 메서드
	public static void setImagePath(String path) {
		imagePath = path;
	}

	// 이미지 파일 경로를 반환하는 메서드
	public static String getImagePath() {
		return imagePath;
	}

	AddEmployeeInfo addForm = new AddEmployeeInfo("추가");
	UpdateEmployeeInfo updateForm = new UpdateEmployeeInfo("수정");

	// 생성자
	public SwingJdbcEmployee(String title) {
	    super(title);
	    cp = this.getContentPane();
	    this.setBounds(200, 100, 800, 400);
	    cp.setBackground(new Color(230, 220, 200));
	    initDesign();
	    this.setVisible(true);


	}


	// 테이블에 출력하는 메서드
	public void tableWrite() {
		// 테이블 초기화
		model.setRowCount(0);

		// db 연결
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select num,name,gender,dept,position,addr,pay,email,ipsaday from employee order by num";

		conn = db.getOracle();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Vector<Object> data = new Vector<Object>();

				data.add(false); // 체크박스를 추가하기 위해 먼저 false로 추가
				data.add(rs.getString("num"));
				data.add(rs.getString("name"));
				data.add(rs.getString("gender"));
				data.add(rs.getString("dept"));
				data.add(rs.getString("position"));
				data.add(rs.getString("addr"));
				data.add(rs.getString("pay"));
				data.add(rs.getString("email"));
				data.add(rs.getDate("ipsaday").toString());
				// 테이블에 추가
				model.addRow(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}

	// 직원 정보 추가 메서드
	public void insertData() {
		String name = addForm.tfName.getText();
		// 성별 선택
		String gender;
		if (addForm.rbMale.isSelected()) {
			gender = "남자";
		} else if (addForm.rbFemale.isSelected()) {
			gender = "여자";
		} else {
			gender = "선택 안 함";
		}

		// 부서 선택
		String dept = (String) addForm.cbDept.getSelectedItem();

		// 직급 선택
		String position = (String) addForm.cbPosition.getSelectedItem();
		String address = addForm.tfAddress.getText();
		String pay = addForm.tfPay.getText();
		String email = addForm.tfEmail.getText();

		// 사진 파일 경로
		String photo = imagePath; // 이미지 파일 경로를 가져와서 저장

		String sql = "insert into employee values(seq_emp.nextval, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";

		// db 연결, SQL문 전송
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setString(2, photo); // 사진 파일 경로 추가
			pstmt.setString(3, gender);
			pstmt.setString(4, dept);
			pstmt.setString(5, position);
			pstmt.setString(6, address);
			pstmt.setString(7, pay);
			pstmt.setString(8, email);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	// 직원 정보 삭제 메서드
	public void deleteData() {
		// 체크된 행을 삭제
		int checkedCount = 0;
		for (int i = model.getRowCount() - 1; i >= 0; i--) {
			boolean checked = (boolean) model.getValueAt(i, 0);
			if (checked) {
				checkedCount++;
			}
		}

		if (checkedCount == 0) {
			JOptionPane.showMessageDialog(this, "삭제할 행을 선택해주세요.");
			return;
		}

		int option = JOptionPane.showConfirmDialog(this, "선택된 " + checkedCount + "개 행을 삭제하시겠습니까?", "삭제 확인", JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) {
			for (int i = model.getRowCount() - 1; i >= 0; i--) {
				boolean checked = (boolean) model.getValueAt(i, 0);
				if (checked) {
					String num = (String) model.getValueAt(i, 1);
					deleteData(num);
				}
			}
			// 테이블 다시 출력
			tableWrite();
		}
	}


	// 직원 정보 삭제 메서드 (특정 번호로 삭제)
	public void deleteData(String num) {
		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;
		String sql = "delete from employee where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			int a = pstmt.executeUpdate();
			if (a == 0) {
				JOptionPane.showMessageDialog(this, "없는 번호입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}


	public void updateData() {
		String num = updateForm.num;
		String name = addForm.tfName.getText();
		// 성별 선택
		String gender;
		if (addForm.rbMale.isSelected()) {
			gender = "남자";
		} else if (addForm.rbFemale.isSelected()) {
			gender = "여자";
		} else {
			gender = "선택 안 함";
		}

		// 부서 선택
		String dept = (String) addForm.cbDept.getSelectedItem();

		// 직급 선택
		String position = (String) addForm.cbPosition.getSelectedItem();
		String address = addForm.tfAddress.getText();
		String pay = addForm.tfPay.getText();
		String email = addForm.tfEmail.getText();

		// 사진 파일 경로
		String photo = imagePath; // 이미지 파일 경로를 가져와서 저장	

		String sql = "UPDATE employee SET name=?, photo=?, gender=?, dept=?, position = ?, addr=?, pay=?, email=? WHERE num=?";

		Connection conn = db.getOracle();
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, photo); // 사진 파일 경로 추가
			pstmt.setString(3, gender);
			pstmt.setString(4, dept);
			pstmt.setString(5, position);
			pstmt.setString(6, address);
			pstmt.setString(7, pay);
			pstmt.setString(8, email);
			pstmt.setString(9, num);
			
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}







	//디자인
	public void initDesign() {
		String[] title = {"삭제", "번호", "이름", "성별", "부서", "직급", "주소", "급여", "이메일", "입사날짜"};

		model = new DefaultTableModel(title, 0) {
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				if (columnIndex == 0) {
					return Boolean.class; // 체크박스 열
				}
				return super.getColumnClass(columnIndex);
			}

			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 0; // 체크박스 열만 편집 가능하게 설정
			}
		};

		table = new JTable(model);
		this.add("Center", new JScrollPane(table));

		//테이블에 db데이터 출력
		tableWrite();

		//버튼 3개 올릴 패널
		JPanel pTop = new JPanel();
		this.add("North", pTop);

		//추가버튼
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pTop.add(btnAdd);
		//추가폼에 있는 추가버튼에 액션 추가
		addForm.btnAdd.addActionListener(this);

		btnDel = new JButton("삭제");
		pTop.add(btnDel);
		btnDel.addActionListener(this);

		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		pTop.add(btnUpdate);
		updateForm.btnMod.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == btnAdd) {
			addForm.setVisible(true);
		} else if (ob == addForm.btnAdd) {//학생추가폼의 버튼 이벤트
			//입력하는 데이터를 읽어서 db에 추가
			insertData();
			//테이블 다시 출력
			tableWrite();
			//초기화하면서 추가폼 사라지게
			addForm.tfName.setText("");
			addForm.tfAddress.setText("");
			addForm.tfPay.setText("");
			addForm.tfEmail.setText("");
			addForm.setVisible(false);
		} else if (ob == btnDel) {
			deleteData();
		} else if(ob == btnUpdate) {
			updateForm.setVisible(true);

		}
	}

	public static void main(String[] args) {
		new SwingJdbcEmployee("학생 성적 관리 DB");
	}
}
