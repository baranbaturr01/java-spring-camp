package com.baranbatur.rentACart.dataAccess.abstracts;

import com.baranbatur.rentACart.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
