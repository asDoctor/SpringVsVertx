package Start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by songqian on 17/7/29.
 */
public class Filter2 {

  public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
    List<Apple> result = new ArrayList<>();

    for (Apple apple : inventory) {
      if (p.test(apple)) {
        result.add(apple);
      }
    }
    System.out.println(result.size());
    return result;

  }

  public static void main(String... args) {
    List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

    List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());

    List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());

    List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
      @Override
      public boolean test(Apple apple) {
        return apple.getColor().equals("red");
      }
    });
  }
}
