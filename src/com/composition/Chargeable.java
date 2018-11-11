package com.composition;

public interface Chargeable {
  void charge();
  double getBatteryLife();
  void useBatteryLife(double batteryLifeNeeded);
}
