package com.composition;

public class Robot implements BeepBoopable{
  private static double BEEP_BOOP_BATTERY_LIFE_COST = 0.5;
  private Powerable powerService;
  private BeepBoopable beepBoopService;

  Robot(Powerable powerService, BeepBoopable beepBoopService) {
    this.powerService = powerService;
    this.beepBoopService = beepBoopService;
  }

  public void beepBoop() {
    this.powerService.useBatteryLife(BEEP_BOOP_BATTERY_LIFE_COST);
    this.beepBoopService.beepBoop();
  }
}
