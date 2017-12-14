package cn.mapper;

import cn.pojo.Customer;
import cn.pojo.QueryVo;

import java.util.List;

/**
 * Created by cuibinbin on 2017/12/14.
 */
public interface CustomerDao {
    Integer countCustomerByQueryVo(QueryVo vo);
    List<Customer> selectCustomerByQueryVo(QueryVo vo);
    Customer selectCustomerById(Integer id);
    void updateCustomer(Customer customer);
    void deleteCustomer(Integer id);
}
