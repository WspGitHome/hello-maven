package com.maven.patterns.Interpreter.experession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Interpreter.experession
 * @Classname OrExpression
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/09 09:12
 * @Version 1.0
 */
public class OrExpression implements Expression {

    private List<Expression> expressions = new ArrayList<>();

    public OrExpression(String strExpression) {
        String[] andExpressions = strExpression.trim().split("\\|\\|");
        for (String andExpr : andExpressions) {
            expressions.add(new AndExpression(andExpr));
        }
    }

    @Override
    public boolean isWarning(Map<String, Long> stats) {
        for (Expression expression : expressions) {
            if (expression.isWarning(stats)) {
                return true;
            }
        }
        return false;
    }
}
