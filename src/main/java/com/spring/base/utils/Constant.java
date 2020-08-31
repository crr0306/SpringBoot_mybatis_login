package com.spring.base.utils;

public interface Constant {
    /**App 标记值*/
    String HEADER_LABEL = "Tag";
    /**App 标记值*/
    String HEADER_VALUE = "App";


    /**web页面过期时间*/
    int WEB_EXPIRE_TIME = 60 * 60 * 24;

    /**App页面过期时间*/
    int APP_EXPIRE_TIME = 60*60*24*7;
    String TOKEN_WEB_PRIFIX = "icbase:user:web:token:";
    String TOKEN_APP_PRIFIX = "icbase:user:app:token:";
    String PHONE_WEB_PRIFIX = "icbase:user:web:phone:";
    String PHONE_APP_PRIFIX = "icbase:user:app:phone:";
    String TRANSFER_ONLINE_PRIFIX = "icbase:online:phone:";
    String TRANSFER_OFFLINE_PRIFIX = "icbase:offline:phone:";

    // 离线音频上传两分钟超时后,用户可以logout
    int TRANSFER_OFFLINE_EXPIRE_TIME = 120;
    // 实时音频上传两分钟超时后,用户可以logout
    int TRANSFER_ONLINE_EXPIRE_TIME = 120;

    String OFFLINE_JOB_PRIFIX = "icbase:offline:conferenceUniqueId:";
    int OFFLINE_JOB_EXPIRE_TIME = 60;// 定时任务检测这个redis key,过期则生成音频,会议,订单等，１分钟
    String OFFLINE_JOB_KEY = "icbase:checkOfflineTransfer";
    int OFFLINE_JOB_TIMEOUT = 60;// 1分钟超时
    int OFFLINE_JOB_RATE = 1000 * 60 * 3;// 每3分钟检测离线音频上传

    // PCM文件路径前缀
    String PCM_PRIFIX = "audioPCM/";

    // 离线转写slice文件的存放路径
    String OFFLINE_PCM_PRIFIX = "offline/slice/";

    // 实时转写slice文件的存放路径
    String REALTIME_PCM_PRIFIX = "realTime/slice/";

    // MP3文件路径前缀
    String MP3_PRIFIX = "audioMP3/";

    // 原始文本文件文件路径前缀
    String TEXT_PRIFIX = "text/";
    // 用户文本文件文件路径前缀
    String USER_TEXT_PRIFIX = "userText/";

    // 实时转写分块信息前缀
    String REALTIME_CONVERT_SLICE_PRIFIX = "icbase:realtime:slice:";
    // 实时转写文本前缀
    String REALTIME_CONVERT_TEXT_PRIFIX = "icbase:realtime:text:";
    // 实时转写分块长度
    int REALTIME_CONVERT_SLICE_LENGTH = 1000;
    // 实时转写文件大小
    long REALTIME_CONVERT_FILE_SIZE = 16 * 1024;
    // 实时转写过期时间,1天
    int REALTIME_CONVERT_EXPIRE_TIME = 86400;

    // 离线转写请求总数
    String OFFLINE_CONVERT_REQ_COUNT = "icbase:offline:convert:count";
    // 离线转写分布式锁key
    String OFFLINE_CONVERT_REQ_LOCK_KEY = "icbase:offline:convert:lock";
}
