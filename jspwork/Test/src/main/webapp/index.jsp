<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>가구 판매 사이트</title>
    <!-- 부트스트랩 CDN 추가 -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- 여기에 추가적으로 필요한 CSS 파일들을 추가할 수 있습니다 -->
    <style>
        /* 추가적인 CSS 스타일링 */
    </style>
</head>
<body>
    <header>
        <!-- 네비게이션 바 등의 헤더 내용 -->
        <jsp:include page="layout/menu.jsp"/>
    </header>

    <!-- main 부분 include -->
    <jsp:include page="layout/main.jsp"/>

    <!-- footer 부분 include -->
    <jsp:include page="layout/info.jsp"/>


    <!-- 부트스트랩 및 추가적인 JS 파일들을 로드할 수 있습니다 -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <!-- 추가적인 JS 파일들을 로드할 수 있습니다 -->
    <script>
        // 추가적인 자바스크립트 코드
    </script>
</body>
</html>
