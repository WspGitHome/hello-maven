package com.maven.patterns.Adapter.demo1;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Adapter.demo1
 * @Classname ASensitiveWordsFilterAdaptor
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/31 14:15
 * @Version 1.0
 */
public class ASensitiveWordsFilterAdaptor implements ISensitiveWordsFilter {
    private ASensitiveWordsFilter aSensitiveWordsFilter;

    public ASensitiveWordsFilterAdaptor(ASensitiveWordsFilter aSensitiveWordsFilter) {
        this.aSensitiveWordsFilter = aSensitiveWordsFilter;
    }

    @Override
    public String filter(String text) {
        String textResult = "";
        textResult = aSensitiveWordsFilter.filterPoliticalWords(text);
        textResult = aSensitiveWordsFilter.filterSexyWords(textResult);
        return textResult;
    }
}
