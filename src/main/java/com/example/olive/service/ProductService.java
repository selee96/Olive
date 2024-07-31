package com.example.olive.service;

import com.example.olive.domain.Product;
import com.example.olive.dto.ProductDto;
import com.example.olive.repository.ProductRepository;
import com.example.olive.type.ProductCategory;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public ProductDto registerProduct(
            Long productId,
            String productName,
            ProductCategory productCategory,
            Long price,
            Long quantity
    ) {
        return ProductDto.fromEntity(
                productRepository.save(Product.builder()
                        .productName(productName)
                        .registeredAt(LocalDateTime.now())
                        .productCategory(ProductCategory.MASK_PACK)
                        .price(30000L)
                        .build())
        );

    }
}
