package com.lsy.constructmode.bridge.demo02.pay.mode;

/**
 * 支付方法接口
 */
public interface IPayMode {

    boolean security(String uId);

}
