package com.ashang.six_principle.Demo01;

public class Singleton03 {
    /**
     * 双重检验锁
     */
    private volatile static Singleton03 instance;

    private Singleton03(){}

    public static Singleton03 getInstance(){
        if (instance == null){
            synchronized (Singleton03.class){
                if (instance == null){
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
