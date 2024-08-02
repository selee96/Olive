package com.example.olive.dto;

import com.example.olive.domain.Product;
import com.example.olive.type.ProductCategory;
import com.example.olive.type.StoreType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long productId;
    private StoreType storeType;
    private String productName;
    private ProductCategory productCategory;
    private Long price;
    private Long quantity;

    private LocalDateTime registeredAt;
    private LocalDateTime unRegisteredAt;

    public static ProductDto fromEntity(Product product) {
        return ProductDto.builder()
                .productId(product.getId())
                .storeType(product.getStoreType())
                .productName(product.getProductName())
                .productCategory(product.getProductCategory())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .build();
    }
}
