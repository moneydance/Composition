package com.composition;

public class RobotDog implements BeepBoopable, Barkable {
  private static double BEEP_BOOP_BATTERY_LIFE_COST = 0.25;
  private static double BARK_BATTERY_LIFE_COST = 0.5;
  private Chargeable chargeService;
  private BeepBoopable beepBoopService;
  private Barkable barkService;

  RobotDog(Chargeable chargeService, BeepBoopable beepBoopService, BarkService barkService) {
    this.chargeService = chargeService;
    this.beepBoopService = beepBoopService;
    this.barkService = barkService;
  }

  public void bark() {
    this.chargeService.useBatteryLife(BARK_BATTERY_LIFE_COST);
    this.barkService.bark();
  }

  public void beepBoop() {
    this.chargeService.useBatteryLife(BEEP_BOOP_BATTERY_LIFE_COST);
    this.beepBoopService.beepBoop();
  }
}