package com.maven.patterns.SingleTon;

/**
 * @Packagename com.maven.patterns.SingleTon
 * @Classname EnumSinle
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/12/16 15:15
 * @Version 1.0
 */
public class EnumSingle {
    private EnumSingle() {
    }

    private enum SinlgeTon {
        INSTANCE;
        private final EnumSingle instance;

        SinlgeTon() {
            instance = new EnumSingle();
        }

        private EnumSingle getInstance() {
            return instance;
        }

    }

    public static EnumSingle getInstance() {
        return SinlgeTon.INSTANCE.getInstance();
    }
}
