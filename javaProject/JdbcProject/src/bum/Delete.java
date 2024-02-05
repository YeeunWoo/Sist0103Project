package bum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import oracleDb.DbConnect;

public class Delete {

	DefaultTableModel model;
	DbConnect db=new DbConnect();
///////////////////////////////////테이블에 표시하기	
	private void tableWrite() 
	{
		//테이블초기화
		model.setRowCount(0);

		//db연결
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		String sql="select * from employee order by num";

		conn=db.getOracle();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();

			while(rs.next())
			{
				Vector<String> data=new Vector<String>();

				data.add(rs.getString("num"));
				data.add(rs.getString("name"));
				data.add(rs.getString("photo"));
				data.add(rs.getString("gender"));
				data.add(rs.getString("dept"));
				data.add(rs.getString("position"));
				data.add(rs.getString("addr"));
				data.add(rs.getString("pay"));
				data.add(rs.getString("email"));
				data.add(rs.getString("ipsaday"));

				//테이블에 추가
				model.addRow(data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}

	}
///////////////////////////////////////데이터 삭제 후 테이블 갱신
	public void deleteData(String num)
	{
		String sql="delete from employee where num="+num;

		//sql문 실행후 해당변화가 없으면 메세지 삭제되면 tablewrite()호출
		Connection conn=db.getOracle();
		PreparedStatement pstmt=null;


		try {
			pstmt=conn.prepareStatement(sql);
			int a=pstmt.executeUpdate();

			if(a==0)
				JOptionPane.showMessageDialog(null, this, "없는 데이터 번호입니다", a);
			else
				tableWrite();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}		
	}
}
