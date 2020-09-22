package com.maven.patterns.StatePattern.LookUpTable;


import com.maven.patterns.StatePattern.Event;
import com.maven.patterns.StatePattern.State;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.StatePattern.LookUpTable
 * @Classname MarioStateMachine
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/08/13 15:40
 * @Version 1.0
 */
public class MarioStateMachine {
    private int score;
    private State currentState;
    private static final State transitionTable[][] =
            {{State.SUPER, State.CAPE, State.FIRE, State.SAMLL},
                    {State.SUPER, State.CAPE, State.FIRE, State.SAMLL},
                    {State.CAPE, State.CAPE, State.CAPE, State.SAMLL},
                    {State.FIRE, State.FIRE, State.FIRE, State.SAMLL}};
    private static final int eventTable[][] = {
            {100, 200, 300, 0},
            {0, 200, 300, -100},
            {0, 0, 0, -200},
            {0, 0, 0, -300}
    };

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.Met_MONSTER);
    }

    public int getScore() {
        return score;
    }

    public State getCurrentState() {
        return currentState;
    }

    private void executeEvent(Event event) {
        int _event = event.getValue();
        int transtite = this.currentState.getValue();
        this.score += eventTable[transtite][_event];
        this.currentState = transitionTable[transtite][_event];
    }
}
