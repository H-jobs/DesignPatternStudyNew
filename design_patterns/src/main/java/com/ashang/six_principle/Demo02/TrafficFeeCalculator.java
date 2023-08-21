package com.ashang.six_principle.Demo02;

/**
 * 策略模式示例：
 * todo：
 * 业务场景；
 * 2017年的2月14号，王二狗和牛翠花约好在天津之眼约定终身，二狗打扮一番后准备出发，此时问题来了：
 * 是坐公交去呢，还是打滴滴快车呢？
 * 天气看起来也不错，要不骑共享单车吧，省钱还锻炼身体。
 */
public class TrafficFeeCalculator {
    public int goToTianJinEye(String way, int distance) {
        int trafficFee = 0;
        switch (way) {
            case "bus":
                if (distance < 10)
                    trafficFee = 4;
                else
                    trafficFee = 6;
                break;
            case "didi":
                if(distance<3)
                    trafficFee = 8;
                else
                    trafficFee=8+(distance-3)*3;
                break;
            case "sharedBicyle":
                trafficFee = 2;
                break;
            default:
                break;
        }
        return trafficFee;
    }

    public static void main(String[] args) {
        TrafficFeeCalculator trafficFeeCalculator = new TrafficFeeCalculator();
        int bus = trafficFeeCalculator.goToTianJinEye("bus", 10);
        System.out.println("小伙选择通过做bus的方式去见牛翠花；花费金额；"+bus+"元");
    }
}