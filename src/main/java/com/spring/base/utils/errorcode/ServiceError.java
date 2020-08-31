package com.spring.base.utils.errorcode;

/**
 * 错误码
 * 421000-421100,通用错误码
 * 421101开始,其他错误码
 */
public enum ServiceError {
    /** =================================通用错误start================================= **/
    MISS_TOKEN("421000", "缺少登录令牌"),
    SESSION_EXPIRE("421001", "会话已过期"),
    MISS_PARAM("421002", "缺少参数"),
    PARAM_VALUE_ERROR("421003", "参数不正确"),
    /** =================================通用错误end================================= **/

    /** =================================其他相关错误start================================= **/
    PHONE_REGISTERED("421101", "手机号已注册"),
    PHONE_NOT_REGISTERED("421102", "此手机号未注册"),
    PHONE_NO_REGISTERED("421103", "该手机号未注册，请到APP验证码登录注册"),
    NO_AUDIO_CANNOT_SPLIT("421104", "没有音频的会议不能拆分"),
    NO_CONVERT_CANNOT_SPLIT("421105", "未转写成功的会议不能拆分"),
    AUDIO_NOT_EXIST("421106", "音频不存在"),
    NO_CONVERT_CANNOT_MERGE("421107", "未转写成功的会议不能合并"),
    USER_NOT_EXIST("421108", "用户不存在"),
    TEXT_NOT_BELONG_CONFERENCE("421109", "文本不属于该会议"),
    ORDER_NOT_EXIST("421110", "订单不存在"),
    USERRECHARGE_NOT_EXIST("421110", "用户充值记录不存在"),
    RECHARGE_NOT_EXIST("421111", "卡号不存在"),
    RECHARGE_HAS_ACTIVE("421112", "卡号已经激活"),
    PHONE_FORMAT_ERROR("421113", "手机号格式不正确"),
    CODE_FORMAT_ERROR("421114", "验证码格式不正确"),
    PASSWORD_FORMAT_ERROR("421115", "验证码格式不正确"),
    PHONE_OR_CODE_ERROR("421116", "手机号或验证码错误"),
    PASSWORD_ERROR("421117", "手机号或密码错误"),
    FEEDBACK_SIZE_ERROR("421118", "反馈内容超过200字"),
    REPLY_SIZE_ERROR("421119", "回复内容超过150字"),
    FEEDBACK_NOT_EXIST("421120", "反馈不存在"),
    NO_AUTH_ACCESS("421121", "非法访问"),
    CONFERENCE_NOT_EXIST("421122", "会议不存在"),
    GOODS_NOT_EXIST("421123", "商品不存在"),
    ORDER_SIZE_ERROR("421124", "新的订单名称长度超过30"),
    USER_OPERATE_DEVICE("421125", "用户正在操作设备,不能登录"),
    PASSWORD_THE_SAME("421126", "新密码与原始密码一致，请修改"),
    USER_TEXT_NOT_EXIST("421127", "文本未找到"),
    PHONE_NOT_THE_SAME("421128", "手机号和当前用户手机号是不致的"),
    DATE_FORMAT_ERROR("421129", "时间格式错误"),
    CONFERENCE_EXIST("421130", "会议已存在"),
    AUDIO_EXIST("421131", "音频已存在"),
    FILE_FORMAT_ERROR("421132", "用户文本文件格式错误, 行数无法被3整除"),
    ORDER_PAYING("421133", "订单支付中,请等待支付结果"),
    ACCOUNT_NO_MONEY("421134", "账户余额不足"),
    ORDER_PAYED("421135", "订单已支付"),
    ORDER_NO_PAY("421136", "订单未支付"),
    
    USER_TEXT_NO_AUTH("421137", "无权限查看用户文本"),
    USER_TEXT_HANDLE_FAIL("421138", "用户文本处理失败"),

    RESOURCE_CLOSE_ERROR("421139", "资源关闭失败"),
    TXTFILE_WRITE_ERROR("421140", "TXT文件写入失败"),
    UPLOAD_FAIL_ERROR("421141", "上传失败"),
    UPLOAD_TEXT_LENGTH_ERROR("421142", "上传文本行数，开始时间，结束时间数目不一致"),
    
    REAL_TIME_TEXT_DB_ERROR("421143", "获取实时信息失败"),
    REAL_TIME_TEXT_NO_AUTH("421144", "无权限查看实时文本"),
    REAL_TIME_TEXT_REDIS_ERROR("421145", "redis查找失败"),
    
    PCM_ID_ERROR("421146", "音频表id无效"),
    PCM_NO_AUTH("421147", "无权限查看此音频"),
    PCM_NFS_ERROR("421148", "nfs调用失败"),
    PCM_READ_BYTE_ERROR("421149", "读取字节失败"),
    PCM_SKIP_BYTE_ERROR("421150", "跳过字节失败"),
    PCM_OPEN_FILE_ERROR("421151", "打开文件"),
    
    SEND_MSG_ERROR("421152", "发送短信验证码失败"),
    
    REAL_TIME_UPLOAD_REDIS_ERROR("421153", "redis操作失败"),
    REAL_TIME_UPLOAD_IO_ERROR("421154", "IO操作失败"),
    REAL_TIME_UPLOAD_NFS_ERROR("421155", "NFS操作失败"),
    REAL_TIME_UPLOAD_HANDLER_ERROR("421156", "实时转写开启失败"),
    REAL_TIME_UPLOAD_DB_ERROR("421157", "数据库操作失败"),

    /** =================================其他相关错误end================================= **/
    SYSTEM_ERROR("421100", "系统异常");

    private String code;

    private String msg;

    ServiceError(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
