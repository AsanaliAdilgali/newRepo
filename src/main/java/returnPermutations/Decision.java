package returnPermutations;

import java.util.ArrayList;
import java.util.List;

public class Decision {
    public static void main(String[] args) {
        Decision.permute(java.util.Arrays.asList(1,2,3,4),0);
    }
    static void permute(java.util.List<Integer> arr, int a){
        for (int i = a; i < arr.size(); i++) {
            java.util.Collections.swap(arr,i,a);
            permute(arr,a + 1);
            java.util.Collections.swap(arr,a,i);
        }
        if (a == arr.size() - 1){
            System.out.println(java.util.Arrays.toString(arr.toArray()));
        }
    }
}