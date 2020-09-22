package com.maven.patterns.StatePattern;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.LookUpTable
 * @Classname Event
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 15:38
 * @Version 1.0
 */
public enum Event {
    GOT_MUSHROOM(0),

    GOT_CAPE(1),

    GOT_FIRE(2),

    Met_MONSTER(3);

    public int getValue() {
        return value;
    }

    private int value;

    Event(int value) {
        this.value = value;
    }}
