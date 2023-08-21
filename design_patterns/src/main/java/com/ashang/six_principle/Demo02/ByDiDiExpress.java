package com.ashang.six_principle.Demo02;

public class ByDiDiExpress implements CalculateStrategy{
    @Override
    public int calculateTrafficFee(int distance) {
        return distance<3?8:(8+(distance-3)*3);
    }
}
