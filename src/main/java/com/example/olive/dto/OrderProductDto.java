package com.example.olive.dto;

import com.example.olive.domain.OliveUser;
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
public class OrderProductDto {
    private Long orderProductId;
    private OliveUser oliveUser;
    private Long totalPrice;
    private String address;

    public static OrderProductDto fromEntity(OrderProduct orderProduct) {
        return OrderProductDto.builder()
                .build();
    }
}
