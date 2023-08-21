package com.ashang.six_principle.Demo02;

/**
 * 通过策略模式将出行方式进行解耦合，
 * 实现开闭原则；对修改关闭，对扩展开放，
 * 之后小帅想要什么出行方式只需要继续加类就行了（之后想开车还是想开飞机都随便）
 */
public class TrafficFeeCalculatorByDesign {
    public int goToTianJinEye(CalculateStrategy strategy,int distance){
        return strategy.calculateTrafficFee(distance);
    }

    public static void main(String[] args) {
        TrafficFeeCalculatorByDesign calculator = new TrafficFeeCalculatorByDesign();
        System.out.println(String.format("乘坐公交车到天津之眼的花费为：%d块人民币",
                calculator.goToTianJinEye(new ByBus(),10)));
        System.out.println(String.format("乘坐滴滴快车到天津之眼的花费为：%d块人民币",
                calculator.goToTianJinEye(new ByDiDiExpress(),10)));
        System.out.println(String.format("骑共享单车到天津之眼的花费为：%d块人民币",
                calculator.goToTianJinEye(new BySharedBicycle(),10)));
    }
}
