import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by songqian on 17/7/29.
 */
public class Filter {

  public static List<Apple> filterGreenApple(List<Apple> inventory) {
    List<Apple> result = new ArrayList<Apple>();
    for (Apple apple : inventory) {
      if (apple.getColor().equals("green"))
        result.add(apple);
    }
    return result;
  }

//  public static List<Apple> filterGreenApple(List<Apple> inventory) {
//    List<Apple> result = new ArrayList<Apple>();
//    for (Apple apple : inventory) {
//      if (apple.getWeight() >= 150)
//        result.add(apple);
//    }
//    return result;


  public static List<Apple> fiterApples(List<Apple> inventory, Predicate<Apple> p) {

    List<Apple> result = new ArrayList<>();

    for (Apple apple : inventory) {
      if (p.test(apple)) {
        System.out.println(apple.getColor());

        result.add(apple);
      }
    }



    return result;
  }


}
