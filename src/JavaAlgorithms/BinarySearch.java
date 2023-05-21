package JavaAlgorithms;



public class BinarySearch {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5,6};
           var x = findtarget(arr, 6);
        System.out.println(x);
    }
    public static int findtarget(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;


        while(start <= end){
            int mid = Math.round( (start + end)/2 );

            if ( arr[mid] == target)
                return mid;

            else if (target < arr[mid]){
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
