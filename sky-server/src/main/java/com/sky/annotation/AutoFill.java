package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，标识某个方法需要实现 公共字段自动填充 的功能
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //指定数据库操作类型（UPDATE，INSERT），其他操作不需要公共字段填充
    //value()是一个类型为OperationType的元素，并非一个方法
    OperationType value();
}
