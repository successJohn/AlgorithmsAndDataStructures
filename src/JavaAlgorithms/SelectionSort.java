package JavaAlgorithms;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {40, 9, 2 ,5};

        var c = SelectionSort(arr);

        //System.out.println(c);
        for(int x : c){
            System.out.println(x);
        }

        var tester = GetPalindrome(121);

        System.out.println(tester);

    }

    public static int[] SelectionSort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int smallestValue = i;
            for(int j = i +1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    smallestValue = j;
                }
            }

            var temp = arr[i];
            arr[i] = arr[smallestValue];
            arr[smallestValue] = temp;
        }

        return arr;
    }

    public static int EuclideanAlgorithm(int a, int b){
        if(b == 0) return  a;

        return  EuclideanAlgorithm(b, a%b);
    }


    public static boolean GetPalindrome (int n){
        int reverse = 0;
        int multiply = 1;

        while( n != 0){
            int x = n% 10;
            reverse = (reverse * multiply) + x;
            multiply = multiply * 10;
            n = n/10;
        }

        if(reverse == n){
            return  true;
        }

        return  false;
    }

}
