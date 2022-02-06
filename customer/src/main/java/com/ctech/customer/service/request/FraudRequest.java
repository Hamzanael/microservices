package com.ctech.customer.service.request;

import java.util.Date;


public record FraudRequest(
        String id,
        String name,
        Date date) {
}
