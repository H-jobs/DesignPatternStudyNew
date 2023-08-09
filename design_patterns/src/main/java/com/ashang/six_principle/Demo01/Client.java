package com.ashang.six_principle.Demo01;

//开闭原则的案例：对扩展开放，对修改关闭。
//在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。
//以下的两个实现皮肤实现类再搜狗输入法中就实现了一个热插拔的效果

public class Client {
    public static void main(String[] args) {
        //创建搜狗输入法对象
        SougouInput input = new SougouInput();
        //创建默认皮肤对象
        DefaultSpecificSkin skin = new DefaultSpecificSkin();
        //将皮肤设置到输入法中
        input.setSkin(skin);

        //显示皮肤
        input.display();
    }
}
