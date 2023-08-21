package com.ashang.six_principle.Demo02;

public class ByBus implements CalculateStrategy {
    @Override
    public int calculateTrafficFee(int distance) {
        return distance<10?4:6;
    }
}
