package dsa.com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr =  {12,66,22,77,1,2,5};
        System.out.println("Sorted "+ Arrays.toString(selectionSortAsc(arr)));
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static int[] selectionSortAsc(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int lastElement = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastElement);

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[lastElement];
            arr[lastElement] = temp;
        }
        return arr;
    }
}
