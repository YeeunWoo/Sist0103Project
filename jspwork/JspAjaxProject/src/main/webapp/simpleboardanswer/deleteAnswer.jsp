<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="simpleboardanswer.model.SimpleAnswerDao" %>
<%
    String idx = request.getParameter("idx"); // 삭제할 댓글의 idx
    String num = request.getParameter("num"); // 해당 글의 번호
    
    SimpleAnswerDao dao = new SimpleAnswerDao();
    dao.deleteAnswer(idx); // 댓글 삭제
    
    response.sendRedirect("listAnswer.jsp?num=" + num); // 삭제 후 다시 목록 페이지로 이동
%>
