package com.maven.hellomaven.hellotest;

import com.maven.hellomaven.hellword.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Packagename com.maven.hellomaven.hellotest
 * @Classname HelloTest
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/09/10 09:36
 * @Version 1.0
 */
public class HelloTest {

    @Test
    public void test() {
        String result = HelloWorld.helloWorld();
        Assert.assertEquals("Hello Maven",result);
    }
}
