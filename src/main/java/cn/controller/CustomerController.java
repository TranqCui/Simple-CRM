package cn.controller;

import cn.pojo.BaseDict;
import cn.pojo.Customer;
import cn.pojo.QueryVo;
import cn.service.BaseDictService;
import cn.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cuibinbin on 2017/12/14.
 */
@Controller
public class CustomerController {

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private CustomerService customerService;

    //主页面显示数据
    @RequestMapping("/customer/list")
    public String customer(QueryVo vo, Model model){
        model.addAttribute("fromType",baseDictService.selectBaseDictByCode("002"));
        model.addAttribute("industryType",baseDictService.selectBaseDictByCode("001"));
        model.addAttribute("levelType",baseDictService.selectBaseDictByCode("006"));

        model.addAttribute("page", customerService.selectPageByQueryVo(vo));
        //回显
        model.addAttribute("custName", vo.getCustName());
        model.addAttribute("custSource", vo.getCustSource());
        model.addAttribute("custIndustry", vo.getCustIndustry());
        model.addAttribute("custLevel", vo.getCustLevel());
        return "customer";
    }

    //修改的数据回显
    @RequestMapping("/customer/edit.action")
    public @ResponseBody
    Customer edit(Integer id){
        return customerService.selectCustomerById(id);
    }

    //修改数据
    @RequestMapping("/customer/update.action")
    public @ResponseBody
    String update(Customer customer){
        customerService.updateCustomer(customer);
        return "OK";
    }

    //删除数据
    @RequestMapping("/customer/delete.action")
    public @ResponseBody
    String delete(Integer id){
        customerService.deleteCustomer(id);
        return "OK";
    }
}