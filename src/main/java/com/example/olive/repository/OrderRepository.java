package com.example.olive.repository;

import com.example.olive.domain.OrderProduct;
import com.example.olive.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderProduct, Long> {

}
