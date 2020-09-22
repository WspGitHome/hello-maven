package com.maven.patterns.entity;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront
 * @Classname User
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/28 15:22
 * @Version 1.0
 */
public class User extends Base {
    private String name;
    private String password;
    private String phone;
    private Integer age;
    //默认身份 为学生
    private String role;

    public static class Builder {
        private static final String DEFAULT_ROLE = "Student";
        private String name;
        private String password;
        private String phone;
        private Integer age;
        private String role = DEFAULT_ROLE;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setRole(String role) {
            this.role = role;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }


    public User() {
    }

    public User(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.age = builder.age;
        this.role = builder.role;
        this.password = builder.password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
