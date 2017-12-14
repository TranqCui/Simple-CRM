package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cuibinbin on 2017/12/14.
 */
@Controller
public class CustomerController {
    @RequestMapping("/list/customer")
    public String customer(Model model){
        return "customer";
    }
}
