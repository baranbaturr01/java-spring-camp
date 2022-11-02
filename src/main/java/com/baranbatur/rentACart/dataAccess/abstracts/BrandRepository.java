package com.baranbatur.rentACart.dataAccess.abstracts;

import com.baranbatur.rentACart.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandRepository {

    List<Brand> getAll();


}
