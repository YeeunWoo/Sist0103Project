package day0130;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import day0130.AddEmployeeInfo.PhotoDraw;

public class UpdateEmployeeInfo extends JFrame implements ActionListener{
    Container cp;
    JTextField tfName, tfAddress, tfPay, tfEmail;
    JRadioButton rbMale, rbFemale;
    ButtonGroup genderGroup;
    JComboBox<String> cbDept, cbPosition;
    JLabel lblPhoto;
    String imageName;
    JButton btnImage, btnMod;
    PhotoDraw photoDraw; // photoDraw 변수 선언
    public String num; //수정할 번호 

    // 생성자에 소유자 참조를 전달받는 매개변수 추가
    public UpdateEmployeeInfo(String title) {
        super(title);
        cp = this.getContentPane();
        this.setBounds(200, 100, 350, 500);
        cp.setBackground(new Color(230, 220, 200));
        photoDraw = new PhotoDraw();
        initDesign(); 
        //this.setVisible(true);
    }

	public void initDesign() {
		this.setLayout(null);

		JLabel lblTitle1 = new JLabel("이름");
		JLabel lblTitle2 = new JLabel("성별");
		JLabel lblTitle3 = new JLabel("부서");
		JLabel lblTitle4 = new JLabel("직급");
		JLabel lblTitle5 = new JLabel("주소");
		JLabel lblTitle6 = new JLabel("급여");
		JLabel lblTitle7 = new JLabel("이메일");
		JLabel lblTitle8 = new JLabel("사진선택");

		tfName = new JTextField(10);
		tfAddress = new JTextField(10);
		tfPay = new JTextField(10);
		tfEmail = new JTextField(10);

		rbMale = new JRadioButton("남자");
		rbFemale = new JRadioButton("여자");
		genderGroup = new ButtonGroup();
		genderGroup.add(rbMale);
		genderGroup.add(rbFemale);

		String[] dept = {"개발부", "인사부", "기획부", "회계부"};
		cbDept = new JComboBox<String>(dept);

		String[] positions = {"사원", "대리", "과장", "차장", "부장"};
		cbPosition = new JComboBox<String>(positions);

		btnMod = new JButton("수정");

		// 라벨 7개
		lblTitle1.setBounds(30, 10, 60, 30);
		this.add(lblTitle1);
		lblTitle2.setBounds(30, 40, 60, 30);
		this.add(lblTitle2);
		lblTitle3.setBounds(30, 80, 60, 30);
		this.add(lblTitle3);
		lblTitle4.setBounds(30, 120, 60, 30); 
		this.add(lblTitle4);
		lblTitle5.setBounds(30, 160, 60, 30);
		this.add(lblTitle5);
		lblTitle6.setBounds(30, 200, 60, 30); 
		this.add(lblTitle6);
		lblTitle7.setBounds(30, 240, 60, 30);
		this.add(lblTitle7);
		lblTitle8.setBounds(30, 280, 60, 30); 
		this.add(lblTitle8);



		// 이름, 성별, 부서, 직급, 주소, 급여, 이메일 순으로
		tfName.setBounds(80, 15, 100, 22);
		this.add(tfName);

		rbMale.setBounds(80, 45, 60, 30);
		this.add(rbMale);

		rbFemale.setBounds(140, 45, 60, 30);
		this.add(rbFemale);

		cbDept.setBounds(80, 85, 100, 30); // 간격을 더 넓게 조정했습니다.
		this.add(cbDept);

		cbPosition.setBounds(80, 125, 100, 30); // 간격을 더 넓게 조정했습니다.
		this.add(cbPosition);

		tfAddress.setBounds(80, 165, 100, 22); // 간격을 더 넓게 조정했습니다.
		this.add(tfAddress);

		tfPay.setBounds(80, 205, 100, 22);
		this.add(tfPay);

		tfEmail.setBounds(80, 245, 100, 22);
		this.add(tfEmail);

		btnImage = new JButton("사진선택");
		btnImage.setBounds(90, 280, 100, 30);
		this.add(btnImage);
		btnImage.addActionListener(this);

		//이미지추가
		photoDraw.setBounds(250, 10, 80, 90);
		this.add(photoDraw);

		//이미지명
		lblPhoto = new JLabel("이미지명");
		lblPhoto.setBorder(new LineBorder(Color.white));
		lblPhoto.setBounds(30, 330, 300, 30);
		this.add(lblPhoto);


		//버튼
		btnMod.setBounds(60, 170, 70, 30);
		this.add(btnMod);



	}

	// 내부클래스 --> 이미지 삽입을 위해
	class PhotoDraw extends Canvas{

		@Override
		public void paint(Graphics g) {
			super.paint(g);

			if(imageName!=null) {
				Image image = new ImageIcon(imageName).getImage();
				g.drawImage(image, 10, 10, 60, 70, this);
			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == btnImage) {
			FileDialog dlg = new FileDialog(this, "이미지 가져오기", FileDialog.LOAD);
			dlg.setVisible(true);

			// 취소 누르면 메서드 종료
			if (dlg.getDirectory() == null)
				return;
			// 이미지명 얻기
			imageName = dlg.getDirectory() + dlg.getFile();

			// 라벨에 이미지명 출력
			lblPhoto.setText(imageName);

			// 이미지 출력
			photoDraw.repaint();

			// 이미지 파일의 경로를 SwingJdbcEmployee 클래스로 전달
			if (imageName != null && !imageName.isEmpty()) {
				SwingJdbcEmployee.setImagePath(imageName);
			}
		}

	}


	//    public static void main(String[] args) {
	//        new UpdateEmployeeInfo("직원 정보 수정");
	//    }
}
