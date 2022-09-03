package RemovingElements;

import java.util.Arrays;

public class Removing {
    public static void main(String[] args) {
        int[] arr = new int[]{85,25,45,12,36,44,78,89,56,23,35};
        int[] arr_new = new int[arr.length];

        int j = 3;

        for (int i = 0, k =0;i< arr.length;i++){
            if (i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }

        System.out.println("before deletion: " + Arrays.toString(arr));
        System.out.println("After deletion : "+Arrays.toString(arr_new));
    }
}
