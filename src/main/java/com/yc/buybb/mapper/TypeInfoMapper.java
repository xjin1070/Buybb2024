package com.yc.buybb.mapper;

import com.yc.buybb.bean.TypeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeInfoMapper {
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
