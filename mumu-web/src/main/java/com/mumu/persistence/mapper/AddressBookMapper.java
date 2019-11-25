package com.mumu.persistence.mapper;

import com.mumu.model.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Mapper
public interface AddressBookMapper {
    AddressBook queryById(Integer bookId);
}
