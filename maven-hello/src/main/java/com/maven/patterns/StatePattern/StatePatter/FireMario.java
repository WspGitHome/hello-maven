package com.maven.patterns.StatePattern.StatePatter;


/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.StatePatter
 * @Classname FireMario
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 16:58
 * @Version 1.0
 */
public class FireMario implements IMario {
    private static final FireMario FIRE_MARIO = new FireMario();

    public FireMario() {
    }

    public static FireMario getInstance() {
        return FIRE_MARIO;
    }

    @Override
    public State getName() {
        return State.FIRE;
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
        marioStateMachine.setScore(marioStateMachine.getScore() - 300);
    }
}
