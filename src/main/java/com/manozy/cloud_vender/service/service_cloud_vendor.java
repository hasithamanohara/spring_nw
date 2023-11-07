package com.manozy.cloud_vender.service;

import com.manozy.cloud_vender.model.cloud_vendor;

import java.util.List;

public interface service_cloud_vendor {
    public String createCloudvendor(cloud_vendor Cloudvendor);
    public String updateCloudvendor(cloud_vendor Cloudvendor);
    public String deleteCloudvendor(String cloudvendorId);
    public cloud_vendor getCloudvendor(String cloudvendorID);
    public List<cloud_vendor> getAllCloudvendor();
}
