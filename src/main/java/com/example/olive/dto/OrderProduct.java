package com.example.olive.dto;

import com.example.olive.type.PayMethodType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

public class OrderProduct {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request {
        @NotNull
        @Min(1)
        private Long oliveUserId;

        @NotNull
        private List<ProductDto> productDtoList;
        @NotNull
        private PayMethodType payMethodType;
        @NotBlank
        @Min(0)
        private Long totalPrice;
        @NotBlank
        private String address;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private List<ProductDto> productDtoList;
        private PayMethodType payMethodType;
        private Long totalPrice;
        private String address;

        public static Response from(OrderProductDto orderProductDto) {
            return Response.builder()
                    .build();
        }
    }
}