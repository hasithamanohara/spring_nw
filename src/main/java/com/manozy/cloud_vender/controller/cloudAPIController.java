package com.manozy.cloud_vender.controller;

import com.manozy.cloud_vender.model.cloud_vendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cloudvender")
public class cloudAPIController {
    @GetMapping("/getVendor")
    public cloud_vendor getCloudVendor(String vendorId){
        return new cloud_vendor("c","vendor1",
                   "address1","071");
    }
}
