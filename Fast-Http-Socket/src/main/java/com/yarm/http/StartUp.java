package com.yarm.http;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/5/30
 * Time:13:46
 * Des:
 */
public class StartUp {

    protected boolean loaded = false;
    protected boolean started = false;
    public void startServer(){
        if(started)
            return;
    }

    public void stopServer(){
    }

    public void load(){
        if(loaded)
            return;
    }

    public StandarServer getServer(){
        return null;
    }
}