package com.erp.service.impl;

import com.erp.mapper.UserMapper;
import com.erp.model.User;
import com.erp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getList() {
        User user=new User();
        user.setBranchId(14);
        return userMapper.select(user);
    }
}
