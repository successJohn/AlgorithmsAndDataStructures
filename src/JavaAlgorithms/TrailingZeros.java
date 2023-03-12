package JavaAlgorithms;

public class TrailingZeros {


    // Given an integer N, return the number of trailing zeros
    public static void main(String[] args){
      int x =   findTrailingZeros(10200);
        System.out.println(x);
    }

    public static int findTrailingZeros(int n){
        int count = 0;
        //int fac ;

            while( n % 10 == 0) {  //an integer modulo 10 gives the last digit of the integer.
                count++; // as long as the last digit is 0, we keep counting
                n = n / 10;
            }


        return count;
    }
}
