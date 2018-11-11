package com.composition;
import java.util.Random;

public class PoopService implements Poopable{
  private Random randomNumberGenerator;
  private double poopThreshold;

  PoopService(double poopThreshold) {
    this.randomNumberGenerator = new Random();
    this.poopThreshold = poopThreshold;
  }

  public void poop() {
    double poopChance = this.randomNumberGenerator.nextDouble();
    if (poopChance > this.poopThreshold) {
      System.out.println("Pooping");
    } else {
      System.out.println("Doesn't need to poop");
    }
  }
}
