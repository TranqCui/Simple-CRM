package cn.service;

import cn.commons.Page;
import cn.pojo.Customer;
import cn.pojo.QueryVo;

/**
 * Created by cuibinbin on 2017/12/14.
 */
public interface CustomerService {
    Page<Customer> selectPageByQueryVo(QueryVo vo);
    Customer selectCustomerById(Integer id);
    void updateCustomer(Customer customer);
    void deleteCustomer(Integer id);
}
