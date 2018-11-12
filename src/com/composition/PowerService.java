package com.composition;

public class PowerService implements Powerable {
  private double batteryLife;

  public PowerService() {
    this.charge();
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

  private void charge() {
    this.batteryLife = 1;
  }
}

