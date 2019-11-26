package com.mumu.common.datasources.aspect;

import com.mumu.common.datasources.DataSourceNames;
import com.mumu.common.datasources.DynamicDataSourceContextHolder;
import com.mumu.common.datasources.annotation.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description 动态数据源切换处理器
 * @Author Created by Mumu
 * @Date on 2019/11/25
 */
@Aspect
@Component
@Slf4j
@Order(-1)// 该切面应当先于 @Transactional 执行
public class DynamicDataSourceAspect {
    @Pointcut("@annotation(com.mumu.common.datasources.annotation.DataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        DataSource ds = method.getAnnotation(DataSource.class);
        if (ds == null) {
            DynamicDataSourceContextHolder.setDataSourceKey(DataSourceNames.FIRST);
            log.info("set datasource is " + DataSourceNames.FIRST);
        } else {
            // 切换数据源
            DynamicDataSourceContextHolder.setDataSourceKey(ds.name());
            log.info("Switch DataSource to【{}】in Method【{}】", DynamicDataSourceContextHolder.getDataSourceKey(), signature);
        }

        try {
            return point.proceed();
        } finally {
            // 将数据源置为默认数据源
            DynamicDataSourceContextHolder.clearDataSourceKey();
            log.info("Restore DataSource to【{}】in Method【{}】", DynamicDataSourceContextHolder.getDataSourceKey(), signature);
        }
    }
}
