package com.example.olive.service;

import com.example.olive.domain.Product;
import com.example.olive.dto.ProductDto;
import com.example.olive.repository.ProductRepository;
import com.example.olive.type.ProductCategory;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.example.olive.type.ProductState.NORMAL;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public ProductDto registerProduct(
            String productName,
            ProductCategory productCategory,
            Long price,
            Long quantity
    ) {
        
        return ProductDto.fromEntity(
                productRepository.save(Product.builder()
                        .productName(productName)
                        .productCategory(productCategory)
                        .price(price)
                        .quantity(quantity)
                        .productState(NORMAL)
                        .createdAt(LocalDateTime.now())
                        .updatedAt(LocalDateTime.now())
                        .build())
        );

    }
}
