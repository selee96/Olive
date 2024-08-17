package com.example.olive.domain;

import com.example.olive.type.PayMethodType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class OrderProduct {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private OliveUser oliveUser;

    @ManyToOne
    private Product product;

    @Enumerated(EnumType.STRING)
    private PayMethodType payMethodType;

    private Long amountPaid;
    private String address;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
