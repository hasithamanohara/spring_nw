package com.manozy.cloud_vender.controller;

import com.manozy.cloud_vender.model.cloud_vendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cloudvender")
public class cloudAPIController {
    cloud_vendor Cloudvendor;
    @GetMapping("{vendorId}")
    public cloud_vendor getCloudVendor(String vendorId){
        return new cloud_vendor("c1","vendor1","address1","071");
    }
    @PostMapping
    public String createCloudVendor(@RequestBody cloud_vendor Cloudvendor){
        this.Cloudvendor = Cloudvendor;
        return "succes";
    }
    @PutMapping
    public String updateCloudVendor (@RequestBody cloud_vendor Cloudvendor){
        this.Cloudvendor = Cloudvendor;
        return "updated";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId){
        this.Cloudvendor= null;
        return "deleted";
    }
}
