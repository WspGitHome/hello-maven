package com.maven.patterns.Adapter.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Adapter.demo1
 * @Classname RiskManage
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/31 14:19
 * @Version 1.0
 */
public class RiskManage {
    List<ISensitiveWordsFilter> filters = new ArrayList<>();

    public void addSensitiveWordsFilter(ISensitiveWordsFilter sensitiveWordsFilter) {
        filters.add(sensitiveWordsFilter);
    }

    public String filterSensitiveWords(String text) {
        String textResult = text;
        for (ISensitiveWordsFilter filter : filters) {
            textResult = filter.filter(textResult);
        }
        return textResult;
    }

    public static void main(String[] args) {
        RiskManage riskManage = new RiskManage();
        riskManage.addSensitiveWordsFilter(new ASensitiveWordsFilterAdaptor(new ASensitiveWordsFilter()));
        //add more adaptor
        //several filters generated a result
        String result = riskManage.filterSensitiveWords("");
    }
}
