package dev.sytnikov.java_backend.infrastructure;

import dev.sytnikov.java_backend.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IProductJpaRepo extends JpaRepository<Product, UUID> {
}
