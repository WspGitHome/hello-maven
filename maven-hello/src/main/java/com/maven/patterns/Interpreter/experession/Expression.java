package com.maven.patterns.Interpreter.experession;

import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Interpreter.experession
 * @Classname Experssion
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/09 08:32
 * @Version 1.0
 */
public interface Expression {
    boolean isWarning(Map<String, Long> stats);
}


