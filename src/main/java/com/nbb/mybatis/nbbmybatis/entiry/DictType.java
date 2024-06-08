package com.nbb.mybatis.nbbmybatis.entiry;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *   字典类型表，属于广播表
 * </p>
 *
 * @author hupeng
 * @since 2023-11-15
 */
@Accessors(chain = true)
@Data
public class DictType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String dictType;

    private String dictName;
}
