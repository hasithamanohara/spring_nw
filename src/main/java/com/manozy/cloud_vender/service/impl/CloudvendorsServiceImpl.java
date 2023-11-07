package com.manozy.cloud_vender.service.impl;

import com.manozy.cloud_vender.model.cloud_vendor;
import com.manozy.cloud_vender.repo.cloud_vendor_Repo;
import com.manozy.cloud_vender.service.service_cloud_vendor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CloudvendorsServiceImpl implements service_cloud_vendor {

    cloud_vendor_Repo cloudVendorRepo;

    public CloudvendorsServiceImpl(cloud_vendor_Repo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }

    @Override
    public String createCloudvendor(cloud_vendor Cloudvendor) {
        //more business logic
        cloudVendorRepo.save(Cloudvendor);
        return "save success" ;
    }

    @Override
    public String updateCloudvendor(cloud_vendor Cloudvendor) {
        //more business logic
        cloudVendorRepo.save(Cloudvendor);
        return "update success";
    }

    @Override
    public String deleteCloudvendor(String cloudvendorId) {
        //more business logic
        cloudVendorRepo.deleteById(cloudvendorId);
        return "delet succes";
    }

    @Override
    public cloud_vendor getCloudvendor(String cloudvendorID) {
        //more business logic
        return cloudVendorRepo.findById(cloudvendorID).get();
    }

    @Override
    public List<cloud_vendor> getAllCloudvendor() {
        //more business logic
        return cloudVendorRepo.findAll();
    }
}
