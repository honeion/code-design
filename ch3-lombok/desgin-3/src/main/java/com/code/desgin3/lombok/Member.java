package com.code.desgin3.lombok;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
//@Data  -> equals, toString, setter 문제 등이 있을 수 있음.
public class Member {
    //비영속 상태의 경우 = null
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //객체 생성할때 필수로 받으며 notnull이어야.
    @Column(name="email", nullable = false, updatable = false, unique = true)
    private String email;

    @Column(name="name", nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name="coupon_id")
    @ToString.Exclude       //순환참조되지않도록 제외시킴. 근데 양방향으로 굳이 할필요 있나..
    private List<Coupon> coupons = new ArrayList<>();

    @CreationTimestamp
    @Column(name ="create_at", nullable = false, updatable = false)
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(name ="update_at", nullable = false)
    private LocalDateTime updateAt;
}
