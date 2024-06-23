package dev.sytnikov.java_backend.presentation;

import dev.sytnikov.java_backend.application.product.IProductService;
import dev.sytnikov.java_backend.domain.product.Product;
import dev.sytnikov.java_backend.infrastructure.IProductJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @Autowired
    private IProductService _productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return _productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        _productService.createProduct(product);
        return product;
    }
}
