<%-- 
    Document   : manageProducts
    Created on : 21 Jan 2019, 6:01:36 PM
    Author     : tekane
--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="container">
    <div class="row">
        <div class="col-md-offset-2 col-md-8">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h4>Product Management</h4>
                </div>
                <div  class="panel-body">
                    <!-- Form Elements -->
                    <sf:form class="form-horizontal" modelAttribute="product">
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
                                <select class="form-control" id="categoryId" name="categoryId">
                                    <option value="1">Category One</option>
                                    <option value="1">Category Two</option>
                                </select>
                            </div>
                         </div>

                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <input type="submit" name="submit" id="submit" value="Submit" class="btn btn-primary"/>
                            </div>
                         </div>
                    </sf:form>
            </div>
        </div>
    </div>
</div>