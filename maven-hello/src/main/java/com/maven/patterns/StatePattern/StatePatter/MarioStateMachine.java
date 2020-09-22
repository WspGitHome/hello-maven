package com.maven.patterns.StatePattern.StatePatter;


/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.StatePatter
 * @Classname MarioStateMachine
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 16:51
 * @Version 1.0
 */
public class MarioStateMachine {
    private int score;
    private IMario currenState;


    public MarioStateMachine() {
        this.score = 0;
        this.currenState = SmallMario.getInstance();
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setCurrenState(IMario currenState) {
        this.currenState = currenState;
    }

    public int getScore() {
        return score;
    }

    public State getCurrenState() {
        return currenState.getName();
    }


    public void obtainMushRoom() {
        this.currenState.obtainMushRoom(this);
    }

    public void obtainCape() {
        this.currenState.obtainCape(this);

    }

    public void obtainFire() {
        this.currenState.obtainFire(this);

    }

    public void meetMonster() {
        this.currenState.meetMonster(this);

    }


    public static void main(String[] args) {
        MarioStateMachine marioStateMachine = new MarioStateMachine();
        marioStateMachine.obtainMushRoom();
        System.out.println("吃到蘑菇--->目前状态：" + marioStateMachine.currenState.getName() + " | 目前得分：" + marioStateMachine.getScore());
        marioStateMachine.meetMonster();
        System.out.println("遇到怪兽--->目前状态：" + marioStateMachine.currenState.getName() + " | 目前得分：" + marioStateMachine.getScore());
        marioStateMachine.obtainCape();
        System.out.println("获得斗篷--->目前状态：" + marioStateMachine.currenState.getName() + " | 目前得分：" + marioStateMachine.getScore());
        marioStateMachine.meetMonster();
        System.out.println("遇到怪兽--->目前状态：" + marioStateMachine.currenState.getName() + " | 目前得分：" + marioStateMachine.getScore());
        marioStateMachine.obtainMushRoom();
        System.out.println("吃到蘑菇--->目前状态：" + marioStateMachine.currenState.getName() + " | 目前得分：" + marioStateMachine.getScore());
        marioStateMachine.obtainFire();
        System.out.println("获得火焰--->目前状态：" + marioStateMachine.currenState.getName() + " | 目前得分：" + marioStateMachine.getScore());

    }
}
