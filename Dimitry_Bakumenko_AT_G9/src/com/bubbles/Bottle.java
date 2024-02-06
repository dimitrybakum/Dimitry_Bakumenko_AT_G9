package com.bubbles;

public class Bottle extends SparklingWater {

  // - создать класс Bottle
  // - у него есть обьем
  // - есть вода
  // - есть метод open(), который вызывает метод degas() в газировке
  double bottleCapacity;
  double waterCapacity;
  public void open( float newBottleCapacity, float newWaterCapacity){
    this.bottleCapacity = newBottleCapacity;
    this.waterCapacity = newWaterCapacity;
    //degas();
  }

  public static void main(String[] args) {}
}
