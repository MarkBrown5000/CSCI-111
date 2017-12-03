package queue;

/**
 *
 * @author yaw
 */
public class ArrayQueue<E> {

    private E[] queue;
    private int top = 0;
    private int bottom = 0;
    private int size = 0;

    public ArrayQueue(int maxSize) {
        //queue = new E[maxSize];
        queue = (E[]) new Object[maxSize];
    }

    public void enqueue(E e) {
        if (size < queue.length) {
            queue[bottom] = e;  //we probably want this up here, so that it fills in the top if empty.
            bottom++;     
            if (bottom == queue.length) {
                bottom = 0;
            }
            //queue[bottom] = e;  //we had this here in class, but then it won't actually fill the top.
            size++;
        }
    }
}
