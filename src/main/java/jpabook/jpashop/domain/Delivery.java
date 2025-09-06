package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) //ORDINAL 쓰면 숫자로 들어감 (근데 새로운 이넘이 추가되면 숫자가 밀려서 안좋음)
    private DeliveryStatus status; // READY, COMP

}
