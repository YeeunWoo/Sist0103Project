<%@page import="myworld.model.WorldDto"%>
<%@page import="myworld.model.WorldDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  WorldDao dao=new WorldDao();
  
  request.setCharacterEncoding("utf-8");

  String num=request.getParameter("unum"); // 수정할 항목의 번호
  String writer=request.getParameter("uwriter"); // 수정된 작성자
  String content=request.getParameter("ucontent"); // 수정된 내용
  String avata=request.getParameter("uavata"); // 수정된 아바타 이미지 경로
  
  WorldDto dto=new WorldDto();
  dto.setNum(num);
  dto.setWriter(writer);
  dto.setContent(content);
  dto.setAvata(avata);
  
  dao.updateWorld(dto);
%>
