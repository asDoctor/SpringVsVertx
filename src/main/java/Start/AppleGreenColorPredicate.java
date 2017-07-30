package Start;

/**
 * Created by songqian on 17/7/29.
 */
public class AppleGreenColorPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return apple.getColor().equals("green");
  }
}
