import Start.Apple;
import Start.Filter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songqian on 17/7/29.
 */
public class TestPredicate {

  @Test
  public void test1() {
    List<Apple> inventory = new ArrayList<Apple>();
//    Start.Apple apple1 = new Start.Apple();
//    apple1.setColor("green");
//    apple1.setWeight(140);
//
//    Start.Apple apple2 = new Start.Apple();
//    apple2.setColor("red");
//    apple2.setWeight(30);


//    inventory.add(apple1);
//    inventory.add(apple2);
//
////    Start.Filter.fiterApples(list, Start.Apple::isGreenApple);

//    Start.Filter.fiterApples(list, Start.Apple::isHeavyApple);

//    Start.Filter.fiterApples(inventory, new Predicate<Start.Apple>() {
//      @Override
//      public boolean test(Start.Apple apple) {
//        return apple.getColor().equals("red");
//      }
//    });

    Filter.fiterApples(inventory, apple ->
      apple.getColor().equals("red")
    );


  }
}