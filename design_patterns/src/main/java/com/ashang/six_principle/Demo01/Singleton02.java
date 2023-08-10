package com.ashang.six_principle.Demo01;

public class Singleton02 {
    /**
     * 懒汉式
     */
    private static Singleton02 instance;

    private Singleton02() {}

    public static Singleton02 getInstance() {
        if (instance == null){
            instance = new Singleton02();
        }
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
