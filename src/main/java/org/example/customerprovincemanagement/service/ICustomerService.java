package org.example.customerprovincemanagement.service;

import org.example.customerprovincemanagement.model.Customer;
import org.example.customerprovincemanagement.model.Province;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGenerateService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAll(Pageable pageable);
}
