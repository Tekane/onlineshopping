/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;

import net.PTSonlineshoppingback_end.model.Category;
import net.PTSonlineshoppingback_end.model.Product;
import net.PTSonlineshoppingback_end.services.CategoryService;
import net.PTSonlineshoppingback_end.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author tphasha
 */
@Controller
public class IndexController {
    private static  final Logger LOGGER =  LoggerFactory.getLogger(IndexController.class);
   
    private final CategoryService categoryService;
    private final ProductService productService;
    
    @Autowired
    public IndexController(CategoryService categoryService,ProductService productService) {
        this.categoryService = categoryService;
        this.productService  =  productService;
    }
    
    @GetMapping(value = {"/","home"})
    public ModelAndView home(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickHome",true);
        modelAndView.addObject("title","Home");
        LOGGER.info("Inside PageController index method - INFO");
        LOGGER.debug("Inside PageController index method - DEBUG");
        //Passing the list of categories
        modelAndView.addObject("categories", this.categoryService.displayCategories());
        modelAndView.setViewName("/views/home");
        return modelAndView;
    }
    @GetMapping(value = "/about")
    public ModelAndView about(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickAbout",true);
        modelAndView.addObject("title","About Us");
        modelAndView.setViewName("/views/home");
        return modelAndView;
    }
    @GetMapping(value = "/contact")
    public ModelAndView contact(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickContact",true);
        modelAndView.addObject("title","Contact Us");
        modelAndView.setViewName("/views/home");
        return modelAndView;
    }
    //Mothod to load all the products based on category
    @GetMapping(value = {"/show/all/products"})
    public ModelAndView showAllProductByCategory(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("title","All Products");
        modelAndView.addObject("userClickAllProducts", true);
        //Passing the list of categories
        modelAndView.addObject("categories", this.categoryService.displayCategories());
        modelAndView.setViewName("/views/home");
        return modelAndView;
        
    }
    //Method to load all the products based on category
    @GetMapping(value = {"/show/category/{id}/products"})
    public ModelAndView showCategoryProductsById(@PathVariable("id") int id){
        ModelAndView modelAndView =  new ModelAndView();
        //User Category to fetch a single Category
        Category category = null;
        category =  this.categoryService.getCategoryById(id);
        
       // modelAndView.addObject("userClickHome",true);
        modelAndView.addObject("title",category.getName());
        
        //Passing the list of categories
        modelAndView.addObject("categories", this.categoryService.displayCategories());
        modelAndView.addObject("category", category);
        modelAndView.addObject("userClickCategoryProducts", true);
        modelAndView.setViewName("/views/home");
        return modelAndView;
    }
    //For viewing a single product
    @GetMapping(value = "show/{id}/product")
    public ModelAndView getProductByID(@PathVariable int id){ 
        ModelAndView modelAndView =  new ModelAndView("views/home");
        Product product = this.productService.getProductById(id);
        //Update the view count 
        product.setViews(product.getViews() + 1);
        this.productService.updateProduct(product);
        
        modelAndView.addObject("title", product.getName());
        modelAndView.addObject("product", product);
        
        modelAndView.addObject("userClickShowProduct", true);
        return  modelAndView;
    }
}
