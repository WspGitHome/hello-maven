package com.maven.patterns.Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Interpreter
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/09 08:12
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String rules = "key1  >  99  && key2 < 100 &&  key3 < 100 &&key4 == 99";
        Map<String, Long> stats = new HashMap<>();
        stats.put("key1", 123L);
        stats.put("key2", 23L);
        stats.put("key3", 13L);
        stats.put("key4",99L);
        RuleInterpreter interpreter = new RuleInterpreter(rules);
        System.out.println("是否触犯规则rules:" + interpreter.isWarning(stats));
    }
}
