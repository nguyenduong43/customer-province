package org.example.customerprovincemanagement.service.impl;

import org.example.customerprovincemanagement.model.Province;
import org.example.customerprovincemanagement.repository.IProvinceRepository;
import org.example.customerprovincemanagement.service.IProvinceService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProvinceService implements IProvinceService{
    private final IProvinceRepository iProvinceRepository;
    public ProvinceService(IProvinceRepository iProvinceRepository) {
        this.iProvinceRepository = iProvinceRepository;
    }

    @Override
    public Iterable<Province> findAll() {
        Iterable<Province> provinces = iProvinceRepository.findAll();
        return provinces;
    }

    @Override
    public void save(Province province) {
        iProvinceRepository.save(province);

    }

    @Override
    public Optional<Province> findById(Long id) {
        return iProvinceRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iProvinceRepository.deleteById(id);
    }
}
