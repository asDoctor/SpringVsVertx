package Simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by songqian on 17/7/29.
 */
public class Filter3 {

  public static <T> List<T> filter(List<T> t, Predicate<T> p) {

    List<T> result = new ArrayList<T>();

    for (T e : t) {
      if (p.test(e)) {
        result.add(e);
      }
    }
    return result;

  }



                           



  public static void main(String[] args) {
    List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

    List<Apple> redApples = filter(inventory, apple -> apple.getColor().equals("red"));

    System.out.println(redApples.size());


  }


}
