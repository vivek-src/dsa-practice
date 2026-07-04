package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySearcing {
    static void main() {
        int[] arr = {1,2,4,5,6,9,12};
        int ans = findElement(arr, 9, 0);
        System.out.println(ans);

        int[] arr2 = { 1,2,4,6,6,3,9};
        System.out.println(findAllIndex(arr2,6,  0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr2,6,  0));
    }
    static int findElement(int[] arr, int target, int index){
        if(index > arr.length-1){
            return -1;
        }
        else if (arr[index] == target){
            return index;
        }
        return findElement(arr, target, ++index);
    }
    static ArrayList findAllIndex(int[] arr, int target, int index, ArrayList list){
        if(index > arr.length-1){
            return list;
        } else if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr,target,++index,list);
    }
    static ArrayList findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index > arr.length-1){
            return list;
        } else if (arr[index] == target) {
            list.add(index);
        }

        list.addAll(findAllIndex2(arr,target,++index));
        return list;
    }
}
