package com.yc.buybb.controller;

import com.yc.buybb.bean.TypeInfo;

import com.yc.buybb.service.TypeInfoService;
import com.yc.buybb.vo.LayuiVO;
import com.yc.buybb.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品类型控制层
 */
@RestController
@RequestMapping("/type")
public class TypeInfoController {
    //    @Resource
    @Qualifier("typeInfoServiceImpl")

    @Autowired
    private TypeInfoService typeInfoService;
    /**
     * 处理添加商品类型
     * @param tname
     * @return
     */
    @PostMapping("/add")
    public ResultVO add(String tname){
        int result = typeInfoService.add(tname);
        if (result == -1) {
            return new ResultVO(510, "数据请求验证失败");
        }
        if(result > 0) {
            return new ResultVO(200, "添加成功");
        }
        return new ResultVO(500, "添加失败");
    }


    @GetMapping("/finds")
    public ResultVO finds(){
        List<TypeInfo> list = typeInfoService.finds();
        if(list != null && !list.isEmpty()) {
            return new ResultVO(200, list);
        }
        return new ResultVO(600, "暂无数据");
    }


    @GetMapping("/findAll")
    public LayuiVO findAll(){
        List<TypeInfo> list = typeInfoService.finds();
        if(list != null && !list.isEmpty()) {
            return new LayuiVO(list);
        }
        return new LayuiVO(600, "暂无数据");
    }
}
