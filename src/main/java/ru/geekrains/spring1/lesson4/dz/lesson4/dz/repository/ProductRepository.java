package ru.geekrains.spring1.lesson4.dz.lesson4.dz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekrains.spring1.lesson4.dz.lesson4.dz.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByCostGreaterThanOrderByCostAsc(int cost);
    List<Product> findAllByCostLessThanOrderByCostDesc(int cost);
}
