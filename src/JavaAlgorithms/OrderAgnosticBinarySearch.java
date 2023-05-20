package JavaAlgorithms;

//binary search for array in descending order
public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int[] arr = { 2,3,4,5,7,9,11,13,14};

        int[]arr2 = {14,13,11,9,7,5,3,2};

        int x =OrderAgnosticSearch(arr, 5);
        System.out.println(x);

        int y =OrderAgnosticSearch(arr2, 5);
        System.out.println(y);
    }


    public static int OrderAgnosticSearch(int[]arr, int value){

        int start = 0;
        int end = arr.length -1;
        int mid = 0;

        // find if the array is sorted in ascending or descending order;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            mid = start+end /2;

            if(arr[start] == value){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > value){
                    end = mid -1;
                }

                else if(arr[mid] < value){
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] > value) {
                        start = mid + 1;
                } else if (arr[mid] < value) {
                        end = mid - 1;
                }
            }
        }

        return  -1;
    }
}
