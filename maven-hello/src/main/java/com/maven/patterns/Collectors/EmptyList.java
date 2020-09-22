package com.maven.patterns.Collectors;



import com.maven.patterns.entity.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.Utils
 * @Classname Test
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/28 11:35
 * @Version 1.0
 */
public class EmptyList {
    public static void main(String[] args) {

        List<User> userList = getUser(true);
        System.out.println(userList.size());

    }

    private static List<User> getUser(boolean isEmpty) {
        if (isEmpty) {
            return Collections.emptyList();
        }
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        }
        return userList;
    }
}
