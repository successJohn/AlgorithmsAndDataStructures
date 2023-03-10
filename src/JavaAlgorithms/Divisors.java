package JavaAlgorithms;

import java.awt.*;

public class Divisors {
    public static  void main(String[] args){
         //PrintDivisors(25);
        int x = 3, y =6;
        String xBinary = Integer.toBinaryString(2);
        System.out.println(xBinary);
        System.out.println(x & y);


    }

    public static void PrintDivisors(int n){
        for(int i = 1; i * i <= n ; i++){
            if(n% i == 0){
                System.out.println(i);

                if(i != n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
}
