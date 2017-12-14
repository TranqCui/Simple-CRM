package cn.mapper;

import cn.pojo.Customer;
import cn.pojo.QueryVo;

import java.util.List;

/**
 * Created by cuibinbin on 2017/12/14.
 */
public interface CustomerDao {
    Integer countCustomerByQueryVo(QueryVo vo);
    List<Customer> selectCustomerByQueytVo(QueryVo vo);
}
