package JavaAlgorithms;

import java.util.HashMap;

public class FirstUniqueCharacter {
    //Given a string, find the first non-repeating character in it and return its index.If it doesn't exist, return -1.
    //Examples:
    //s = "leetcode"
      //      return 0.
    public static  void main(String[] args) {
        var x = firstUnique("loveleetcode");
       // System.out.println(x);

        HashMap<Character, Integer> come = new HashMap<>();

        char val = 's';
        come.put(val, 1);
        come.put('u', 2);

        come.put(val, val+1);
        System.out.println(come.get('u'));
    }
    public static int firstUnique(String s){
        HashMap<Character, Integer> freq = new HashMap<>();
        // count freq

        for(int i = 0; i < s.length(); i++){
            
            char val = s.charAt(i);

            Integer count = freq.get(val);

            if(count == null){
                freq.put(val,1);

            }else{
                freq.put(val, val + 1);
            }


        }

        for(int i = 0; i < s.length(); i++){
            if(freq.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}
