package com.ashang.six_principle.Demo01;

public enum Singleton05 {
    /**
     * 枚举实现单例
     */
    INSTANCE;

    public Singleton05 getInstance(){
        return Singleton05.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(INSTANCE.getInstance());
        }
    }
}
