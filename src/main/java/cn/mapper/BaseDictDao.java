package cn.mapper;

import cn.pojo.BaseDict;

import java.util.List;

/**
 * Created by cuibinbin on 2017/12/14.
 */
public interface BaseDictDao {
    List<BaseDict> selectBaseDictByCode(String code);
}
