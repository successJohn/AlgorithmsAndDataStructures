package JavaAlgorithms;

public class GreatestCommonDivisor {

    public static void main(String[] args){

        var x =GCD(270,192);
        System.out.println(x);
    }
    //Euclidean Algorithm
    public static int GCD(int a , int b){
        if(b == 0){
            return  a;
        }
        return GCD(b, a%b);
    }
}
