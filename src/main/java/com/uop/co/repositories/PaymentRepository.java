package com.uop.co.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uop.co.models.repositoryModels.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
