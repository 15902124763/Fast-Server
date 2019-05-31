package com.yarm.util;

import com.sun.xml.internal.bind.api.ClassResolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/5/30
 * Time:14:00
 * Des:
 */
public class PropertiesUtil {
    private Logger log = LoggerFactory.getLogger(getClass());
    // 相对配置路径
    private static String CONFIG_URL = "/conf/server.properties";
    // 当前路径
    private static String SERVER_BASEDIR = null;
    static Properties properties = null;

    static {
        SERVER_BASEDIR = System.getProperty("user.dir");
        properties = new Properties();
        InputStream in = ClassResolver.class.getResourceAsStream(CONFIG_URL);
        try {
            properties.load(in);
        } catch (IOException e) {
            // ignore
        }
    }

    public static int getIntValue(String key){
        if(key == null)
            return -1;
        String value = properties.getProperty(key);
        if(value == null)
            return -1;
        return Integer.valueOf(value);
    }

    public static String getStringValue(String key){
        if(key == null)
            return null;
        return null;
    }

    public static String getBaseUrl(){
        return SERVER_BASEDIR;
    }
}