package JavaAlgorithms;

import com.sun.jdi.Value;

public class BinarySearch {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5,6};
           var x = findValue(arr, 6);
        System.out.println(x);
    }
    public static int findValue(int[]arr, int value){
        int min = 0;
        int max = arr.length -1;
        int guess = 0;

        while(min <= max){
            guess = Math.round( (min + max)/2 );

            if ( arr[guess] == value)
                return guess;

            else if(arr[guess] > value){
                min = guess + 1;
            }

            else if(arr[guess] > value)

               max = guess -1;
        }

        return -1;
    }

}
