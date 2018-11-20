
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping ${title}</title>
    <script>
        window.menu ='${title}';
    </script>
    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <style><%@include file="/WEB-INF/css/shop-homepage.css"%></style>
  <style><%@include file="/WEB-INF/css/bootstrap-readable-theme.css"%></style>
</head>
<div class="wrapper">
    <!-- Navigation -->
    <%@include file="./shared/navbar.jsp"%>
    <!-- Page Content -->  
  <div class="content">
    <!-- /.Loading the index page -->
    <c:if test="${userClickHome == true}">
          <%@include file="index.jsp"%>
    </c:if>
    <!--Load this only when user click about page -->
    <c:if test="${userClickAbout == true}">
          <%@include file="about.jsp"%>
    </c:if>
      <!--Load this only when user click about page -->
    <c:if test="${userClickContact == true}">
          <%@include file="contact.jsp"%>
    </c:if>
    <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
          <%@include file="listProducts.jsp"%>
    </c:if>
   </div>
    <!-- Footer -->
    <%@include file="./shared/footer.jsp"%>
    <!-- /.container -->

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- DataTable Plugin -->
    <script src="vendor/bootstrap/js/jquery.dataTable.js"></script>
    <!-- Custom javascript file -->
    <script><%@include file="/WEB-INF/js/myapp.js"%></script>
    
</div>
</html>
