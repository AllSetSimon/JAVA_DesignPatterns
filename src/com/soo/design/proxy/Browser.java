package com.soo.design.proxy;

public class Browser implements IBrower {
    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from : " + url);
        return new Html(url);
    }
}
