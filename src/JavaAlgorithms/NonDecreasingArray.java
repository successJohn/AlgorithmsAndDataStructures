package JavaAlgorithms;

public class NonDecreasingArray {

    public static void main(String[] args){
        int [] p  = {4,2,3};

        var y = NonDecreaseArray(p);

        System.out.println(y);
    }

    public static boolean NonDecreaseArray(int [] nums){
        int count = 1;
        while(count != 0){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] > nums[i]+1){
                    nums[i] = nums[i]+1;
                }

            }
            count--;
            return  true;
        }
    return  false;
    }
}


