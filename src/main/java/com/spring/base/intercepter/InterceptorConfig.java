package com.spring.base.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getHeaderTokenInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/sendSms",
                        "/admin/**"
                        );
        registry.addInterceptor(getParamTokenInterceptor())
                .addPathPatterns("/audio/**")
                .addPathPatterns("/usertext/**");
        registry.addInterceptor(getAdminTokenInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin/login")
                .excludePathPatterns("/admin/sendSms")
                .excludePathPatterns("/admin/addAccount");
        super.addInterceptors(registry);
    }

    @Bean
    public HeaderTokenInterceptor getHeaderTokenInterceptor() {
        return new HeaderTokenInterceptor();
    }

    @Bean
    public ParamTokenInterceptor getParamTokenInterceptor() {
        return new ParamTokenInterceptor();
    }

    @Bean
    public AdminTokenInterceptor getAdminTokenInterceptor() {
        return new AdminTokenInterceptor();
    }
}
