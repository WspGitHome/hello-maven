package com.maven.patterns.Adapter.demo1;

/**
 * @Packagename com.wanfangdata.researchersbeetlfront.learn.Adapter.demo1
 * @Classname ISensitiveWordsFilter
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/07/31 14:09
 * @Version 1.0
 */
public interface ISensitiveWordsFilter {
    /**
     * @param text
     * @return java.lang.String
     * @description 过滤敏感文本统一接口
     * @authors Mr.Wu
     * @date 2020/07/31
     * @modified by
     * @version 1.0
     **/

    String filter(String text);
}
