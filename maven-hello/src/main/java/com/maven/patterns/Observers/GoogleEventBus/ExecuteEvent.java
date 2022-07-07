package com.maven.patterns.Observers.GoogleEventBus;

/**
 * @Packagename com.maven.patterns.Observers.GoogleEventBus
 * @Classname ExecuteEvent
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 16:35
 * @Version 1.0
 */
public class ExecuteEvent {

    public static void main(String[] args) {
        EmailObserver emailObserver = new EmailObserver();
        MessageObserver messageObserver = new MessageObserver();
        EventBusCenter.register(emailObserver);
        EventBusCenter.register(messageObserver);
        EventBusCenter.post(NotifyEvent.builder()
                .email("123456@126.com")
                .mobileNo("1878787878")
                .message("明天上午开会！").build());
        EventBusCenter.unregister(emailObserver);
        EventBusCenter.unregister(messageObserver);
    }
}
