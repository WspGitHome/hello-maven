package com.maven.patterns.GuavaEventBus;




import com.maven.patterns.entity.User;
import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn
 * @Classname EventBus
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/28 17:24
 * @Version 1.0
 */
public class EventBusDemo {
    public static void main(String[] args) {
        DataDealListener dataDealListener = new DataDealListener();
        EventBus.getDefault().register(dataDealListener);
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            userList.add(new User.Builder().setName("姓名"+i).setPhone("电话"+i).build());
            if (userList.size() >= 20) {
                EventBus.getDefault().post(userList);
                userList.clear();
            }
        }
        EventBus.getDefault().unregister(dataDealListener);

    }

}

