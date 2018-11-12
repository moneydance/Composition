package com.composition;
public class BarkService implements Barkable {
  private String barkSound;

  public BarkService(String barkSound) {
    this.barkSound = barkSound;
  }

  public void bark() {
    System.out.println(barkSound);
  }
}
