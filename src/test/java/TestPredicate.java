import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songqian on 17/7/29.
 */
public class TestPredicate {

  @Test
  public void test1() {
    List<Apple> list = new ArrayList<Apple>();
    Apple apple1 = new Apple();
    apple1.setColor("green");
    apple1.setWeight(140);

    Apple apple2 = new Apple();
    apple2.setColor("red");
    apple2.setWeight(30);


    list.add(apple1);

//    Filter.fiterApples(list, Apple::isGreenApple);

    Filter.fiterApples(list, Apple::isHeavyApple);


  }


}
