package com.nbb.mybatis.nbbmybatis.controller;

import com.nbb.mybatis.nbbmybatis.entiry.AjaxResult;
import com.nbb.mybatis.nbbmybatis.entiry.DictType;
import com.nbb.mybatis.nbbmybatis.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 广播表crud示例
 * @author hupeng
 * @since 2023-11-15
 */
@RestController
@RequestMapping("/dict")
public class DictController {

    @Autowired
    private DictTypeService dictTypeService;


    @RequestMapping("/list")
    public AjaxResult list() {
        List<DictType> list = dictTypeService.list();
        return AjaxResult.data(list);
    }

    @RequestMapping("/add")
    public AjaxResult add() {
        dictTypeService.add();
        return AjaxResult.ok();
    }

}
