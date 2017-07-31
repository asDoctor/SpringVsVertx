package Stream;

import java.time.LocalDateTime;

/**
 * Created by songqian on 17/7/31.
 */
public class TestDate {


  static void test() {


    LocalDateTime localDateTime = LocalDateTime.now();
    LocalDateTime localDateTimePast = localDateTime.plusMinutes(-30);
    String timePast = localDateTimePast.toString().replace("T", "+").substring(0, 19);
    String timeNow = localDateTime.toString().replace("T", "+").substring(0, 19);
    System.out.println(timePast);
    System.out.println(timeNow);


  }

  public static void main(String[] args) {
    test();
  }


}
