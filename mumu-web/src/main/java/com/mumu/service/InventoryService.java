package com.mumu.service;

import com.mumu.model.Inventory;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
public interface InventoryService {
    Inventory queryById(Integer id);
}
