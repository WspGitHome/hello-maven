package com.maven.patterns.Interpreter;


import com.maven.patterns.Interpreter.experession.Expression;
import com.maven.patterns.Interpreter.experession.OrExpression;

import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Interpreter
 * @Classname RuleInterpreter
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/09 08:17
 * @Version 1.0
 */
public class RuleInterpreter {
    private Expression expression;

    public RuleInterpreter(String rule) {
        this.expression = new OrExpression(rule);
    }

    public boolean isWarning(Map<String, Long> stats) {
        return expression.isWarning(stats);
    }
}
