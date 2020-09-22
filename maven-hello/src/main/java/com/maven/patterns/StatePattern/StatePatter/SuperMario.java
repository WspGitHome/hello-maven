package com.maven.patterns.StatePattern.StatePatter;


/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.StatePatter
 * @Classname SuperMario
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 16:57
 * @Version 1.0
 */
public class SuperMario implements IMario {
    private static final SuperMario SUPER_MARIO = new SuperMario();

    public SuperMario() {
    }

    public static SuperMario getInstance() {
        return SUPER_MARIO;
    }

    @Override
    public State getName() {
        return State.SUPER;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine marioStateMachine) {
        //Do Nothing
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
        marioStateMachine.setCurrenState(SmallMario.getInstance());
        marioStateMachine.setScore(marioStateMachine.getScore() - 100);
    }
}
