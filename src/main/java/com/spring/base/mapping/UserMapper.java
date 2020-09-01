package com.spring.base.mapping;


import com.spring.base.bean.User;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {

    User Sel(@Param("id") int id);
}