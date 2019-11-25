package com.mumu.persistence.mapper;

import com.mumu.model.CreditQuota;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Mapper
public interface CreditQuotaMapper {
    CreditQuota queryById(Integer id);
}
