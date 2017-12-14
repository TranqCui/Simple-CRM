package cn.service;

import cn.pojo.BaseDict;

import java.util.List;

/**
 * Created by cuibinbin on 2017/12/14.
 */
public interface BaseDictService {
    List<BaseDict> selectBaseDictByCode(String code);

}
