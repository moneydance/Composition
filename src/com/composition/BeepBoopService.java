package com.composition;

public class BeepBoopService implements BeepBoopable {
  private static String BEEP = "Beep";
  private static String BOOP = "Boop";

  public void beepBoop() {
    System.out.println(BEEP + " " + BOOP);
  }
}

