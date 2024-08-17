package com.example.olive.service;

import com.example.olive.domain.OliveUser;
import com.example.olive.domain.OrderProduct;
import com.example.olive.domain.Product;
import com.example.olive.dto.Order;
import com.example.olive.dto.OrderProductDto;
import com.example.olive.exception.OrderProductException;
import com.example.olive.repository.OliveUserRepository;
import com.example.olive.repository.OrderRepository;
import com.example.olive.repository.ProductRepository;
import com.example.olive.type.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderProductService {
    private final ProductRepository productRepository;
    private final OliveUserRepository oliveUserRepository;
    private final OrderRepository orderRepository;

    /**
     * 사용자가 있는지 조회
     * 상품이 있는지 조회
     * 주문정보 저장
     */
    @Transactional
    public OrderProductDto orderProduct(Order.Request request) {
        OliveUser oliveUser = oliveUserRepository.findById(request.getOliveUserId())
                .orElseThrow(() -> new OrderProductException(ErrorCode.USER_NOT_FOUND));

        Product product = productRepository.findById(request.getProductId())
                .orElseThrow(() -> new OrderProductException(ErrorCode.PRODUCT_NOT_FOUND));

        return OrderProductDto.fromEntity(
                orderRepository.save(OrderProduct.builder()
                .oliveUser(oliveUser)
                .product(product)
                .payMethodType(request.getPayMethodType())
                .amountPaid(request.getAmountPaid())
                .address(request.getAddress())
                .createdAt(LocalDateTime.now())
                .build()));
    }

}
