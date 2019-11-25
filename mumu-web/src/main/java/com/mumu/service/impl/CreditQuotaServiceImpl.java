package com.mumu.service.impl;

import com.mumu.common.datasources.DataSourceNames;
import com.mumu.common.datasources.annotation.DataSource;
import com.mumu.model.CreditQuota;
import com.mumu.persistence.mapper.CreditQuotaMapper;
import com.mumu.service.CreditQuotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Service
public class CreditQuotaServiceImpl implements CreditQuotaService {
    @Autowired
    private CreditQuotaMapper creditQuotaMapper;
    @Override
    @DataSource(name = DataSourceNames.SECOND)
    public CreditQuota queryById(Integer id){
        return creditQuotaMapper.queryById(id);
    };
}
