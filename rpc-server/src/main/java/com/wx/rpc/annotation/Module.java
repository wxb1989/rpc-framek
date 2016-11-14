package com.wx.rpc.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/11/5.
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(value= RetentionPolicy.RUNTIME)
public @interface Module {
    String name() default "";
}
