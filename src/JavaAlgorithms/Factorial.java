package JavaAlgorithms;

public class Factorial {
    public static void main(String[] args){
       int x =  recursiveFactorial(5);
        System.out.println(x);

        int y = iterativeFactiorial(5);
        System.out.println(y);
    }

    public static int recursiveFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * recursiveFactorial(n-1);
    }

    public static int iterativeFactiorial(int n){
        int fac = 1;

        for(int i= 2;i <= n; i++ ){
            fac*=i;
        }

        return fac;
    }
}
