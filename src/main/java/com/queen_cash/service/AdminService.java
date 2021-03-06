package com.queen_cash.service;

import com.queen_cash.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.queen_cash.domain.admin.Administrator;

import java.util.List;
import java.util.Map;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;

    List<Administrator> getAdminList(Map params) {
        return (List<Administrator>) adminRepository.findAll();
    }

    Administrator saveAdmin() {
        return adminRepository.save(new Administrator());
    }
}
