package com.nbb.mybatis.nbbmybatis.mapper;


import com.nbb.mybatis.nbbmybatis.entiry.DictType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hupeng
 * @since 2023-11-15
 */
@Mapper
public interface DictTypeMapper {

    List<DictType> list();

    List<DictType> list2();

    void save(DictType dictType);
}
