package dev.sytnikov.java_backend.infrastructure;

import dev.sytnikov.java_backend.domain.product.IProductRepo;
import dev.sytnikov.java_backend.domain.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo implements IProductRepo {

    @Autowired
    private IProductJpaRepo _productRepo;

    @Override
    public Product save(Product product) {
        return _productRepo.save(product);
    }

    @Override
    public List<Product> findAll() {
        return _productRepo.findAll();
    }
}
