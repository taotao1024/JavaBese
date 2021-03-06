package com.lsy.behaviormode.observer.demo02.event.listener;

import com.lsy.behaviormode.observer.demo02.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author yuanyuan
 * @version 1.0
 * @date 2020/09/17
 */
public class MQEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MQEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("记录用户 {} 摇号结果(MQ)：{}", result.getuId(), result.getMsg());
    }

}
