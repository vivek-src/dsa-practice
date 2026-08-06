package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetIterative {
    static void main() {
        int[] arr = {1,2,2};
        List<List<Integer>> subset = SubsetsDuplicate(arr);
        for(List<Integer> element : subset){
            System.out.println(element);
        }

    }
    static List<List<Integer>> Subset(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int num : arr){
            int n = ans.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(ans.get(i));
                internal.add(num);
                ans.add(internal);
            }
        }

        return ans;

    }
z
}
