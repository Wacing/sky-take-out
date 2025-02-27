package com.sky.annotation;

import com.sky.enumeration.OperationType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)  //指定注解加载方法上

//@Retention 指定了 注解的生命周期。
//RetentionPolicy.RUNTIME 说明 @AutoFill 注解会 在运行时生效，并且可以通过反射 (Reflection) 机制进行获取和处理。
@Retention(RetentionPolicy.RUNTIME)

public @interface AutoFill {
    //数据库操作类型：UPDATE INSERT
    OperationType value();
}

