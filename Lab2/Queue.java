package Lab2;


import java.util.LinkedList;

public class Queue<E> {
    private int maxSize,count;
    private LinkedList<E>queue;
    private boolean hasParameter;

    public Queue() {
        hasParameter = false;
    }

    public Queue(int capacity) {
        hasParameter = true;
        queue = new LinkedList<>();
        maxSize = capacity;
    }

    public void push(E element) {
        if (checkIfFull() == false) {
            queue.add(element);
          count++;
        }
    }

    public boolean checkIfFull() {
        if (hasParameter) {
            if (count == maxSize) {
                System.out.println("queue is full!");
                return true;
            }
            return false;
        }
        else return false;
    }

    public boolean checkIfEmpty(){
        if(count == 0){
            System.out.println("queue is empty!");
            return true;
        }
        return false;
    }


    public void pop(){
        if(!checkIfEmpty()){
            queue.remove(0);
            count--;
        }
        else System.out.println("Queue is empty");
    }

    public void printList(){
        System.out.println(queue);
    }

    public void checkLimit(){
        if(hasParameter) {
            System.out.println("Your queue is limited " + maxSize);
        }
        else System.out.println("Your queue is endless");
    }

    public void printheadElement(){
        System.out.println(queue.get(0));
    }
}

