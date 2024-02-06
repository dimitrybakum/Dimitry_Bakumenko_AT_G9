package com.bubbles;



public class Bubble extends ArrayBuilder {
  final static float MAX_BUBBLE_CAPACITY = 0.30f;
  float[] newBubblesArray = new float[10000];


  public float[] Bubble(float[] newDoubleArray) {
    this.newBubblesArray = newDoubleArray;
    //System.out.println("newBubblesArray " + Arrays.toString(newBubblesArray));
    System.out.println();
      for (float v : newDoubleArray) {
          if (MAX_BUBBLE_CAPACITY < v) {
              System.out.println("«Cramp!»");
          }
      }
      return newDoubleArray;

    }
  }

  // - создать класс Bubble
  // - у пузырька должен быть обьем, газовый состав
  // - он должен уметь лопаться с выводом в консоль «Cramp!»
  // - обьем пузырька постоянный и равен 0.3 мм2,
  // а газовый состав переменный в зависимости от
  // образующего газа и задается в конструкторе класса

