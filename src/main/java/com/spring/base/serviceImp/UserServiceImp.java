package com.spring.base.serviceImp;




import com.spring.base.bean.User;
import com.spring.base.mapping.UserMapper;
import com.spring.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}