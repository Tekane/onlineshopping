/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;

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
    @RequestMapping(value = {"/","home"} , method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickHome",true);
        modelAndView.addObject("title","Home");
        modelAndView.setViewName("/views/home");
        return modelAndView;
    }
    @RequestMapping(value = {"/about"} , method = RequestMethod.GET)
    public ModelAndView about(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickAbout",true);
        modelAndView.addObject("title","About Us");
        modelAndView.setViewName("/views/home");
        return modelAndView;
    }
    @RequestMapping(value = {"/contact"} , method = RequestMethod.GET)
    public ModelAndView contact(){
        ModelAndView modelAndView =  new ModelAndView();
        modelAndView.addObject("userClickContact",true);
        modelAndView.addObject("title","Contact Us");
        modelAndView.setViewName("/views/home");
        return modelAndView;
    }
}
