package com.wx.rpc;

import com.wx.rpc.core.BaseModule;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/11/4.
 */
public class Test {
    private  static final  transient  int a =1 ;
    private static volatile int b =2;

    public static void main(String[] arges){
        try {

           /*  加载类的三种方法
            String str1="abc";
            Class cls1=str1.getClass();
            Class cls2=String.class;
            Class cls3=Class.forName("java.lang.String");
            */
            Class clz = Class.forName("com.wx.rpc.annotation.Module");
            Annotation[] annotations=clz.getAnnotations();

            BaseModule baseModule = new BaseModule();
            Class caBase =BaseModule.class;
            Field[]fields =caBase.getDeclaredFields();
            for (Field field: fields) {
                field.setAccessible(true);
                field.set(baseModule  ,  11);
                System.out.println(field.getName());
            }
            Method[]methods=caBase.getMethods();
            for (Method method:methods){

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
