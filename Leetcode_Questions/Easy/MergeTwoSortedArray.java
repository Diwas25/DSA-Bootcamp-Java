package Easy;

// Helper video
//watch?v=mF3ofENSeg8&t=356s

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        //TC - 0(M*N);
        //SC - 0(1);

        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};

        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;

        while(i<n){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                fixArray2(arr2);
            }
            i++;
        }
        System.out.println("First Array : "+ Arrays.toString(arr1));
        System.out.println("Second Array : "+Arrays.toString(arr2));
    }

    public static void fixArray2(int[] arr2){
        for(int i=1;i< arr2.length;i++){
            if(arr2[i]<arr2[i-1]){
                int temp = arr2[i];
                arr2[i] = arr2[i-1];
                arr2[i-1] = temp;
            }
        }
    }
}
