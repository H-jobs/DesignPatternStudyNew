package com.ashang.six_principle.Demo01;


public class Singleton {
    /**
        饿汉式
     */
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(getInstance().hashCode());
            }).start();
        }

    }

}
