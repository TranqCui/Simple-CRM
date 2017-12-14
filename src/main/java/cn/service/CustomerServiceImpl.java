package cn.service;

import cn.commons.Page;
import cn.mapper.CustomerDao;
import cn.pojo.Customer;
import cn.pojo.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by cuibinbin on 2017/12/14.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Page<Customer> selectPageByQueryVo(QueryVo vo) {
        Page<Customer> page = new Page<>();
        page.setSize(5);
        if (vo != null) {
            page.setPage(vo.getPage());
            vo.setStart((vo.getPage()-1)*vo.getSize());
            if (vo.getCustName()!= null && !"".equals(vo.getCustName().trim())) {
                vo.setCustName(vo.getCustName().trim());
            }
            if (vo.getCustIndustry()!= null && !"".equals(vo.getCustIndustry().trim())) {
                vo.setCustIndustry(vo.getCustIndustry().trim());
            }
            if (vo.getCustSource()!= null && !"".equals(vo.getCustSource().trim())) {
                vo.setCustSource(vo.getCustSource().trim());
            }
            if (vo.getCustLevel()!= null && !"".equals(vo.getCustLevel().trim())) {
                vo.setCustLevel(vo.getCustLevel().trim());
            }
        }
        page.setTotal(customerDao.countCustomerByQueryVo(vo));
        page.setRows(customerDao.selectCustomerByQueryVo(vo));
        return page;
    }

    @Override
    public Customer selectCustomerById(Integer id) {
        return customerDao.selectCustomerById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerDao.deleteCustomer(id);
    }
}

