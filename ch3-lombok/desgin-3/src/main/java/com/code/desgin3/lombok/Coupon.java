package com.code.desgin3.lombok;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="coupon")
@Data
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",updatable = false)
    private Long id;

    @Column(name="used",nullable = false)
    private boolean used;

    @ManyToOne
    @JoinColumn(name="member_id",updatable = false)
    private Member member;

    @CreationTimestamp
    @Column(name="create_at",nullable = false,updatable = false)
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name="update_at",nullable = false)
    private LocalDateTime updateAt;

}
