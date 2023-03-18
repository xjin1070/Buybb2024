package com.yc.buybb.service.impl;

import com.yc.buybb.bean.TypeInfo;
//import com.yc.buybb.mapper.ITypeInfoMapper;
import com.yc.buybb.mapper.TypeInfoMapper;

import com.yc.buybb.service.TypeInfoService;
import com.yc.buybb.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品类型信息表业务模型
 * @author
 * @date 2019-12-04 15:00:00
 */
@Service
public class TypeInfoServiceImpl implements TypeInfoService {
    @Autowired
    private TypeInfoMapper typeInfoMapper;

    @Override
    public int add(String tname) {
        if (StringUtil.checkNull(tname)) {
            return -1;
        }
        return typeInfoMapper.add(tname);
    }

    @Override
    public List<TypeInfo> finds() {
        return typeInfoMapper.finds() ;
    }
}
