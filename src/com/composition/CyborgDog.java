package com.composition;

public class CyborgDog implements Barkable, BeepBoopable, Poopable {
  private static double BEEP_BOOP_BATTERY_LIFE_COST = 0.25;
  private static double BARK_BATTERY_LIFE_COST = 0.5;
  private Powerable powerService;
  private BeepBoopable beepBoopService;
  private Barkable barkService;
  private Poopable poopService;

  CyborgDog(Powerable powerService, BeepBoopable beepBoopService, Barkable barkService, Poopable poopService) {
    this.powerService = powerService;
    this.beepBoopService = beepBoopService;
    this.barkService = barkService;
    this.poopService = poopService;
  }

  public void bark() {
    this.powerService.useBatteryLife(BARK_BATTERY_LIFE_COST);
    this.barkService.bark();
  }

  public void beepBoop() {
    this.powerService.useBatteryLife(BEEP_BOOP_BATTERY_LIFE_COST);
    this.beepBoopService.beepBoop();
  }

  public void poop() {
    this.poopService.poop();
  }
}
