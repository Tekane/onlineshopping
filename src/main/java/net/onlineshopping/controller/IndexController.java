/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;

import net.PTSonlineshoppingback_end.model.Category;
import net.PTSonlineshoppingback_end.services.CategoryService;
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
    private final CategoryService categoryService;
    
    @Autowired
    public IndexController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    
    @GetMapping(value = {"/","home"})
    public ModelAndView home(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickHome",true);
        modelAndView.addObject("title","Home");
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
    //Mothod to load all the products based on category
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
}
