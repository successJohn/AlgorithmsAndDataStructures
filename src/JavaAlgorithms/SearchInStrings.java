package JavaAlgorithms;

public class SearchInStrings {

    public static void main(String[] args){

        String name = "success";

        int answer = searchInRange(name, 1,4, 'e');
        System.out.println(answer);

    }

    public static boolean search(String str, char target){

        if(str.length() == 0){
            return false;
        }
        for(char value : str.toCharArray()){
            if(value == target){
                return true;
            }

        }
        return false;
    }

// Search for a character in a string within a particular range
    public static int searchInRange(String str, int start, int end, char target){
            var stringChar = str.toCharArray();
        for(int i = start; i <= end; i++){
            if(stringChar[i] == target){
                return i;
            }
        }

        return -1;
    }
}
