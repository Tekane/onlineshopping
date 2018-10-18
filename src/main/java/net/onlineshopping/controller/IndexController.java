/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author tphasha
 */
@Controller
public class IndexController {
    
    @RequestMapping(value = {"/","home"} , method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("message","Phasha"+" ke boss");
        return modelAndView;
    }
    @RequestMapping(value = "/test" )
    public ModelAndView test(@RequestParam("greeting") String greeting){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("message",greeting);
        return modelAndView;
    }
  
}