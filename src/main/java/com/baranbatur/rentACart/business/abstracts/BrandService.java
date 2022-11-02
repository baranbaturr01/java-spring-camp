package com.baranbatur.rentACart.business.abstracts;

import com.baranbatur.rentACart.entities.concretes.Brand;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface BrandService {
    List<Brand> getALl();
}
