<%-- 
    Document   : listProducts
    Created on : 31 Oct 2018, 7:36:02 AM
    Author     : tekane
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container">
    <div class="row">
        <!--This will display the sidebar-->
        <div class="col-md-3">
            <%@include file="./shared/sidebar.jsp"%>
        </div>
        <!-- This will display the actual products -->
        <div class="col-md-9">
            <!-- Adding a breadcrumb component -->
            <div class="row">
                <div class="col-lg-12">
                   <c:if test="${userClickAllProducts == true}">
                       <script>
                           window.categoryId = '';
                       </script>
                     <ol class="breadcrumb">
                        <li><a href="${contextRoot}/home">Home</a></li>
                        <li class="active">All Products</li>
                    </ol>
                   </c:if>
                    <c:if test="${userClickCategoryProducts == true}">
                       <script>
                           window.categoryId = '${category.id}';
                       </script>
                     <ol class="breadcrumb">
                        <li><a href="${contextRoot}/home">Home</a></li>
                        <li class="active"> Category</li>
                        <li class="active"> category.name</li>
                    </ol>
                   </c:if>
                </div>
            </div>
            <div class="col-xs-12">
                <table id="productListTable" class="table table-striped table-bordered">
                    <thead>
                      <tr>
                        <th></th>
                        <th>Name</th>
                        <th>Brand</th>
                         <th>Price</th>
                         <th>Qty.Available</th>
                         <th></th>
                       </tr>
                    </thead>
                    <tfoot>
                      <tr>
                        <th></th>
                        <th>Name</th>
                        <th>Brand</th>
                        <th>Price</th>
                        <th>Qty.Available</th>
                        <th></th>
                       </tr>
                    </tfoot>
                </table>
            </div>
        </div>
    </div>
</div>