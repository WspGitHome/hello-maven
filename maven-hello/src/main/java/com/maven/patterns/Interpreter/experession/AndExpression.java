package com.maven.patterns.Interpreter.experession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Interpreter.experession
 * @Classname AndExpression
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/09 08:52
 * @Version 1.0
 */
public class AndExpression implements Expression {

    private List<Expression> expressions = new ArrayList<>();

    public AndExpression(String strExpression) {
        String[] strExpressions = strExpression.trim().split("&&");
        for (String expression : strExpressions) {
            if (expression.contains(">")) {
                expressions.add(new GreaterExpression(expression));
            } else if (expression.contains("<")) {
                expressions.add(new LessExpression(expression));
            } else if (expression.contains("==")) {
                expressions.add(new EqualExpression(expression));

            }
        }
    }

    public AndExpression(List<Expression> expressions) {
        this.expressions.addAll(expressions);
    }

    @Override
    public boolean isWarning(Map<String, Long> stats) {
        for (Expression expression : expressions) {
            if (!expression.isWarning(stats)) {
                return false;
            }
        }
        return true;
    }
}
