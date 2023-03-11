package JavaAlgorithms;

public class CountDigits {

    // given an integer, count the number of digits in the integer

    public static void main(String[] args){


       var test =  countDigit(789);
        System.out.println(test);
    }

    public static int countDigit(int digits){
        int count = 0;

        while(digits > 0){
            digits = digits/10; // dividing a number by 10 in java removes the last digit
            count++;
        }

        return count;
    }
}
