package com.eventotec.api.domain.coupon;

import com.eventotec.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;


@Table(name = "coupon")
@Entity
@Getter
@Setter
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private String discount;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}

