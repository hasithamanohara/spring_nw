package com.manozy.cloud_vender.controller;

import com.manozy.cloud_vender.model.cloud_vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cloudvender")
public class cloudAPIController {
    cloud_vendor Cloudvendor;
    @GetMapping("/getVendor")
    public cloud_vendor getCloudVendor(String vendorId){
        return Cloudvendor;
//                new cloud_vendor;
//                ("c","vendor1",
//                   "address1","071");
    }
    @PostMapping
    public String createCloudVendor(@RequestBody cloud_vendor Cloudvendor){
        this.Cloudvendor = Cloudvendor;
        return "succes";
    }
}
