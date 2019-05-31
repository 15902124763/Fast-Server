package com.yarm.http;

import com.yarm.util.PropertiesUtil;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/5/30
 * Time:13:49
 * Des:
 */
public abstract class AbstractServer {
    private int port = 9090;

    public int getPort(){
        int intValue = PropertiesUtil.getIntValue("server.port");
        if(intValue < 0)
            return port;
        return intValue;
    }
}