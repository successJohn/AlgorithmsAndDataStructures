package JavaAlgorithms;

public class Palindrome {

    public static void main(String[] args) {
        var j = findPalindrome(78987);
        System.out.println(j);

    }

    public static Boolean findPalindrome(int n){

        int orignalNumber = n;

        var palindrome = "";
        int check;

        while(n>0){
            check = n%10;
            n  = n/10;


            palindrome +=check;
        }
        var palindromeNumber = Integer.parseInt(palindrome);
        if(palindromeNumber == orignalNumber){
            return true;
        }else{
            return false;
        }

    }
}
