package cn.service;

import cn.mapper.BaseDictDao;
import cn.pojo.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cuibinbin on 2017/12/14.
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictDao baseDictDao;

    @Override
    public List<BaseDict> selectBaseDictByCode(String code) {
        return baseDictDao.selectBaseDictByCode(code);
    }
}
