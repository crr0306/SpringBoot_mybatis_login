package com.spring.base.controller.other;

import com.spring.base.controller.other.req.ReqCreateQrCodeDto;
import com.spring.base.utils.QrCodeUtils;
import io.swagger.annotations.Api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


/**
 *
 */

@RestController
@Api(value = "Hello springboot接口")
public class HelloController {

    public static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @PostMapping("/")
    public String index() {
        logger.info("hello");
        return "Greetings from Spring Boot!";
    }

    /**
     * 二维码-- 设备id--设备信息
     *
     * @return
     */
    @PostMapping("/generateQRCode")
    public void generateQRCode(@RequestBody ReqCreateQrCodeDto reqDto) {
        logger.info("generateQRCode");

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
