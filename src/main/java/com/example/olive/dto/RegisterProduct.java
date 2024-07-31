package com.example.olive.dto;

import com.example.olive.type.ProductCategory;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

public class RegisterProduct {

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request {
        @NotNull
        @Min(1)
        private Long productId;

        @NotNull
        private String productName;

        @NotNull
        private ProductCategory productCategory;

        @NotNull
        @Min(0)
        private Long price;

        @NotNull
        @Min(0)
        private Long quantity;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private Long productId;
        private String productName;
        private ProductCategory productCategory;
        private Long price;
        private Long quantity;

        public static Response fromEntity(ProductDto productDto) {
            return Response.builder()
                    .productId(productDto.getProductId())
                    .productName(productDto.getProductName())
                    .productCategory(productDto.getProductCategory())
                    .price(productDto.getPrice())
                    .quantity(productDto.getQuantity())
                    .build();
        }
    }

}
