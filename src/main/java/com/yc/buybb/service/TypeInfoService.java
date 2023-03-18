package com.yc.buybb.service;

import com.yc.buybb.bean.TypeInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeInfoService {
    /**
     * 添加
     * @param tname
     * @return
     */
    int add(String tname);

    /**
     * 查询
     * @return
     */
    List<TypeInfo> finds();
}
