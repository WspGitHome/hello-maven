package com.maven.patterns.StatePattern.StatePatter;


/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.StatePatter
 * @Classname CapeMario
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 16:59
 * @Version 1.0
 */
public class CapeMario implements IMario {
    private static final CapeMario CAPE_MARIO = new CapeMario();

    public CapeMario() {
    }

    public static CapeMario getInstance() {
        return CAPE_MARIO;
    }

    @Override
    public State getName() {
        return State.CAPE;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {

    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {

    }

    @Override
    public void obtainFire(MarioStateMachine marioStateMachine) {

    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrenState(SmallMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() - 200);
    }
}
