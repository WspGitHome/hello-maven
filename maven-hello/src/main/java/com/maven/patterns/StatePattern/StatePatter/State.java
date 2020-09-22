package com.maven.patterns.StatePattern.StatePatter;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.StatePatter
 * @Classname State
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/14 09:18
 * @Version 1.0
 */
public enum State {
    SAMLL("正常状态"),
    SUPER("超大模式"),
    FIRE("火焰状态"),
    CAPE("斗篷状态");
    private String value;

    public String getValue() {
        return value;
    }

    State(String value) {
        this.value = value;
    }

}