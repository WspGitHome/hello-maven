package com.maven.patterns.entity.demoentity;

import lombok.experimental.SuperBuilder;

/**
 * @Packagename com.maven.patterns.entity.demoentity
 * @Classname User
 * @Description
 * @Authors Mr.Wu
 * @Date 2021/11/14 16:00
 * @Version 1.0
 */
public class User {

    String name;
    int age;
    String phone;
    String email;
    String address;

    //注意无参构造器私有，避免外界使用构造器创建User对象
    private User() {
    }

    public static class Builder {

        private String name;
        private int age;
        private String phone;
        private String email;
        private String address;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User();
            user.name = name;
            user.age = age;
            user.email = email;
            user.phone = phone;
            user.address = address;
            return user;
        }
    }

}