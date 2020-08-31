package com.spring.base.intercepter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HeaderTokenInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(HeaderTokenInterceptor.class);
//    @Autowired
//    private ICacheService iCacheService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("HeaderTokenInterceptor.preHandle:::uri, tag, loginToken: {}, {}, {}", request.getRequestURI(), request.getHeader("tag"), request.getHeader("loginToken"));
        String loginToken = request.getHeader("loginToken");
//        if (StringUtils.isEmpty(loginToken)) {
//            setResult(response, ServiceError.MISS_TOKEN.getCode(), ServiceError.MISS_TOKEN.getMsg());
//            return false;
//        }
//        String tag = request.getHeader(Constant.HEADER_LABEL);
//        String tokenPrifix = Constant.HEADER_VALUE.equals(tag) ? Constant.TOKEN_APP_PRIFIX : Constant.TOKEN_WEB_PRIFIX;
//        String phonePrifix = Constant.HEADER_VALUE.equals(tag) ? Constant.PHONE_APP_PRIFIX : Constant.PHONE_WEB_PRIFIX;
//        int expireTime = Constant.HEADER_VALUE.equals(tag) ? Constant.APP_EXPIRE_TIME : Constant.WEB_EXPIRE_TIME;
//        String redisUserInfo = iCacheService.getString(tokenPrifix + loginToken);
//        if (StringUtils.isEmpty(redisUserInfo)) {
//            setResult(response, ServiceError.SESSION_EXPIRE.getCode(), ServiceError.SESSION_EXPIRE.getMsg());
//            return false;
//        }
//
//        request.setAttribute("currentUser", redisUserInfo);
//        iCacheService.expire(tokenPrifix + loginToken, expireTime);
//        iCacheService.expire(phonePrifix + redisUserInfo.split(":")[1], expireTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug("HeaderTokenInterceptor.postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.debug("HeaderTokenInterceptor.afterCompletion...");
    }

    private void setResult(HttpServletResponse response, String errorCode, String errorMessage) throws IOException {
        String type = "application/json; charset=UTF-8";
        response.setContentType(type);
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
//        Result<Object> result = new Result<>();
//        result.setReturnCode(errorCode);
//        result.setReturnMessage(errorMessage);
//        writer.write(result.toJSONString());
        writer.flush();
        writer.close();
    }

}
