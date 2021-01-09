<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

   <div class="container">
      <div id="header">
      <!-- 메인배너 -->
      <div class="row">
      	<div class="col-xs-4" id="image"> <a href="${pageContext.request.contextPath}/home.do"><img class="image" src="${pageContext.request.contextPath}/resources/images/banner.png"/></a></div>
		

	  <!--헤더 서치바-->   
      <div class="col-xs-3 col-xs-offset-1 display-none">         
      	 <form action="${pageContext.request.contextPath}/cartoon/search.do" method="get">
      	<div class="input-group" id="searchbar">
	      
	      
	      <input id="title" name="title" type="text" class="form-control" placeholder="검색">
	      <span class="input-group-btn">
	       <button id="click" class="btn btn-default glyphicon glyphicon-search" type="submit"></button>
	    </span>
	   
	      
	      
      	</div><!-- /input-group -->
      	</form>
     </div>


     <!-- 광고 -->
   	  <div class="col-xs-3" id="advertisement"><img class="advertisement display-none" src="${pageContext.request.contextPath}/resources/images/advertisement.png"/></div>
   	</div>
   	</div>
   </div>




   <div class="nav-container">
	   <div class="navbar navbar-inverse">
	      <a href="${pageContext.request.contextPath}/cartoon/list.do" class="navbar-brand">웹툰</a>
	      <a  href="${pageContext.request.contextPath}/board_review/list.do" class="navbar-brand">리뷰</a>
	      <a  href="${pageContext.request.contextPath}/board_free/list.do" class="navbar-brand">자유게시판</a>
		<c:if test="${userid eq 'root' }">
      <a  href="${pageContext.request.contextPath}/administer/administer_page.do" class="navbar-brand">관리자 페이지</a>
      	</c:if>
	   </div>
   </div> <!--네비바 -->
