package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracleDb.DbConnect;

public class EmpDbModel {
    DbConnect db = new DbConnect();

//    // 사원 추가
    public void insertEmployee(EmpDto dto) {
        Connection conn = db.getOracle();
        PreparedStatement pstmt = null;

        String sql = "insert into employee values(seq_emp.nextval, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getPhoto());
            pstmt.setString(3, dto.getGender());
            pstmt.setString(4, dto.getDept());
            pstmt.setString(5, dto.getPosition());
            pstmt.setString(6, dto.getAddr());
            pstmt.setInt(7, dto.getPay());
            pstmt.setString(8, dto.getEmail());

            pstmt.execute();	
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    // 사원 조회
    public Vector<EmpDto> getAllEmployees(){
        Vector<EmpDto> list = new Vector<EmpDto>();

        Connection conn = db.getOracle();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from employee order by num";

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()) {
            	EmpDto dto = new EmpDto();

                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setPhoto(rs.getString("photo"));
                dto.setGender(rs.getString("gender"));
                dto.setDept(rs.getString("dept"));
                dto.setPosition(rs.getString("position"));
                dto.setAddr(rs.getString("addr"));
                dto.setPay(rs.getInt("pay"));
                dto.setEmail(rs.getString("email"));
                dto.setIpsaday(rs.getDate("ipsaday"));

                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(rs, pstmt, conn);
        }		
        return list;
    }
    
}
