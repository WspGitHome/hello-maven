package com.maven.patterns.Observers.GoogleEventBus;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Packagename com.maven.patterns.Observers.GoogleEventBus
 * @Classname MessageObserver
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 15:24
 * @Version 1.0
 */
public class MessageObserver {
    private static final Logger logger = LoggerFactory.getLogger(MessageObserver.class);

    @Subscribe
    public void sendMessage(NotifyEvent notifyEvent) {

        logger.info("发送信息:{}给{}", notifyEvent.getMessage(), notifyEvent.getMobileNo());
    }
}
