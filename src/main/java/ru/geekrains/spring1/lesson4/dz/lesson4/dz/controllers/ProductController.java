package ru.geekrains.spring1.lesson4.dz.lesson4.dz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.entities.Product;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.repository.ProductRepository;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.services.ProductService;

import java.util.List;

@Controller
public class ProductController {

    private ProductRepository productRepository;
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/min")
    @ResponseBody
    public List<Product> findMin(){
        List<Product> products = productRepository.findAllByCostGreaterThanOrderByCostAsc(0);
        return products;
    }

    @GetMapping("/max")
    @ResponseBody
    public List<Product> findMax(){
        List<Product> products = productRepository.findAllByCostLessThanOrderByCostDesc(21);
        return products;
    }


    @GetMapping("/five")
    public String five(Model model, @RequestParam(defaultValue = "1", name = "p") Integer page){
        model.addAttribute("products", productService.findFive(page-1, 5));
        return "products";
    }

    @GetMapping("/products")
    public String findAll(Model model){
        model.addAttribute("products", productRepository.findAll());
        return "products";
    }
}
