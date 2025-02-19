package dsa.com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {99,22,55,77,34,54,100,10};
        System.out.println("Ascending sorting : "+ Arrays.toString(bubbleSortASC(arr)));
        System.out.println("Descending sorting : "+ Arrays.toString(bubbleSortDESC(arr)));

    }

    public static int[] bubbleSortASC(int[] arr){
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 1; j < arr.length; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSortDESC(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
