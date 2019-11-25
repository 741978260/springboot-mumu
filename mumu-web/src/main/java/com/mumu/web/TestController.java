package com.mumu.web;

import com.mumu.model.AddressBook;
import com.mumu.model.CreditQuota;
import com.mumu.service.AddressBookService;
import com.mumu.service.CreditQuotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AddressBookService addressBookService;
    @Autowired
    private CreditQuotaService creditQuotaService;

    @RequestMapping("/query/{bookId}")
    public void test(@PathVariable("bookId") Integer bookId) {
        AddressBook addressBook = addressBookService.queryById(bookId);
        System.out.println(addressBook.toString());
    }

    @GetMapping("/credit/query")
    public void test() {
        final CreditQuota creditQuota = creditQuotaService.queryById(1);
        System.out.println(creditQuota.toString());
    }
}
