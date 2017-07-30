package Simple;

/**
 * Created by songqian on 17/7/29.
 */
public class Apple {

  private int weight;
  private String color;


  public Apple(int weight, String color) {
    this.weight = weight;
    this.color = color;

  }


  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

//  public static boolean isGreenApple(Apple apple) {
//    return apple.getColor().equals("green");
//  }
//
//  public static boolean isHeavyApple(Apple apple) {
//    return apple.getWeight() > 100;
//  }


}
