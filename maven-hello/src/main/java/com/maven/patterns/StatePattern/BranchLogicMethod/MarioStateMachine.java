package com.maven.patterns.StatePattern.BranchLogicMethod;


import com.maven.patterns.StatePattern.State;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern
 * @Classname MarioStateMachine
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 15:18
 * @Version 1.0
 */
public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SAMLL;
    }

    public void obtainMushRoom() {
        this.currentState = State.SUPER;
        this.score += 100;
    }

    public void obtainCape() {
        if (this.currentState.equals(State.SAMLL) || this.currentState.equals(State.SUPER)) {
            this.currentState = State.CAPE;
            this.score += 200;
        }

    }

    public void obtainFireFlower() {
        if (this.currentState.equals(State.SAMLL) || this.currentState.equals(State.SUPER)) {
            this.currentState = State.FIRE;
            this.score += 300;
        }
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void meetMonster() {
        if (this.currentState.equals(State.SUPER)) {
            this.currentState = State.SAMLL;
            this.score -= 100;
            return;
        }

        if (this.currentState.equals(State.FIRE)) {
            this.currentState = State.SAMLL;
            this.score -= 300;
            return;
        }

        if (this.currentState.equals(State.CAPE)) {
            this.currentState = State.SAMLL;
            this.score -= 200;
            return;
        }
    }
}
