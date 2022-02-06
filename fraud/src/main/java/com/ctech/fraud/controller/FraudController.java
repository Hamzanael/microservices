package com.ctech.fraud.controller;


import com.ctech.fraud.model.Fraud;
import com.ctech.fraud.service.FraudService;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/fraud")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FraudController {
    @Autowired
    private FraudService fraudService;

    @PostMapping
    public Fraud saveFraud(@RequestBody Fraud fraud) {
        System.out.println(LocalDate.now());
        return fraudService.saveFraud(fraud);
    }

}
