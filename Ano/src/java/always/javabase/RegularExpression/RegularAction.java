package always.javabase.RegularExpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: Ano
 * @description:正则表达式相关 regex
 * @author: Ano
 * @create: 2019-11-22 18:38
 **/
public class RegularAction {
    public static void main(String[] args) {
        String s = "Hello 123 4567 World_This a Regex Demo";
        String s1 = "https://www.example.com/-----https://www.examplesecond.com/";
        match_1(s);
        match_2(s);
        match_3(s);
        match_4(s);
        match_5(s);
        match_6(s);
        match_7(s);
        match_8(s1);
        match_9(s1);
    }

    private static void match_1(String str) {
        Pattern pattern = Pattern.compile("^Hello\\s\\d\\d\\d\\s\\d{4}\\s\\w{10}");
        Matcher matcher = pattern.matcher(str);
        //尝试查找与该模式匹配的输入序列的下一个子序列，直到搜索到输入序列结束
        //可以从指定位置开始匹配find（int start）
        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    private static void match_2(String str) {
        Pattern pattern = Pattern.compile("Hello\\s(\\d+)\\s\\d{4}\\s\\w{10}");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    private static void match_3(String str) {
        Pattern pattern = Pattern.compile("Hello\\s(\\d*)\\s\\d{4}\\s\\w{10}");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    private static void match_4(String str) {
        Pattern pattern = Pattern.compile("Hello.*Demo");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    /**
     * 贪婪匹配
     * 匹配中间数字，只能得到7
     * .*会尽可能多的匹配数据
     *
     * @param str
     */
    private static void match_5(String str) {
        Pattern pattern = Pattern.compile("Hello.*(\\d+).*Demo");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
        }
    }

    /**
     * .*?非贪婪匹配
     *
     * @param str
     */
    private static void match_6(String str) {
        Pattern pattern = Pattern.compile("Hello.*?(\\d+).*Demo");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
        }
    }

    /**
     * 正则表达式字符串也可以不编译直接使用
     *
     * @param str
     */
    private static void match_7(String str) {
        String regex = "Hello.*?(\\d+).*Demo";
        boolean flag = str.matches(regex);
        System.out.println(flag);
    }

    private static void match_8(String str) {
        Pattern pattern = Pattern.compile("https{0,1}://.+/");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    private static void match_9(String str) {
        Pattern pattern = Pattern.compile("https{0,1}://.+?/");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
