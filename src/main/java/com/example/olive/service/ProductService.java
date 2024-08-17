package com.example.olive.service;

import com.example.olive.domain.Product;
import com.example.olive.dto.RegisterProduct;
import com.example.olive.repository.ProductRepository;
import com.example.olive.type.ProductState;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    /**
     * 상품 등록
     * @param request
     */
    @Transactional
    public void registerProduct(RegisterProduct.Request request) {
        Product product = Product.builder()
                .productName(request.getProductName())
                .productCategory(request.getProductCategory())
                .storeType(request.getStoreType())
                .price(request.getPrice())
                .quantity(request.getQuantity())
                .productState(ProductState.NORMAL)
                .build();

        productRepository.save(product);
    }

}
