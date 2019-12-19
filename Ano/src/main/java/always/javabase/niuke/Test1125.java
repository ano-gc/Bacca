package always.javabase.niuke;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @program: Ano
 * @description:
 * @author: Ano
 * @create: 2019-11-25 17:18
 **/
public class Test1125 {
    @Test
    public void tests01() {
        String a = "123";
        String b = "456";
        String c = "123456";

        String d = "123" + "456";
        System.out.println(d == c);

        // 字符串串联是通过 StringBuilder ( 或 StringBuffer ) 类及其 append 方法实现的
        // 1、StringBuilder sb = new StringBuilder( a );
        // 2、sb.append( b ) ;
        // 3、sb.toString() ---> new String( chars )
        String e = a + b;
        System.out.println(e == c);
        System.out.println(e == d);

        String f = e.intern();
        System.out.println(f == c);

        //Java编译器对String+基本类型、常量是当成常量表达式直接来优化的。运行期的两个String相加，会产生新的对象的，存储在堆（heap）中
        //a为变量，在运行期才会被解析
        String g = a + "456";
        System.out.println(g == c);
        String n = 123 + "456";
        System.out.println(n == c);
        //h为常量，编译器会被优化
        final String h = "123";
        String i = h + "456";
        System.out.println(i == c);
    }

    @Test
    public void test02() {
        // 获取不同格式化风格和中国环境的日期
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        // 获取不同格式化风格和中国环境的时间
        DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df6 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df8 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        // 将不同格式化风格的日期格式化为日期字符串
        String date1 = df1.format(new Date());
        String date2 = df2.format(new Date());
        String date3 = df3.format(new Date());
        String date4 = df4.format(new Date());
        // 将不同格式化风格的时间格式化为时间字符串
        String time1 = df5.format(new Date());
        String time2 = df6.format(new Date());
        String time3 = df7.format(new Date());
        String time4 = df8.format(new Date());
        // 输出日期
        System.out.println("SHORT：" + date1 + " " + time1);
        System.out.println("FULL：" + date2 + " " + time2);
        System.out.println("MEDIUM：" + date3 + " " + time3);
        System.out.println("LONG：" + date4 + " " + time4);
    }

    @Test
    public void test03(){
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS:D天,E",Locale.CHINA);
        System.out.println(sf.format(new Date()));
    }
}
