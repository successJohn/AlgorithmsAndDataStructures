package JavaAlgorithms;



public class BinarySearch {
    public static void main(String [] args){
        int[] arr = {17, 13, 10, 9, 7, 5, 2};
           var x = findtarget(arr, 7);
        System.out.println(x);
    }
    public static int findtarget(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;


        while(start <= end){
            int mid = (start + end)/2;

            if ( arr[mid] == target)
                return mid;

            else if (target < arr[mid]){
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return -1;
    }

}
