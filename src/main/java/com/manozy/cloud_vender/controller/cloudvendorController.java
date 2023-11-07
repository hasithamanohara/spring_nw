package com.manozy.cloud_vender.controller;

import com.manozy.cloud_vender.model.cloud_vendor;
import com.manozy.cloud_vender.service.service_cloud_vendor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cloudvender")
public class cloudvendorController {
    service_cloud_vendor serviceCloudVendor;

    public cloudvendorController(service_cloud_vendor serviceCloudVendor) {
        this.serviceCloudVendor = serviceCloudVendor;
    }

    //Read specific cloud vendor
    @GetMapping("{vendorId}")
    public cloud_vendor getCloudVendor(@PathVariable("vendorId") String vendorId){
        return serviceCloudVendor.getCloudvendor(vendorId);
   }

    //Read All cloud vendors
    @GetMapping()
    public List<cloud_vendor> getAllcloudVendor(){
        return serviceCloudVendor.getAllCloudvendor();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody cloud_vendor Cloudvendor){
        serviceCloudVendor.createCloudvendor(Cloudvendor);
        return "cloud vendor create successfully";
    }
    @PutMapping
    public String updateCloudVendor (@RequestBody cloud_vendor Cloudvendor){
        serviceCloudVendor.updateCloudvendor(Cloudvendor);
        return "cloud vendor updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        serviceCloudVendor.deleteCloudvendor(vendorId);
        return "cloud vendor deleted successfully";
    }
}
