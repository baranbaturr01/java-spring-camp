package com.baranbatur.rentACart.business.concretes;

import com.baranbatur.rentACart.business.abstracts.BrandService;
import com.baranbatur.rentACart.business.requests.CreateBrandRequest;
import com.baranbatur.rentACart.business.responses.GetAllBrandsResponse;
import com.baranbatur.rentACart.dataAccess.abstracts.BrandRepository;
import com.baranbatur.rentACart.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getALl() {

        List<Brand> brands = brandRepository.findAll();

        List<GetAllBrandsResponse> brandsResponse = new ArrayList<>();
        for (Brand brand : brands) {

            GetAllBrandsResponse getAllBrandsResponse = new GetAllBrandsResponse();
            getAllBrandsResponse.setId(brand.getId());
            getAllBrandsResponse.setName(brand.getName());
            brandsResponse.add(getAllBrandsResponse);
        }
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
