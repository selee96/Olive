package com.example.olive.dto;

import com.example.olive.type.PayMethodType;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Order {
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request {
        @NotNull
        @Min(1)
        private Long oliveUserId;

        @NotNull
        @Min(1)
        private Long productId;

        @NotNull
        private PayMethodType payMethodType;

        @NotBlank
        @Min(0)
        private Long amountPaid;
        @NotBlank
        private String address;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private Long oliveUserId;
        private Long productId;
        private PayMethodType payMethodType;
        private Long amountPaid;
        private String address;

        public static Response from(OrderProductDto orderProductDto) {
            return Response.builder()
                    .oliveUserId(orderProductDto.getOliveUserId())
                    .productId(orderProductDto.getProductId())
                    .payMethodType(orderProductDto.getPayMethodType())
                    .amountPaid(orderProductDto.getAmountPaid())
                    .address(orderProductDto.getAddress())
                    .build();
        }
    }
}

