<%-- 
    Document   : sidebar
    Created on : 23 Oct 2018, 9:43:38 PM
    Author     : tekane
--%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1 class="my-4">PTS STORE</h1>
    <div class="list-group">
      <c:forEach items="${categories}" var="category">
          <a href="${contextRoot}/showcategory/${category.id}/products" class="list-group-item">${category.name}</a>
      </c:forEach>
    </div>