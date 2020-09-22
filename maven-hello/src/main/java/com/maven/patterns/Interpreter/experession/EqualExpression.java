package com.maven.patterns.Interpreter.experession;

import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Interpreter.experession
 * @Classname EqualExpression
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/09 08:48
 * @Version 1.0
 */
public class EqualExpression implements Expression {

    private String key;
    private long value;

    public EqualExpression(String strExpression) {
        String[] elements = strExpression.trim().split("\\s+");
        if (elements.length != 3 || !elements[1].equals("==")) {
            throw new RuntimeException("Expression is invalid :" + strExpression);
        }
        this.key = elements[0].trim();
        this.value = Long.parseLong(elements[2].trim());
    }


    @Override
    public boolean isWarning(Map<String, Long> stats) {
        if (!stats.containsKey(key)) {
            return false;
        }
        long statsValue = stats.get(key);
        return statsValue == value;
    }
}
