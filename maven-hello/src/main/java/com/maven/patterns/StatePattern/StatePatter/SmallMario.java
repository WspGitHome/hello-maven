package com.maven.patterns.StatePattern.StatePatter;


/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.StatePatter
 * @Classname SamllMario
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 16:55
 * @Version 1.0
 */
public class SmallMario implements IMario {
    private static final SmallMario SMALL_MARIO = new SmallMario();

    public SmallMario() {
    }

    public static SmallMario getInstance() {
        return SMALL_MARIO;
    }

    @Override
    public State getName() {
        return State.SAMLL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrenState(SuperMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() + 100);
    }

    @Override
    public void obtainCape(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrenState(CapeMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() + 200);
    }

    @Override
    public void obtainFire(MarioStateMachine marioStateMachine) {
        marioStateMachine.setCurrenState(FireMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine marioStateMachine) {

    }
}
