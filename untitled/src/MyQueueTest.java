import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MyQueueTest {
    private MyQueue<Integer> queue;

    @BeforeEach

    void setUp(){
        queue = new MyQueue<Integer>();
    }
    @Test
    void testisEmpty(){
        assertEquals(true, queue.isEmpty());
    }


    @Test
    void testDequeueIsEmpty(){
        assertEquals(null, queue.dequeue());
    }

    @Test
    void testDequeue(){
        queue.enqueue(1);
        assertEquals(1, queue.dequeue());
    }

    @Test
    void testEnqueue(){
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    void testPeek(){
        queue.enqueue(1);
        assertEquals(1, queue.peek());
        assertEquals(false, queue.isEmpty());
    }

    @Test
    void testGetSize(){
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.getSize());
    }

}
