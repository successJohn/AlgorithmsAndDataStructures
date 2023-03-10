package JavaAlgorithms;

public class Primality {
    public static void main(String[] args){
        isPrime(5);
    }


    //A prime number is a number which is only divisible by 1 and itself.
    //Given number N check if it is prime or not.
    public static boolean isPrime(int N) {

        if(N == 1){
            return false;
        }

        for(int i = 2; i < N; i++){
            if (N % i == 0){
                return true;
            }
        }

        return false;
    }


    //Better Solution

    public static  boolean isPrime2(int N){
        if(N == 1){
            return  false;
        }

        if(N == 2 || N ==3){
            return  true;
        }

        for(int i = 5 ; i * i  <=N; i++){
            if(N % i == 0 || N % i + 2 == 0){
                return  false;
            }
        }

        return  true;
    }
}
