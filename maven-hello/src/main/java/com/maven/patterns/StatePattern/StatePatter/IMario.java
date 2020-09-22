package com.maven.patterns.StatePattern.StatePatter;


/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.StatePatter
 * @Classname IMerio
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 16:51
 * @Version 1.0
 */
public interface IMario {

    State getName();

    void obtainMushRoom(MarioStateMachine marioStateMachine);

    void obtainCape(MarioStateMachine marioStateMachine);

    void obtainFire(MarioStateMachine marioStateMachine);

    void meetMonster(MarioStateMachine marioStateMachine);
}
