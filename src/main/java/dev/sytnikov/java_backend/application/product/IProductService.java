package dev.sytnikov.java_backend.application.product;

import dev.sytnikov.java_backend.domain.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    public Product createProduct(Product product);
    public List<Product> getAllProducts();
}
