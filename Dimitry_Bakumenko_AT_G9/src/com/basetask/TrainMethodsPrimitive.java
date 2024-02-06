package com.basetask;

public class TrainMethodsPrimitive {
  // - создать класс TrainMethodsPrimitive и в нем
  // -- создать невозвратный метод printInt, который принимает на вход целое число (int) и печатает
  // в консоль «я получил на вход число » и это число
  // -- создать невозвратный метод printLong, который принимает на вход целое число (long) и
  // печатает в консоль «я получил на вход  длинное число » и это число
  // -- создать невозвратный метод printChar, который принимает на вход символ (char) и печатает в
  // консоль «я получил на вход символ » и это число
  // -- создать невозвратный метод printFloat, который принимает на вход дробное число (float) и
  // печатает в консоль «я получил на вход дробное число » и это число
  // -- создать невозвратный метод printDouble, который принимает на вход дробное число (double) и
  // печатает в консоль «я получил на вход длинное дробное число » и это число
  // -- создать невозвратный метод printShort, который принимает на вход целое число (short) и
  // печатает в консоль «я получил на вход короткое число » и это число
  // -- создать невозвратный метод printByte, который принимает на вход целое число (byte) и
  // печатает в консоль «я получил на вход очень короткое число » и это число
  // -- создать невозвратный метод printBoolean, который принимает на вход булево значение (boolean)
  // и печатает в консоль «я получил на вход булево » и это число
  // -- создать класс TrainMethodsPrimitiveRunner с методом main, в этом методе создать обьект
  // класса TrainMethodsPrimitive и вызвать всего его методы

  public static char c1 = '$';
  static float floatValue = 0.452F;

  public static void main(String... args) {
    printInt(33);
    printLong(566657845);
    printChar(TrainMethodsPrimitive.c1);
    printFloat(floatValue);
    printDouble(32.46784568585682);
    printShort((short) 6);
    printByte((byte) 4);
    printBoolean(false);
  }

  public static void printInt(int i) {
    System.out.println("я получил на вход число " + i);
  }

  public static void printLong(long i) {
    System.out.println("я получил на вход длинное число " + i);
  }

  public static void printChar(char i) {
    System.out.println("я получил на вход символ " + i);
  }

  public static void printFloat(float i) {
    System.out.println("я получил на вход дробное число " + i);
  }

  public static void printDouble(double x) {
    System.out.println("я получил на вход длинное дробное число " + x);
  }

  public static void printShort(short n) {

    System.out.println("я получил на вход короткое число " + n);
  }

  public static void printByte(byte n) {

    System.out.println("я получил на вход короткое число " + n);
  }

  public static void printBoolean(boolean b) {
    System.out.println("я получил на вход булево " + b);
  }
}
