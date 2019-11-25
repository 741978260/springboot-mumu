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
@TableName("t_param_config")
public class CreditQuota {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String source;

    private String sourceName;

    private String sourcePath;

    private String target;


}
