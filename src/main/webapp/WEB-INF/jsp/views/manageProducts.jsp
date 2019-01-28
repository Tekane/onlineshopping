<%-- 
    Document   : manageProducts
    Created on : 21 Jan 2019, 6:01:36 PM
    Author     : tekane
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
    <div class="row">
        <c:if test="${not empty message}">
            <div class="alert  alert-success alert-dismissible">
                <button type="bitton" class="close" data-dismiss="alert" >&times;</button>
                ${message}
            </div>
        </c:if>
        <div col="col-xs-12"></div>
        <div class="col-md-offset-2 col-md-8">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>Product Management</h4>
                </div>
                <div  class="panel-body">
                    <!-- Form Elements -->
                    <sf:form class="form-horizontal" modelAttribute="product" action="${contexRoot}/manage/products"
                             method="POST">
                        <div class="form-group">
                            <label class="control-label col-md-4">Enter Product Name:</label>
                            <div class="col-md-8">
                                <sf:input type="text" path="name" id="name" placeholder="Product Name" class="form-control"/>
                                <em class="help-block">Please Enter Product Name</em>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="control-label col-md-4">Enter Brand Name:</label>
                            <div class="col-md-8">
                                <sf:input type="text" path="brand" id="brand" placeholder="Brand Name" class="form-control"/>
                                <em class="help-block">Please Enter brand Name!</em>
                            </div>
                         </div>
                        
                        <div class="form-group">
                            <label class="control-label col-md-4" for="description">Product Description:</label>
                            <div class="col-md-8">
                                <sf:textarea path="description" id="description" placeholder="Write a description" class="form-control"></sf:textarea>
                            </div>
                         </div>
                        
                         <div class="form-group">
                              <label class="control-label col-md-4" for="unitPrice">Enter Unit Price:</label>
                            <div class="col-md-8">
                                <sf:input type="number" path="unitPrice" id="unitPrice" placeholder="Unit Price In &#82" class="form-control"/>
                                <em class="help-block">Please Enter brand Name!</em>
                            </div>
                         </div>
                        
                        <div class="form-group">
                              <label class="control-label col-md-4" for="quantity">Quantity Available:</label>
                            <div class="col-md-8">
                                <sf:input type="number" path="quantity" id="quantity" placeholder="Quantity Available" class="form-control"/>
                                <em class="help-block">Please Enter brand Name!</em>
                            </div>
                         </div>
                        
                        <div class="form-group">
                            <label class="control-label col-md-4" for="categoryId">Select Category:</label>
                            <div class="col-md-8">
                                <sf:select class="form-control" id="categoryId" path="categoryId"
                                   items="${categories}"
                                   itemLabel="name"
                                   itemValue="id"
                                  />
                            </div>
                         </div>

                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <input type="submit" name="submit" id="submit" value="Submit" class="btn btn-primary"/>
                                <!--Hiddern fields for products-->
                                <%--   <sf:hidden path="id"/>
                                <sf:hidden path="code"/>
                                <sf:hidden path="supplierId"/>
                                <sf:hidden path="active"/>
                                <sf:hidden path="purchase"/>
                                <sf:hidden path="views"/>--%>
                            </div>
                         </div>
                    </sf:form>
            </div>
        </div>
    </div>
</div>