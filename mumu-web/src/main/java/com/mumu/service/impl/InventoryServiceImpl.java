package com.mumu.service.impl;

import com.mumu.common.datasources.DataSourceNames;
import com.mumu.common.datasources.annotation.DataSource;
import com.mumu.model.Inventory;
import com.mumu.persistence.mapper.InventoryMapper;
import com.mumu.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryMapper inventoryMapper;
    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public Inventory queryById(Integer id){
        return inventoryMapper.queryById(id);
    };
}
