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
import net.onlineshopping.beans.FileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
/**
 *
 * @author tekane
 */
@Controller
@RequestMapping("/manage")
public class ManagementProductController {
    private final CategoryService categoryService;
    private final ProductService  productService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ManagementProductController.class);
    @Autowired
    public ManagementProductController(CategoryService categoryService , ProductService  productService) {
        this.categoryService = categoryService;
        this.productService  = productService;
    }

    @GetMapping(value = "/products")
    public ModelAndView showManageProducts(@RequestParam(value = "operation" , required = false) String operation ){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickManageProducts", true);
        modelAndView.addObject("title", "Manage Products");
        modelAndView.setViewName("/views/home");
        
        Product product =  new Product();
        product.setSuppliedId(1);
        product.setActive(true);
        modelAndView.addObject("product", product);
        if (operation != null){
            if (operation.equals("product")){
                modelAndView.addObject("message","Product Submitted Successfully");
            }
        }
        return  modelAndView;
    }
    //Handling product submission
    @PostMapping(value = "/products")
    public String productSubmission(@Valid @ModelAttribute("product") Product product , BindingResult bindingResult , Model model,
    HttpServletRequest request){

        if (bindingResult.hasErrors()){
            model.addAttribute("userClickManageProducts", true);
            model.addAttribute("title", "Manage Products");
            model.addAttribute("message","Validation failed!");
            return "views/home";
        }
        LOGGER.info(product.toString());
        //Create a new product
        product.setActive(true);
        this.productService.createProduct(product);
        if (!product.getMultipartFile().getOriginalFilename().equals("")){
            FileUpload.uploadFile(request,product.getMultipartFile(),product.getCode());
        }
        return "redirect:/manage/products?operation=product";
    }
    //returning categories for all the request mapping
    @ModelAttribute("categories")
    public List<Category> getCategories(){
        return this.categoryService.getCategories();
    }

}
