package com.sk.WebApplication.Service;

import com.sk.WebApplication.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> list= new ArrayList<>(Arrays.asList(new Product(1,"Mobile", 20000),
    new Product(2,"Laptops",50000),
    new Product(3,"Watches",5000)));

    public List<Product> getData()
    {
        return list;
    }

    public Product getprodid(int prodid) {
        return list.stream()
                .filter(n -> n.getProdid() == prodid )
                .findFirst()
                .get();
    }

    public void addprod(Product prod)
    {
        list.add(prod);
    }

    public void updateprod(Product prod) {
        int ind=0;
        for(int i=0;i< list.size();i++)
            if(list.get(i).getProdid() == prod.getProdid())
                ind=i;
        list.set(ind,prod);
    }

    public void deleteprod(int id) {
        int ind=0;
        for(int i=0;i< list.size();i++)
            if(list.get(i).getProdid() == id)
                ind=i;
        list.remove(ind);
    }
}
