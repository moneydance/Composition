package com.composition;

public class Dog implements Barkable, Poopable{
  private Barkable barkService;
  private Poopable poopService;

  Dog(Barkable barkService, Poopable poopService) {
    this.barkService = barkService;
    this.poopService = poopService;
  }

  public void bark() {
    this.barkService.bark();
  }

  public void poop() {
    this.poopService.poop();
  }
}
