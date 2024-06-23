package dev.sytnikov.java_backend.application.product;

import dev.sytnikov.java_backend.domain.product.Product;
import dev.sytnikov.java_backend.infrastructure.IProductJpaRepo;
import dev.sytnikov.java_backend.infrastructure.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private ProductRepo _productRepo;

    @Override
    public Product createProduct(Product product) {
        return _productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return _productRepo.findAll();
    }
}
