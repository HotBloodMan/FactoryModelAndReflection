package com.ljt.factorymodelandreflection;

/**
 * Created by 1 on 2017/5/2.
 */

public class Factory {
    public static Fruit getInstance(String className){
        Fruit fruit=null;
        try {
            fruit= (Fruit) Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return fruit;
    }
}
