package com.nwpu.springboot.dao;



import com.nwpu.springboot.entity.Account;

import java.util.List;

public interface AccountMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    Account selectByPrimaryKey(Integer id);

    List<Account> selectAll();

    int updateByPrimaryKey(Account record);
}