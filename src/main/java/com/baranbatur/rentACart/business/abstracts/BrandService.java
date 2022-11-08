package com.baranbatur.rentACart.business.abstracts;

import com.baranbatur.rentACart.business.requests.CreateBrandRequest;
import com.baranbatur.rentACart.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getALl();

    void add(CreateBrandRequest createBrandRequest);
}
