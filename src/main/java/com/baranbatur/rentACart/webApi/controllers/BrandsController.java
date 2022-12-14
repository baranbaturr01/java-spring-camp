package com.baranbatur.rentACart.webApi.controllers;

import com.baranbatur.rentACart.business.abstracts.BrandService;
import com.baranbatur.rentACart.business.requests.CreateBrandRequest;
import com.baranbatur.rentACart.business.responses.GetAllBrandsResponse;
import com.baranbatur.rentACart.entities.concretes.Brand;
import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll() {

        return brandService.getALl();
    }

    @PostMapping(name = "/add")
    public void add(CreateBrandRequest createBrandRequest) {
        brandService.add(createBrandRequest);

    }
}

