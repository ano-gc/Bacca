/*
  Created by IntelliJ IDEA.
  User: Ano
  Date: 2019/9/10
  Time: 16:23
  To change this template use File | Settings | File Templates.
*/
package always.javabase.lambda;

import java.util.Arrays;
import java.util.List;

public class Car {
    public static Car create(supplier<Car> car){
        return car.get();
    }
    public static void collide(final Car car){
        System.out.println("Collide"+car.toString());
    }
    public static void follow(final Car car){
        System.out.println("Follow"+car.toString());
    }
    public void repair(){
        System.out.println("Repaired"+this.toString());
    }

    public static void main(String[] args) {
        //构造器引用
        final Car car=Car.create(Car::new);
        List<Car> cars= Arrays.asList(car);
        //静态方法引用
        cars.forEach(Car::collide);
        //特定类的任意对象的方法使用
        cars.forEach(Car::follow);
        //特定对象的方法引用
        cars.forEach(Car::repair);

    }
}
