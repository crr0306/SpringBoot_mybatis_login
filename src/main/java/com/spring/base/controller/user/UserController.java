package com.spring.base.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.spring.base.bean.User;
import com.spring.base.controller.other.req.ReqCreateQrCodeDto;
import com.spring.base.service.UserService;
import com.spring.base.utils.QrCodeUtils;
import com.spring.base.utils.RedisUtil;
import com.spring.base.utils.UUIDUtils;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 *
 */

@RestController
@RequestMapping("/user")
@Api(value = "user接口")
public class UserController {

    public static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private RedisUtil redisUtil;

    @PostMapping("/login")
    public String login() {
        logger.info("login");
        String token= UUIDUtils.getUUID();
        redisUtil.set("token",token);
        JSONObject result = new JSONObject();
        result.put("token", token);
        result.put("returnCode", "200");
        return result.toJSONString();
    }



}
