package JavaAlgorithms.LinkedListAlgo;

public class LinkedList {

    private class Node {
        private  int value;
        private  Node next;

        public Node(int value){
            this.value = value;
        }
    }


    private Node first;
    private Node last;

    //addfirst
    //addLast
    public void addLast(int item){
        var node = new Node(item);

        if(first == null){
            first = node;
            last = node;
        }else{
            last.next = node;
            last = node;
        }
    }
    //deletefirst
    //deletelast
    //contains
    //indexof
}
