package JavaCore.Lesson3;

import java.util.Arrays;

public class MixArray<T extends Object> {
    private T[] array;

    public MixArray(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "MixArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public T[] changeElements(int x, int y) {
        if(x>=0 & y>=0 & array.length > x & array.length > y){
            T z = array[x];
            array[x] = array[y];
            array[y] = z;
        }
        return array;
    }


    public static void main(String[] args) {
        MixArray<String> array1 = new MixArray<>("Test","NOK","OK");
        System.out.println("Исходный массив: " + array1.toString());
        array1.changeElements(0,1);
        System.out.println("Измененный массив: " + array1.toString());
    }

}