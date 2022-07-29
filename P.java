import java.util.*;
class P{
    public static void main(String args[]){
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("1Ajay");
        queue.add("2Ammit");
        queue.add("3Danyal");
        queue.add("4Joel");
        queue.add("5Rahul");
        queue.add("6Sara");
        queue.add("7Zafar");

        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());

        System.out.println("iterating the queue elements:");
        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        
        System.out.println("after removing two elements:");
        queue.poll();
        queue.poll();
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}

