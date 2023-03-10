package JavaAlgorithms.Arrays;

public class Array{
    private  int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        // If array is full, resize

        if(items.length == count){
            // create a new array(twice
            int [] newItems = new int[count * 2];

            //copy all existing items
            for (int i = 0; i < count;i++){
                newItems[i] = items[i];
            }
        // set items to the new array
            items = newItems;
        }
        //Add new item at the end

        items[count] = item;
        count ++;
    }

    public  void print(){
        for(int i = 0; i < count; i ++){
            System.out.println(items[i]);
        }
    }
}
