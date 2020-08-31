package com.spring.base.controller.other;

import com.spring.base.controller.other.req.ReqCreateQrCodeDto;
import com.spring.base.utils.QrCodeUtils;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

/**
 *
 */
@Slf4j
@RestController
@Api(value = "Hello springboot接口")
public class HelloController {


    @PostMapping("/")
    public String index() {
        log.info("hello");
        return "Greetings from Spring Boot!";
    }

    /**
     * 二维码-- 设备id--设备信息
     * @return
     */
    @PostMapping("/generateQRCode")
    public void generateQRCode(@RequestBody ReqCreateQrCodeDto reqDto) {
        log.info("hello");

        try {
            //从配置文件读取需要生成二维码的连接
//            String requestUrl = GraphUtils.getProperties("requestUrl");
            //requestUrl:需要生成二维码的连接，logoPath：内嵌图片的路径，os：响应输出流，needCompress:是否压缩内嵌的图片
            QrCodeUtils.encode(reqDto.getContent(), reqDto.getLogoPath(), reqDto.getTargetPath(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
