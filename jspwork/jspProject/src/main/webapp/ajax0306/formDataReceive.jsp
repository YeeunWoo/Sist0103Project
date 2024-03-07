<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String foodphoto = request.getParameter("foodphoto");
	String foodname = request.getParameter("foodname");
	String foodscore1 = request.getParameter("foodscore1");
	String foodscore2 = request.getParameter("foodscore2");
	String foodscore3 = request.getParameter("foodscore3");

	//총점..String==>int
	int total = Integer.parseInt(foodscore1)+Integer.parseInt(foodscore2)+Integer.parseInt(foodscore3);
	double avg = total/3;

	//front형태로 만들어서 보내기
	JSONObject ob = new JSONObject();
	ob.put("photo","../image/Food/"+foodphoto+".jpg");
	ob.put("food",foodname);
	ob.put("tot",total);
	ob.put("avg",avg);
%>

<%=ob.toString()%>