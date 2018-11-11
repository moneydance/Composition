package com.composition;

public class Robot implements BeepBoopable{
  private static double BEEP_BOOP_BATTERY_LIFE_COST = 0.5;
  private Chargeable chargeService;
  private BeepBoopable beepBoopService;

  Robot(Chargeable chargeService, BeepBoopable beepBoopService) {
    this.chargeService = chargeService;
    this.beepBoopService = beepBoopService;
  }

  public void beepBoop() {
    this.chargeService.useBatteryLife(BEEP_BOOP_BATTERY_LIFE_COST);
    this.beepBoopService.beepBoop();
  }
}
