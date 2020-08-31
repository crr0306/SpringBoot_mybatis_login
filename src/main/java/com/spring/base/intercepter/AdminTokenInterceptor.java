package com.spring.base.intercepter;


import com.spring.base.utils.Constant;
import com.spring.base.utils.errorcode.ServiceError;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdminTokenInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(AdminTokenInterceptor.class);
//    @Autowired
//    private ICacheService cacheService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("HeaderTokenInterceptor.preHandle:::uri, loginToken: {}, {}", request.getRequestURI(), request.getHeader("loginToken"));
        String loginToken = request.getHeader("loginToken");
        if (StringUtils.isEmpty(loginToken)) {
            setResult(response, ServiceError.MISS_TOKEN.getCode(), ServiceError.MISS_TOKEN.getMsg());
            return false;
        }
//        String redisAdminInfo = cacheService.getString(Constant.ADMIN_TOKEN_PRIFIX + loginToken);
//        if (StringUtils.isEmpty(redisAdminInfo)) {
//            setResult(response, ServiceError.SESSION_EXPIRE.getCode(), ServiceError.SESSION_EXPIRE.getMsg());
//            return false;
//        }
//
//        request.setAttribute("currentAdmin", redisAdminInfo);
//        cacheService.expire(Constant.ADMIN_TOKEN_PRIFIX + loginToken, Constant.ADMIN_EXPIRE_TIME);
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

    private void setResult(HttpServletResponse response, String errorCode, String errorMessage) throws IOException  {

           String type = "application/json; charset=UTF-8";
           response.setContentType(type);
           response.setCharacterEncoding("UTF-8");
           PrintWriter writer = response.getWriter();
//           Result<Object> result = new Result<>();
//           result.setReturnCode(errorCode);
//           result.setReturnMessage(errorMessage);
//           writer.write(result.toJSONString());
           writer.flush();
           writer.close();


    }

}
