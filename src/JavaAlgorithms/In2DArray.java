package JavaAlgorithms;

import java.util.Arrays;

public class In2DArray {
    public static void main(String[] args){
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34}
        };
        /*
        System.out.println(arr[2][2]);
        System.out.println(arr.length);

        var x = searchIn2DArray(arr, 12);
        System.out.println(Arrays.toString(x));

        var max = maximumIn2DArrays(arr);
        System.out.println(max);
    */
    }

    public static int[] searchIn2DArray(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }

    public static int maximumIn2DArrays(int[][] arr){
        int max = 0;
        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }



}
