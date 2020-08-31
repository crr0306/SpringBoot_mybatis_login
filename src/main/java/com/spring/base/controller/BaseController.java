package com.spring.base.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @Autowired
    protected HttpServletRequest request;

    private String getCurrentUser() {
        return (String) request.getAttribute("currentUser");
    }

    protected String getToken() {
        return request.getHeader("loginToken");
    }

    protected Long getCurrentUserId() {
        String redisUserInfo = getCurrentUser();
        return StringUtils.isEmpty(redisUserInfo) ? null : Long.parseLong(redisUserInfo.split(":")[0]);
    }

    protected String getCurrentPhone() {
        String redisUserInfo = getCurrentUser();
        return StringUtils.isEmpty(redisUserInfo) ? null : redisUserInfo.split(":")[1];
    }
}
