package com.paygo.paygo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paygo.paygo.entity.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String>{
    List<Transaction> findByCin(String cin);
}
