package com.hancher.demo.mybatis.intercepter;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * mybatis 执行期的拦截器
 * @author hancher
 * @date 2021/11/24 20:06
 */
@Intercepts({
 @Signature(type = Executor.class,method = "update",args = {MappedStatement.class,Object.class}),
 @Signature(type = Executor.class,method = "query",args = {MappedStatement.class,Object.class, RowBounds.class, ResultHandler.class}),
})
@Component
public class ExecuterIntercepter implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        String msg = invocation.getMethod().getName()+":args.length="+invocation.getArgs().length
                +"target class="+invocation.getTarget().getClass().getSimpleName();
        MappedStatement ms = (MappedStatement) invocation.getArgs()[0];
        System.out.println(msg);
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        // NOP
    }
}
