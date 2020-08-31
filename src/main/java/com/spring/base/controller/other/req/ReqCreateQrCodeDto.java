package com.spring.base.controller.other.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ReqCreateQrCodeDto implements Serializable {
    private static final long serialVersionUID = 8823582308865334483L;

    /**
     * 保存路径
     */
    @ApiModelProperty(value = "保存路径")
    private String  targetPath;
    @ApiModelProperty(value = "文本")
    private String  content;
    @ApiModelProperty(value = "插入图片")
    private String  logoPath;



}
