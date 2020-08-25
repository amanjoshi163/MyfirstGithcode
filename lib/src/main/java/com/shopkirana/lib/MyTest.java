package com.shopkirana.lib;



abstract class Bike{
    abstract void run();
    void demo(){
        System.out.println("running safely from Bike..");
    }
}

class MyTest extends Bike{
    void run(){System.out.println("running safely..");}
    void demo(){
        System.out.println("running safely from Honda..");
    }
    public static void main(String args[]){
        Bike obj = new MyTest();
        obj.run();
        obj.demo();
    }
}