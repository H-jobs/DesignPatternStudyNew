package com.ashang.six_principle.Demo01;

public class Singleton04 {
    /**
     * 静态内部类
     */
    private Singleton04(){}

    private static class SingletonFactory {
        private static Singleton04 INSTANCE = new Singleton04();
    }

  public static Singleton04 getInstance(){
        return SingletonFactory.INSTANCE;
  }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
