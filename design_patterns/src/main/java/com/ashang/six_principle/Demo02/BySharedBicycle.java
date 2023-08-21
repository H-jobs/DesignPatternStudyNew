package com.ashang.six_principle.Demo02;

public class BySharedBicycle implements CalculateStrategy{
    @Override
    public int calculateTrafficFee(int distance) {
        return 2;
    }
}
