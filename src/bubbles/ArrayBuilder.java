package bubbles;

import java.util.Random;

public class ArrayBuilder {
    public static void main(String[] args) {}
    final float ARRAY_SIZE = 10000;
    public float[] newDoubleArray = new float[10000];

    Random random = new Random();
    final float FLOAT_VALUE = random.nextFloat(9213453534534512f);

    public float[] getDoubleArray(float[] newBubblesArray) {
        this.newDoubleArray = newBubblesArray;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            newDoubleArray[i] = random.nextFloat(FLOAT_VALUE);
        }
    //System.out.println("ArrayBuilder  "+Arrays.toString(newDoubleArray)+"````````````````````````````ArrayBuilder  ");
        return newDoubleArray;
    }

}
