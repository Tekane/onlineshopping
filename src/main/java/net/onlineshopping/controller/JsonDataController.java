/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.onlineshopping.controller;
import java.util.List;
import net.PTSonlineshoppingback_end.model.Product;
import net.PTSonlineshoppingback_end.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author tekane
 */
@RestController
@RequestMapping(value={"/api"})
public class JsonDataController {
    private final ProductService productService;

    @Autowired
    public JsonDataController(ProductService productService) {
        this.productService = productService;
    }
    
    @RequestMapping(value = "/allProducts")
    @ResponseBody
    public List<Product> getActiveProducts(){
        List<Product> products =  this.productService.getActiveProducts();
        return products;
    }
    @GetMapping("/category/{id}/products")
    @ResponseBody
    public List<Product> getActiveProductsByCategoryId(@PathVariable("id") int id){
        List<Product> products =  this.productService.getActiveProductsByCategoryId(id);
        return  products;
    }
}
