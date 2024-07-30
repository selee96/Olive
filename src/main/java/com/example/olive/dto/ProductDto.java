package com.example.olive.dto;

import com.example.olive.domain.Product;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long productId;
    private String productName;
    private Long price;

    private LocalDateTime registeredAt;

    public static ProductDto fromEntity(Product product) {
        return ProductDto.builder()
                .build();
    }
}
