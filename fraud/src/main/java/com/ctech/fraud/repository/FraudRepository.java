package com.ctech.fraud.repository;

import com.ctech.fraud.model.Fraud;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudRepository extends MongoRepository<Fraud, String> {
}
