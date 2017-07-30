package Start;

/**
 * Created by songqian on 17/7/29.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
  @Override
  public boolean test(Apple apple) {
    return apple.getWeight() > 150;
  }
}
