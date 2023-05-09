package JavaAlgorithms;

import java.util.Arrays;

public class SecondLargestElement {
     public static void main(String[] args){

          int[] arr = {4, 20, 78, 0, 23};
          int[] p = {10, 7, 2, 10,10,9};

          int k = findLargest(p);

          System.out.println(k);

          Arrays.sort(arr);

          System.out.println(Arrays.toString(arr));

/*
          int [] hhj = {1,3, 6};
         boolean x =  sortedArray(hhj);
          System.out.println(x);
          */

     }

     public static int findLargest(int[] arr){
          int largest = arr[0];
          int secondLargest = 0;

          for(int i = 0; i < arr.length; i++){
               if(largest < arr[i]){
                    largest = arr[i];
               }
          }

          for(int i = 0; i < arr.length; i++){
               if(secondLargest < arr[i] && arr[i] < largest){
                    secondLargest = arr[i];
               }else {
                    secondLargest = -1;
               }
          }
          return secondLargest;
     }

     public static boolean sortedArray(int[] arr){
          for(int i = 0; i < arr.length; i++){
             for(int j = i+ 1; j < arr.length; j++){
               if(arr[j] < arr[i]){
                    return false;
               }
             }
          }
          return true;
     }
}
