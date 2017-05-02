package com.ljt.factorymodelandreflection;

import java.util.Properties;

/**
 * Created by 1 on 2017/5/2.
 */

public class FactoryDemo2 {
    public static void main(String args[]){
        Properties p =PropertyTool.getPro();
        //通过工厂类取得接口实例，通过属性的Key传入完整的包.类名称
        Fruit f = Factory.getInstance(p.getProperty("orange"));
        if(f!=null){
            f.eat();
        }
    }
}
