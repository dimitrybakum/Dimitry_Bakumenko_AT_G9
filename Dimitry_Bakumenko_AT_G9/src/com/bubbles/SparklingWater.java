package com.bubbles;

public class SparklingWater extends Water {
  // - создать класс SparklingWater, являющийся дочерним Water
  // - у газировки есть пузырьки
  // - вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[]
  // bubbles)
  // - 1 литр воды содержит 10 тыс пузырьков
  final float[] MAX_BOOB_1L = new float [10000];

  float[] bubblesArray = new float [10000];

  protected void pump(Bubble[] bubbles, float bottle) {
    //double v = bottle.waterCapacity * MAX_BOOB_1L;
    System.out.println();
    // this.bubbles;
    //double gasV = bottle.bottleCapacity * MAX_BOOB_1L;

    //      double bottleCapacity;
    //      double waterCapacity;
    //System.out.println(gasV);
  }

  // public void getGasV();
  public static void main(String[] args) {}

  }

