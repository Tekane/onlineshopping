
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Online Shopping ${title}</title>
    <script>
        window.menu ='${title}';
        window.contextRoot='${contextRoot}';
    </script>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Custom styles for this template -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <style><%@include file="/WEB-INF/css/shop-homepage.css"%></style>
  <style><%@include file="/WEB-INF/css/bootstrap-readable-theme.css"%></style>
  <script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
  <script type="text/javascript" src="https://cdn.datatables.net/1.10.8/js/jquery.dataTables.min.js"></script>
    <!-- Bootstrap DataTables -->
   <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"/>
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
      <c:if test="${userClickShowProduct == true}">
          <%@include file="product.jsp"%>
    </c:if>
   </div>
    <!-- Footer -->
    <%@include file="./shared/footer.jsp"%>
    <!-- /.container -->
<!-- Custom javascript file -->
    <script><%@include file="/WEB-INF/js/myapp.js"%></script>
    <!-- Bootstrap core JavaScript -->
    <script src="/vendor/jquery/jquery.min.js"></script>
    <script type = "text/javascript" src = "https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    
    <script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    
    <!-- DataTable Plugin -->
    <<script src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</div>
</html>
