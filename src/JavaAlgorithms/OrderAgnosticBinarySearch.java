package JavaAlgorithms;

//binary search for array in descending order
public class OrderAgnosticBinarySearch {
    public static void main(String[] args){

        //System.out.println("what is happening");

        int[] arr = { 2,3,4,5,7,9,11,13,14};

        int[]arr2 = {14,13,11,9,7,5,3,2};

        int x = orderAgnosticSearch(arr, 5);
        System.out.println(x);
        int y =orderAgnosticSearch(arr2, 5);
        System.out.println(y);
    }


    public static int orderAgnosticSearch(int[]arr, int value){
        int start = 0;
        int end = arr.length -1;
        // find if the array is sorted in ascending or descending order;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = (start + end) / 2;

            if(arr[mid] == value){
                return mid;
            }
            if(isAsc){
                if(value < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if (value < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return  -1;
    }

}
