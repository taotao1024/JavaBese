package com.lsy.thread.distributedlock;

/**
 * 模拟订单系统
 * @author YY
 */
public class Order {
    /**
     * 创建订单
     */
    public void createOrder() {
        System.out.println(Thread.currentThread().getName() + " 创建order");
    }
}
