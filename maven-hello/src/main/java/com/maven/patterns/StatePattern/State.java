package com.maven.patterns.StatePattern;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern
 * @Classname State
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 15:16
 * @Version 1.0
 */
public enum State {
    SAMLL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);
    private int value;

    public int getValue() {
        return value;
    }

    State(int value) {
        this.value = value;
    }

}
