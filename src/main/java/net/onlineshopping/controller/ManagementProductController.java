/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;

import net.PTSonlineshoppingback_end.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author tekane
 */
@Controller
@RequestMapping("/manage")
public class ManagementProductController {
    @GetMapping(value = "/products")
    public ModelAndView showManageProducts(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickManageProducts", true);
        modelAndView.addObject("title", "Manage Products");
        modelAndView.setViewName("/views/home");
        
        Product product =  new Product();
        product.setSuppliedId(1);
        product.setActive(true);
        modelAndView.addObject("product", product);
        
        return  modelAndView;
    }
}
