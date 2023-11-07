package com.manozy.cloud_vender.repo;

import com.manozy.cloud_vender.model.cloud_vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface cloud_vendor_Repo extends JpaRepository<cloud_vendor, String> {
    //custom method here mysql
}
