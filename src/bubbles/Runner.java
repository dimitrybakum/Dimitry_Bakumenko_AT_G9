package bubbles;


import java.util.Arrays;

public class Runner extends SparklingWater {
  public static void main(String[] args) {
    ArrayBuilder arrayBuilder= new ArrayBuilder();
    arrayBuilder.getDoubleArray();
    //System.out.println(
    //        STR."\"...~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\"\{
    //                Arrays.toString(arrayBuilder.getDoubleArray())}");

    Bubble[] bubble = arrayBuilder.getDoubleArray(bubble.clone());
    System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+Arrays.toString(new Bubble[10000].clone())+"zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

    Bottle bottle = new Bottle();


    SparklingWater sparklingWater = new SparklingWater();
    //sparklingWater.pump(Bubble[1] = new Bubble(arrayBuilder.getDoubleArray()))()), bottle.waterCapacity);

    //bubble.gasCode(5);
    //bottle
//
    //Bottle bottle1 = new Bottle();
    //bottle1.bottleCapacity = 0.1;
//
    //Bottle bottle2 = new Bottle();
    //bottle2.bottleCapacity = 0.2;

  }

  // - создать класс Runner, содержащий main
  // - в нем создать 3 бутылки, объёмом 0.05, 0.1, 0.2 лира с газировкой
  // - открыть поочередно все бутылки и выпустить из них газ
}
