package ru.geekrains.spring1.lesson4.dz.lesson4.dz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.entities.Product;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.repository.ProductRepository;

import java.util.List;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/min")
    @ResponseBody
    public List<Product> findMin(){
        List<Product> products = productRepository.findAllByCostGreaterThanOrderByCostAsc(1);
        return products;
    }
}
