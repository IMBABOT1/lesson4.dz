package ru.geekrains.spring1.lesson4.dz.lesson4.dz.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.entities.Product;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.repository.ProductRepository;

@Service
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> findFive(int page, int size){
        return productRepository.findAll(PageRequest.of(page, size));
    }
}
