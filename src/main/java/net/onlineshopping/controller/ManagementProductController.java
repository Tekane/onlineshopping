/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;

import java.util.List;
import net.PTSonlineshoppingback_end.model.Category;
import net.PTSonlineshoppingback_end.model.Product;
import net.PTSonlineshoppingback_end.repository.CategoryRepository;
import net.PTSonlineshoppingback_end.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author tekane
 */
@Controller
@RequestMapping("/manage")
public class ManagementProductController {
    
    private  final CategoryRepository categoryRepository;
    private  final ProductRepository productRepository;

    @Autowired
    public ManagementProductController(CategoryRepository categoryRepository,ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }
    
    
    @GetMapping(value = "/products")
    public ModelAndView showManageProducts(@RequestParam(name = "operation" , required = false) String operation){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickManageProducts", true);
        modelAndView.addObject("title", "Manage Products");
        modelAndView.setViewName("/views/home");
        
        Product product =  new Product();
        product.setSuppliedId(1);
        product.setActive(true);
        modelAndView.addObject("product", product);
        if (operation != null) {
            if (operation.equals("product")) {
                modelAndView.addObject("message", "Product Submited Successfully");
            }
        }
       
        return  modelAndView;
    }
    @ModelAttribute("categories")
    public List<Category> getCategories(){
        return this.categoryRepository.findAll();
    }
    //Handling product submission
    @PostMapping(value = "/products")
    public String handleProductSubmission(@ModelAttribute("product") Product product){
        //Create a new product
        this.productRepository.save(product);
        return "redirect:/manage/products?operation=product";
    }
    
}
