/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.javabase;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class Test1 {
    private static Test1 test1 = null;

    public static synchronized Test1 getInstance() {
        if (test1 == null) {
            return new Test1();
        }
        return test1;
    }

    @Test
    public void TestMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "123");
        map.put("b", "123");
        map.put("c", "123");

        //在for循环中遍历Key或者Values,一般啊适合用于只需要Map中的Key或者Value时使用，在性能上闭使用entrySet较好
        for (String s : map.keySet()
        ) {
            System.out.println(s + ":" + map.get(s));
        }

        //在for循环中使用Entries实现Map的遍历
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //通过Iterator遍历
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> map1 = iter.next();
            System.out.println(map1.getKey() + ":" + map1.getValue());
        }

    }

    @Test
    public void TestStringSplit() {
        String str = "Aa123我爱你！";
        Pattern patternLetter =Pattern.compile("[a-zA-Z]");
        Pattern patternNum =Pattern.compile("[0-9]");
        Pattern patternSpace =Pattern.compile("\\s");

        int letterCount=0;
        int numCount=0;
        int spaceCount=0;
        int otherCount=0;

        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);

            if(patternLetter.matcher(c+"").matches()){
                letterCount++;
            }else if(patternNum.matcher(c+"").matches()){
                numCount++;
            }else if(patternSpace.matcher(c+"").matches()){
                spaceCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("字母"+letterCount);
    }


}
