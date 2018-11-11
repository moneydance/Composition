package com.composition;

import java.util.Random;

public class BeepBoopService implements BeepBoopable {
  private static String BEEP = "Beep";
  private static String BOOP = "Boop";
  private int maxBeepBoops;
  private Random randomNumberGenerator;

  public BeepBoopService(int maxBeepBoops) {
    this.maxBeepBoops = maxBeepBoops;
    this.randomNumberGenerator = new Random();
  }

  public void beepBoop() {
    int numberOfBeepBoops = randomNumberGenerator.nextInt(maxBeepBoops) + 1;
    for (int i = 0; i < numberOfBeepBoops; i++) {
      if (i % 2 == 0) {
        System.out.println(BEEP);
      } else {
        System.out.println(BOOP);
      }
    }
  }
}

