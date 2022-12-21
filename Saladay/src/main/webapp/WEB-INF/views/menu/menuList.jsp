<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saladay Menu</title>
    
	<link rel="stylesheet" href="/resources/css/menu/menuList.css">
</head>
<body>
    <!-- 헤더 -->
	<jsp:include page="/WEB-INF/views/main/header.jsp"></jsp:include>

    <section class="menu-section">
        <div class="menu">
            <div class="option-name"> 
                <a href="/menu/menuList"> Salad</a>
            </div>
            <div class="option-name"> 
                <a href="/menu/mainTopping">Main Topping</a>
            </div>
            <div class="option-name"> 
                <a href="/menu/subTopping">Sub Topping</a>
            </div>
            <div class="option-name"> 
                <a href="/menu/sourceList">Source</a> 
            </div>
        </div>
        
        <div class="pd-list-wrapper">
            <div class="menu-detail">
                <c:forEach items="${menuList}" var="menu">
                    <div class="menu-wrapper">
                        <div class="menu-list">
                            <li class="menu-img"><img src="${menu.menuImage}" alt=""></li>
                            <li class="menu-title"><span>${menu.menuName}</span></li>
                        </div>
                        <div class="summary">
                            <li class="menu-title"><span>${menu.menuName}</span></li> <br>
                            <li class="menu-content">${menu.menuContent}</li> <br>
                            <li class="menu-content">${menu.menuPrice}원</li>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </section>
    
    <!-- 푸터 -->
	<jsp:include page="/WEB-INF/views/main/footer.jsp"></jsp:include>

</body>
</html>