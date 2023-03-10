package JavaAlgorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCandles {

/**
 You are in charge of the cake for a child's birthday.
 You have decided the cake will have one candle for each year of their total age.
 They will only be able to blow out the tallest of the candles.
 Count how many candles are tallest.

 Example
  Candles = [4,4,1,3]
 The maximum height candles are 4 units high. There are 2  of them, so return 2 .
 */
    public static void main(String[] args){

        List<Integer> trial = Arrays.asList(1, 3, 2, 5, 3, 3, 8, 6, 9, 8, 9, 9 );

        int bbbb = birthdayCakeCandles(trial);
        System.out.println(bbbb);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int max = 0;
        int counter = 0;

        for(int x : candles ){
            if(x > max){
                max = x;
                counter=1;
            }else if(x == max){
                counter++;
            }
        }

        return counter;


    }
}
