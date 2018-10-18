/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author tphasha
 */
@Controller
public class IndexController {
    @Value("${application.message}")
    private String message;
    
    @RequestMapping(value = {"/","home"} , method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("message",message);
        modelAndView.setViewName("home");
        return modelAndView;
    }

}
