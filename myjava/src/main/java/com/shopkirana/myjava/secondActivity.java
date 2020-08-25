package com.shopkirana.myjava;


abstract class Bike{
    abstract void run();
    void demo(){
        System.out.println("running safely from Bike..");
    }
}

class secondActivity extends Bike{
    void run(){System.out.println("running safely..");}
    void demo(){
        System.out.println("running safely from Honda..");
    }
    public static void main(String args[]){
        Bike obj = new secondActivity();
        obj.run();
        obj.demo();
    }
}