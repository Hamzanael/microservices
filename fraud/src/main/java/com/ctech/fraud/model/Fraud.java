package com.ctech.fraud.model;

import org.springframework.data.annotation.Id;

import java.util.Date;


public record Fraud(
        @Id
        String id,
        String name,
        Date date) {
}
