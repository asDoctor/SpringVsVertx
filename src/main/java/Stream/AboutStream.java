package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

/**
 * Created by songqian on 17/7/30.
 */
public class AboutStream {

  static List<Dish> menu = Arrays.asList(
    new Dish("pork", false, 800, Dish.Type.MEAT),
    new Dish("beef", false, 700, Dish.Type.MEAT),
    new Dish("chicken", false, 400, Dish.Type.MEAT),
    new Dish("french fries", true, 530, Dish.Type.OTHER),
    new Dish("rice", true, 350, Dish.Type.OTHER),
    new Dish("season fruit", true, 120, Dish.Type.OTHER),
    new Dish("pizza", true, 550, Dish.Type.OTHER),
    new Dish("prawns", false, 300, Dish.Type.FISH),
    new Dish("salmon", false, 450, Dish.Type.FISH)
  );

  public void test() {

    List<String> threeHighCaloricDishNames = menu.stream()
      .filter(dish -> dish.getCalories() > 300)
      .map(Dish::getName).limit(3).collect(toList());

    List<Dish.Type> dishType = menu.stream().filter(new Predicate<Dish>() {
      @Override
      public boolean test(Dish dish) {
        return dish.getCalories() > 600;
      }
    }).map(Dish::getType).collect(toList());


    Long count = menu.stream().filter(dish -> dish.getCalories() > 300)
      .map(Dish::getName).count();

    System.out.println(dishType);


    System.out.println(threeHighCaloricDishNames);

    System.out.println(count);


  }


}
