package com.mumu.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Data
@TableName("t_address_book")
public class AddressBook {
    /**
     * 主键
     */
    @TableId(value = "book_id", type = IdType.AUTO)
    private Integer bookId;

    /**
     * 客户id
     */
    private Long custId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话号码
     */
    private String phone;
}
