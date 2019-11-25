package com.mumu.service;

import com.mumu.model.AddressBook;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
public interface AddressBookService {
    AddressBook queryById(Integer bookId);
}
