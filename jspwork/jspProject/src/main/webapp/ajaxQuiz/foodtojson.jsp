<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="mysql.db.DbConnect"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    DbConnect db=new DbConnect();
    Connection conn=db.getConnection();
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    
    String sql="select * from food order by num";
    
    String s="[";
    
    try{
    	pstmt=conn.prepareStatement(sql);
    	rs=pstmt.executeQuery();
    
        while(rs.next())
        {
        	String num=rs.getString("num");
        	String name=rs.getString("foodname");
        	String photo=rs.getString("foodphoto");
        	int price=rs.getInt("price");
        	int cnt=rs.getInt("cnt");
        	
        	//json파싱  "num":num
			s+="{";
			s+="\"num\":"+num+",\"name\":\""+name+"\",\"photo\":\""+photo;
			s+="\",\"price\":"+price+",\"cnt\":\""+cnt+"\"";
			s+="},";
        	
        	
		}
		
		//마지막 컴마제거
		s=s.substring(0, s.length()-1);
	
	
	}catch(SQLException e){
		
	}finally{
		db.dbClose(rs, pstmt, conn);
		
	}
	
	s+="]";
%>

<%=s%>