package com.baranbatur.rentACart.business.concretes;

import com.baranbatur.rentACart.business.abstracts.BrandService;
import com.baranbatur.rentACart.dataAccess.abstracts.BrandRepository;
import com.baranbatur.rentACart.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getALl() {
        return brandRepository.getAll();
    }
}
