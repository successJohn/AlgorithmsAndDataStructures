package JavaAlgorithms;

public class MaxConsecutiveOnes {
/* Given a binary array nums, return the maximum number of consecutive 1's in the array.*/
    public static void main(String [] args){
    int[] num1 = new int[]{1,0,1,0,1,1};
    int[] num2 = new int[]{1,1,0,1,1,1};

   var x =  findMaxConsecutiveOnes(num1);
    var y = findMaxConsecutiveOnes(num2);

    System.out.println(x);
    System.out.println(y);
    }

    public static int findMaxConsecutiveOnes(int[] nums){
        int freq = 0;
        int maxConsecutiveCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                freq++;

                if(freq > maxConsecutiveCount){          //{1,0,1,0,1,1};
                    maxConsecutiveCount = freq;
                }
            }else{
                freq = 0;
            }
        }

        return maxConsecutiveCount;
    }


    public int findNumbers(int[] nums) {
        int count = 0;
        for(int x : nums){
            String str = String.valueOf(x);
            if(str.length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
