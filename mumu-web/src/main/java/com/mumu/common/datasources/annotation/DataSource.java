package com.mumu.common.datasources.annotation;

import java.lang.annotation.*;

/**
 * @Description 动态数据源注解
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    /**
     * 数据源key值
     *
     * @return
     */
    String name() default "";
}
