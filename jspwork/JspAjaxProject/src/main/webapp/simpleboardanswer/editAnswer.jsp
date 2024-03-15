<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="simpleboardanswer.model.SimpleAnswerDao" %>
<%@ page import="simpleboardanswer.model.SimpleAnswerDto" %>
<%
    String idx = request.getParameter("idx"); // 수정할 댓글의 idx
    String newContent = request.getParameter("newContent"); // 새로운 내용
    String num = request.getParameter("num"); // 해당 글의 번호
    
    SimpleAnswerDao dao = new SimpleAnswerDao();
    dao.updateAnswer(idx, newContent); // 댓글 수정
    
    response.sendRedirect("listAnswer.jsp?num=" + num); // 수정 후 다시 목록 페이지로 이동
%>
