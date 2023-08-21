package com.ashang.six_principle.Demo02;

/**
 * 将小伙的出行方式改为策略模式的第一步，使用借口去调用不同的策略
 */
public interface CalculateStrategy {
    int calculateTrafficFee(int distance);
}
