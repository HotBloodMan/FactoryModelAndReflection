package com.ljt.factorymodelandreflection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by 1 on 2017/5/2.
 */

public class PropertyTool {
    public static  Properties getPro(){
    Properties p=new Properties();
    File f=new File("D:\\fruit.properties");
        try {
        if(f.exists()){
            p.load(new FileInputStream(f));
            }else{
            p.setProperty("apple","com.ljt.factorymodelandreflection.Apple");
            p.setProperty("orange","com.ljt.factorymodelandreflection.Orange");
            p.store(new FileOutputStream(f),"FRUIT Class");
             }
            }catch(Exception e){
        }
        return p;
    }
}
