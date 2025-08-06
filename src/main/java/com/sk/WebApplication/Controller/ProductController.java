package com.sk.WebApplication.Controller;

import com.sk.WebApplication.Model.Product;
import com.sk.WebApplication.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> product()
    {
        return service.getData();
    }

    @GetMapping("/products/{prodid}")
    public Product getid(@PathVariable int prodid)
    {
        return service.getprodid(prodid);
    }

    @PostMapping("/products")
    public void getprod(@RequestBody Product prod)
    {
        service.addprod(prod);
    }

    @PutMapping("/products")
    public void updateprod(@PathVariable Product prod)
    {
        service.updateprod(prod);
    }

    @DeleteMapping("/products/{id}")
    public void deleteprod(@PathVariable int id)
    {
        service.deleteprod(id);
    }
}
