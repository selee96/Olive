package com.example.olive.repository;

import com.example.olive.domain.Product;
import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
