package com.sk.WebApplication.Service;

import com.sk.WebApplication.Model.Product;
import com.sk.WebApplication.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
     ProductRepo repo;

    public List<Product> getData()
    {
        return repo.findAll();
    }

    public Product getprodid(int prodid) {
        return repo.findById(prodid)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + prodid));
    }


    public void addprod(Product prod)
    {
        repo.save(prod);
    }

    public void updateprod(Product prod) {
        repo.save(prod);
    }

    public void deleteprod(int id) {
        repo.deleteById(id);
    }
}
