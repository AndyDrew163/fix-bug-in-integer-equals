package com.github.andydrew.learnRegex;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) throws IOException {
        String str1 = "遗失邹城市的山东省非税收入www.bilibili.com 公房管理所开具www.baidu.com 公房管理所开具xiedaimala.com " +
                "份证号码pic.netbian.com 特此声明作废www.tiw.cn " +
                " 证书编号www.youku.com 普通话证书mail.163.com 王仲卉ai.taobao.com";
        String str2 = "JaVa11打扫房间阿斯利康放假啊算啦javA7颗粒剂颗粒剂JAva8";
        String regex = "([a-zA-Z]{2,4}\\.)?[\\w&&[^_]]+\\.[comn]{2,3}";
        Pattern pattern = Pattern.compile(regex);//通过compile静态方法获取一个已经设定好正则表达式的对象Pattern，参数为正则表达式的字符串
        Matcher matcher = pattern.matcher(str1);//根据正则表达式获取一个已经设定好的字符串的匹配器对象，参数为需要调用正则表达式的字符串
        while (matcher.find()) {//匹配器根据正则表达式寻找满足需求的字符串，找到返回true，否则返回flase
            System.out.println(matcher.group());//底层代码根据substring()方法截取满足要求的字符串
        }
        pattern = Pattern.compile("((?i)java)(?:11|7|8)");//(?i)指不区分大小写
        matcher = pattern.matcher(str2);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
