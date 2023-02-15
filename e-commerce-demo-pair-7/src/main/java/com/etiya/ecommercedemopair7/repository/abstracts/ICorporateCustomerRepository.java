package com.etiya.ecommercedemopair7.repository.abstracts;

import com.etiya.ecommercedemopair7.entities.concretes.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICorporateCustomerRepository extends JpaRepository<CorporateCustomer, Integer> {
}
