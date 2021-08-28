package com.example.student_mis.service.Upload;

import com.example.student_mis.domain.Upload;

import java.util.Map;

/**
 * Create by zhengdawei on 2021/6/4 18:28
 * 上传文件service层
 */
public interface UploadService {
    /**
     * description: 上传头像
     * @param: upload
     * return: void
     */
    void upload(Upload upload);
    /**
     * description: 获取头像
     * @param: condition
     * return: String
     */
    String getHeader(Map<String, Object> condition);
}
