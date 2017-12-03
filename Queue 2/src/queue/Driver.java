/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author MarkyMark5000
 */
public class Driver {

    public static void main(String[] args) {
        LinkedListQueue q1 = randomOrderedQueue(5);
        LinkedListQueue q2 = randomOrderedQueue(5);
        q1.printList();
        q2.printList();

        LinkedListQueue merged = merge(q1, q2);

        merged.printList();
        q1.printList();
        q2.printList();

    }

    public static LinkedListQueue randomOrderedQueue(int numItems) {
        int random = 0;
        int randomGreaterInt = 0;
        LinkedListQueue randomQueue = new LinkedListQueue();
        for (int i = 0; i < numItems; i++) {
            randomGreaterInt = random + (int) (20 * Math.random());
            random = randomGreaterInt;
            randomQueue.enqueue(random);
        }
        return randomQueue;
    }

    public static LinkedListQueue merge(LinkedListQueue q1, LinkedListQueue q2) {
        LinkedListQueue mergedQueue = new LinkedListQueue();
        LinkedListQueue tempA = new LinkedListQueue();
        LinkedListQueue tempB = new LinkedListQueue();

        while (q1.getSize() > 0 && q2.getSize() > 0) {
            if ((int) q1.first() <= (int) q2.first()) {
                mergedQueue.enqueue(q1.first());
                tempA.enqueue(q1.first());
                q1.dequeue();
            } else {
                mergedQueue.enqueue(q2.first());
                tempB.enqueue(q2.first());
                q2.dequeue();
            }
        }
        if (q1.getSize() == 0 && q2.getSize() != 0) {
            while (q2.getSize() != 0) {
                mergedQueue.enqueue(q2.first());
                tempB.enqueue(q2.first());
                q2.dequeue();
            }
        } else if (q2.getSize() == 0 && q1.getSize() != 0) {
            while (q1.getSize() != 0) {
                mergedQueue.enqueue(q1.first());
                tempA.enqueue(q1.first());
                q1.dequeue();
            }
        }

        while (tempA.getSize() != 0) {
            q1.enqueue(tempA.first());
            tempA.dequeue();
        }
        while (tempB.getSize() != 0) {
            q2.enqueue(tempB.first());
            tempB.dequeue();
        }
        return mergedQueue;
    }

}
