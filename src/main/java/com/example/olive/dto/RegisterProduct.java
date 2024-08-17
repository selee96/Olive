package com.example.olive.dto;

import com.example.olive.type.ProductCategory;
import com.example.olive.type.StoreType;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class RegisterProduct {

    @Getter
    @Setter
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
        private String productName;
        private ProductCategory productCategory;
        private StoreType storeType;
        private Long price;
        private Long quantity;
        private LocalDateTime registeredAt;
    }

}
