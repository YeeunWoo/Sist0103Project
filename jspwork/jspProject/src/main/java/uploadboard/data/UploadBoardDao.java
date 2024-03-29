package uploadboard.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;

public class UploadBoardDao {
DbConnect db = new DbConnect();

public void insertUploadBoard(UploadBoardDto dto) {
	Connection conn = db.getConnection();
	PreparedStatement pstmt=null;
	String sql="insert into uploadboard values(null,?,?,?,?,?,0,now())";
	try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, dto.getWriter());
		pstmt.setString(2, dto.getSubject());
		pstmt.setString(3, dto.getContent());
		pstmt.setString(4, dto.getImgname());
		pstmt.setString(5, dto.getPass());
		
		pstmt.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		db.dbClose(pstmt, conn);
	}
}
//전체데이터 list에 담아서 리턴하는 메서드
public List<UploadBoardDto> getAllDatas(){
	List<UploadBoardDto> list = new Vector<UploadBoardDto>();
	Connection conn = db.getConnection();
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	String sql="select * from uploadboard order by num desc";
	try {
		
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
			UploadBoardDto dto = new UploadBoardDto();
			
			dto.setNum(rs.getString("num"));
			dto.setWriter(rs.getString("writer"));
			dto.setSubject(rs.getString("subject"));
			dto.setContent(rs.getString("content"));
			dto.setImgname(rs.getString("imgname"));
			dto.setReadcount(rs.getInt("readcount"));
			dto.setWriteday(rs.getTimestamp("writeday"));
			
			list.add(dto);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
}
}
