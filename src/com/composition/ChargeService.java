package com.composition;

public class ChargeService implements Chargeable {
  private double batteryLife;

  public ChargeService() {
    this.batteryLife = 1;
  }

  public double getBatteryLife() {
    return this.batteryLife;
  }

  public void useBatteryLife(double batteryLifeNeeded) {
    double remainingBattery = this.batteryLife - batteryLifeNeeded;
    if (remainingBattery < 0.0) {
      System.out.println("Battery must charge before being used");
      this.charge();
    } else {
      this.batteryLife = remainingBattery;
    }
  }

  public void charge() {
    this.batteryLife = 1;
  }
}

