package com.example.olive.exception;

import com.example.olive.type.ErrorCode;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProductException extends RuntimeException {
    private ErrorCode errorCode;
    private String errorMessage;

    public OrderProductException(ErrorCode errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = errorCode.getDescription();
    }
}
