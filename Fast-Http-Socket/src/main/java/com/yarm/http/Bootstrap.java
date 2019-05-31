package com.yarm.http;

import com.google.gson.Gson;
import com.yarm.util.PropertiesUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/5/30
 * Time:13:29
 * Des:
 */
public final class Bootstrap {
    private static Logger log = LoggerFactory.getLogger(Bootstrap.class);
    private static Bootstrap daemon = null;
    private Object startUpDaemon = null;
    public static void main(String[] args) {
        Bootstrap bootstrap = new Bootstrap();
        try {
            bootstrap.init();
        } catch (Throwable t) {
            log.warn("BootStrap init throwable msg is" + new Gson().toJson(t.getMessage()));
            return;
        }
        daemon = bootstrap;
    }

    public void init() throws Exception{
        PropertiesUtil.getIntValue("server.port");
    }

    public void start() throws Exception{
    }
}