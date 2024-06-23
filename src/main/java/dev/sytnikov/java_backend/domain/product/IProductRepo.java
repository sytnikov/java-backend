package dev.sytnikov.java_backend.domain.product;

import java.util.List;

public interface IProductRepo {
    public Product save(Product product);
    public List<Product> findAll();
}
