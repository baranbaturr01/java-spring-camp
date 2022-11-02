package com.baranbatur.rentACart.dataAccess.concretes;

import com.baranbatur.rentACart.dataAccess.abstracts.BrandRepository;
import com.baranbatur.rentACart.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "Toyota"));
        brands.add(new Brand(2, "Honda"));
        brands.add(new Brand(3, "Nissan"));
        brands.add(new Brand(4, "Mitsubishi"));
        brands.add(new Brand(5, "Suzuki"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
