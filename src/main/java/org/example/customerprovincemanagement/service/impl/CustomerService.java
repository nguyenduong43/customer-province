package org.example.customerprovincemanagement.service.impl;

import org.example.customerprovincemanagement.model.Customer;
import org.example.customerprovincemanagement.model.Province;
import org.example.customerprovincemanagement.repository.ICustomerRepository;
import org.example.customerprovincemanagement.service.ICustomerService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    private final ICustomerRepository iCustomerRepository;
    public CustomerService(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }
    @Override
    public Iterable<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);

    }

    @Override
    public Optional<Customer> findById(Long id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.deleteById(id);

    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return iCustomerRepository.findAllByProvince(province);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }
}
