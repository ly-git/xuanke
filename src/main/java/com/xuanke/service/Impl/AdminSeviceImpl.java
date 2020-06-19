package com.xuanke.service.Impl;

import com.xuanke.entity.Admin;
import com.xuanke.entity.AdminExample;
import com.xuanke.mapping.AdminMapper;
import com.xuanke.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminSeviceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;
    @Override
    public List<Admin> getAll() {
        AdminExample adminExample=new AdminExample();
        return adminMapper.selectByExample(adminExample);
    }

    @Override
    public List<Admin> getAllAdmin() {
        AdminExample adminExample=new AdminExample();
        return adminMapper.selectByExample(adminExample);
    }

    @Override
    public boolean validateAdmin(String username, String password) {
        AdminExample adminExample=new AdminExample();
        adminExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<Admin> ad=adminMapper.selectByExample(adminExample);
        return ad.size()>0?true:false;
    }
}
