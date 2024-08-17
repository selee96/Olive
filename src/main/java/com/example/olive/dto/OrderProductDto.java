package com.example.olive.dto;

import com.example.olive.domain.OrderProduct;
import com.example.olive.type.PayMethodType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderProductDto {
    private Long oliveUserId;
    private Long productId;
    private PayMethodType payMethodType;
    private Long amountPaid;
    private String address;

    public static OrderProductDto fromEntity(OrderProduct orderProduct) {
        return OrderProductDto.builder()
                .oliveUserId(orderProduct.getOliveUser().getId())
                .productId(orderProduct.getProduct().getId())
                .payMethodType(orderProduct.getPayMethodType())
                .amountPaid(orderProduct.getAmountPaid())
                .address(orderProduct.getAddress())
                .build();
    }
}
