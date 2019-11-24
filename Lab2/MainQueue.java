package Lab2;

import java.util.*;


public class MainQueue {
    public static void main(String[] args) {
        /*PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(5);
        queue.add(6);
        queue.add(4);*/
        Queue queue = new Queue(5);
        queue.push(2);
        queue.push("three");
        queue.push("four");
        queue.push("one");

        queue.pop();
        queue.printList();
        queue.checkLimit();
        queue.printheadElement();

        /*System.out.println("head:" + queue.element());
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
    }
}
