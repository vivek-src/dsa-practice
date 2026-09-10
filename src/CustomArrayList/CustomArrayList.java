package CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
         data[size++] = num;
    }
    public int remove(){
        if (size == 0) {
            throw new RuntimeException("Cannot remove from an empty list");
        }
        return data[--size];
    }

    public int getData(int  index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        data = Arrays.copyOf(data, data.length * 2);
    }

    public void printList(){
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+",");
        }
        System.out.println("]");
    }
}
