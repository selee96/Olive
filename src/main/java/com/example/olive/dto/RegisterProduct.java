package com.example.olive.dto;

import com.example.olive.type.ProductCategory;
import com.example.olive.type.StoreType;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RegisterProduct {

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request {
        @NotNull
        private String productName;

        @NotNull
        private ProductCategory productCategory;

        @NotNull
        private StoreType storeType;

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
        private StoreType storeType;
        private String productName;
        private ProductCategory productCategory;
        private Long price;
        private Long quantity;
/*
        public static Response fromEntity(ProductDto productDto) {
            return Response.builder()
                    .productId(productDto.getProductId())
                    .storeType(productDto.getStoreType())
                    .productName(productDto.getProductName())
                    .productCategory(productDto.getProductCategory())
                    .price(productDto.getPrice())
                    .quantity(productDto.getQuantity())
                    .build();
        }
        */
    }

}
