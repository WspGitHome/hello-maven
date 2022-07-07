package com.maven.patterns.Observers.GoogleEventBus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @Packagename com.maven.patterns.Observers.GoogleEventBus
 * @Classname NotifyEvent
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/10 15:27
 * @Version 1.0
 */
//通知事件载体
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class NotifyEvent {

    private String mobileNo;//手机号

    private String email;//邮件

    private String message;//内容

}