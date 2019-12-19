/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestLambda {
    @Test
    public void Testlam(){
        String []user={"adc","dscs","dscwe","dsddddd","sadfafsd"};
        List<String> players= Arrays.asList(user);
//采用for循环实现集合的遍历
        System.out.println("for循环！");
        for(String player:players){
            System.out.println(player+";");
        }
//采用lambda实现集合的遍历
        System.out.println("lambda");
        players.forEach(player-> System.out.println(player+";"));
//采用::实现集合的遍历
        players.forEach(System.out::println);

    }

}
