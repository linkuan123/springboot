package com.nwpu.springboot.controller;

import com.nwpu.springboot.dao.AccountMapper;
import com.nwpu.springboot.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountMapper accountMapper;

    @GetMapping("/findAll")
    public String findAllAccount(Model model){
        List<Account> accounts = accountMapper.selectAll();
        System.out.println(accounts);
        model.addAttribute("items", accounts);
        return "list";
    }


}
