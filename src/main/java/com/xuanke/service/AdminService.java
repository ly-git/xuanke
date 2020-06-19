package com.xuanke.service;

import com.xuanke.entity.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> getAll();

    List<Admin> getAllAdmin();

    boolean validateAdmin(String username, String password);
}
