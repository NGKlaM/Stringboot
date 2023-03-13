package com.bean;

public class HelloWorld {
    private  String shop;
    public String getShop(){
        return shop;
    }
    public void setShop(String shop){
        this.shop =shop;
    }
    public void  init(){
        System.out.println("Init: làm viẹc");
    }
    public void destroy(){
        System.out.println("Destroy: làm việc");
    }
}
