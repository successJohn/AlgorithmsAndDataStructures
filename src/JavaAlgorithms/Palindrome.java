package JavaAlgorithms;

public class Palindrome {

    public static void main(String[] args) {
        var j = findPalindrome(78987);
        System.out.println(j);

        var k =findPalindrome(21);
        System.out.println(k);

        var l = findPalindrome(8);
        System.out.println(l);

    }

    public static Boolean findPalindrome(int n){

        int orignalNumber = n;

        var palindrome = "";
        int check;

        while(n>0){
            check = n%10; // to get last digit of a number, you do number % 10
            n  = n/10;


            palindrome +=check;  // So i am getting the last digit of the remaining number and adding it to the
        }
        var palindromeNumber = Integer.parseInt(palindrome);
        if(palindromeNumber == orignalNumber){
            return true;
        }else{
            return false;
        }

    }
}
