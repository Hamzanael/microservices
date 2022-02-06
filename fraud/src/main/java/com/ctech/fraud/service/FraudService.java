package com.ctech.fraud.service;

import com.ctech.fraud.model.Fraud;
import com.ctech.fraud.repository.FraudRepository;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Slf4j
public class FraudService {

    @Autowired
    private FraudRepository fraudRepository;

    public Fraud saveFraud(Fraud fraud) {
        log.debug("Saving New Fraud Agent");
        return fraudRepository.save(fraud);
    }


}
