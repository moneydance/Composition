package com.composition;
import java.util.Random;

public class BarkService implements Barkable {
  private String barkSound;
  private Random randomNumberGenerator;
  private int maxBarks;

  public BarkService(String barkSound, int maxBarks) {
    this.barkSound = barkSound;
    this.maxBarks = maxBarks;
    this.randomNumberGenerator = new Random();
  }

  public void bark() {
    int numberOfBarks = randomNumberGenerator.nextInt(this.maxBarks) + 1;
    for(int i=0; i<numberOfBarks; i++){
      System.out.println(barkSound);
    }
  }
}
