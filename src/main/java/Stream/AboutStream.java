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

    if(menu.stream().anyMatch(Dish::isVegetarian)){
      System.out.println("vegetarian");
    }

    boolean isHealth = menu.stream().allMatch(dish -> dish.getCalories()>30);
    System.out.println(isHealth);

    boolean isHealth1 = menu.stream().noneMatch(dish -> dish.getCalories()>1000);
    System.out.println(isHealth1);





    List<Integer> list = menu.stream().map(Dish::getName).map(String::length).collect(toList());

    List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7);

    List<Integer> squares = numbers.stream().map(i -> i * i).collect(toList());

//    System.out.println(squares);
//
//    System.out.println(list);
//
//    System.out.println(dishType);
//
//    System.out.println(threeHighCaloricDishNames);
//
//    System.out.println(count);
//
//    List<Integer> num1 = Arrays.asList(1, 2, 3);
//    List<Integer> num2 = Arrays.asList(3, 4);
//
//
//    List<int[]> ints = num1.stream().flatMap(i -> num2.stream().map(j -> new int[]{i, j})).collect(toList());
//
//    List<int[]> ints2 = num1.stream().flatMap(i -> num2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j})).collect(toList());
//
//    for (int[] ints1 : ints) {
//      System.out.println(Arrays.toString(ints1));
//    }
//    System.out.println("@@@@@@@@@@@@@@@@@@");
//    for (int[] ints1 : ints2) {
//      System.out.println(Arrays.toString(ints1));
//    }





  }


}
