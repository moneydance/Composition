package com.composition;

public class CyborgDog implements Barkable, BeepBoopable, Poopable {
  private static double BEEP_BOOP_BATTERY_LIFE_COST = 0.25;
  private static double BARK_BATTERY_LIFE_COST = 0.5;
  private Chargeable chargeService;
  private BeepBoopable beepBoopService;
  private Barkable barkService;
  private Poopable poopService;

  CyborgDog(Chargeable chargeService, BeepBoopable beepBoopService, Barkable barkService, Poopable poopService) {
    this.chargeService = chargeService;
    this.beepBoopService = beepBoopService;
    this.barkService = barkService;
    this.poopService = poopService;
  }

  public void bark() {
    this.chargeService.useBatteryLife(BARK_BATTERY_LIFE_COST);
    this.barkService.bark();
  }

  public void beepBoop() {
    this.chargeService.useBatteryLife(BEEP_BOOP_BATTERY_LIFE_COST);
    this.beepBoopService.beepBoop();
  }

  public void poop() {
    this.poopService.poop();
  }
}
