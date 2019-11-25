package com.mumu.service.impl;

import com.mumu.common.datasources.DataSourceNames;
import com.mumu.common.datasources.annotation.DataSource;
import com.mumu.model.AddressBook;
import com.mumu.persistence.mapper.AddressBookMapper;
import com.mumu.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Service
public class AddressBookServiceImpl implements AddressBookService {
    @Autowired
    private AddressBookMapper addressBookMapper;

    @Override
    public AddressBook  queryById(Integer bookId){
        AddressBook addressBook = addressBookMapper.queryById(bookId);
        return addressBook;
    }
}
