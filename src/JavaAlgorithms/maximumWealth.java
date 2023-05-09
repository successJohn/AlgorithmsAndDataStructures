package JavaAlgorithms;

public class maximumWealth {
    public static void main(String[] args){
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34}
        };

        var x = maxWealth(arr);
        System.out.println(x);
    }

    public static int maxWealth(int[][] accounts) {
        int largest = 0;
        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){
                sum += accounts[row][col];
            }

            if(sum > largest){
                largest = sum;
            }
        }

        return largest;
    }
}
