package com.maven.practice.version2;

/**
 * @Packagename com.maven.practice.version2
 * @Classname Main
 * @Description
 * @Authors Mr.Wu
 * @Date 2020/10/28 13:46
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        String data = "\"苏联解体后，阿塞拜疆与亚美尼亚为争夺纳卡爆发战争，亚美尼亚占领纳卡" +
                "及其周围原属阿塞拜疆的部分领土。1994 年，阿塞拜疆和亚美尼亚全面停火达成协议。然而，历史与现实、战火与血泪交织而" +
                "起的仇视并没有随着一纸协议而消失。信奉基督教甚至将之奉为国教的亚美尼亚，和属于伊斯兰世界的阿塞拜疆，本已不睦。加" +
                "之土耳其与亚美尼亚之间都在争夺亚拉拉特山。土耳其又视阿塞拜疆为兄弟之邦。一旦逢着机会，必然暗助阿塞拜疆出手再次" +
                "争夺纳卡\"。";
        String dealAfterData = "", dealGetData = "";
        try {
            dealAfterData = DataProcesser.applyPreHandle("2", data);
            dealGetData = DataProcesser.applyAfterHandle(dealAfterData);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("处理后的数据："+dealAfterData);
        System.out.println("取回的数据："+dealGetData);

    }
}
