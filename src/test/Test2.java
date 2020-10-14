package test;

import main.task2.BiQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test2 {

    private final BiQueue queue = new BiQueue();

    @Test
    public void testInsert(){
        queue.insert(1);
        assertEquals("1 ", queue.showHeap());
    }

    @Test
    public void testClear(){
        queue.insert(1);
        queue.clearHeap();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSequence(){
        queue.insert(5);
        queue.insert(56);
        queue.insert(1);
        queue.insert(9);
        assertEquals("56 5 9 1 ", queue.showHeap());
    }

    @Test
    public void testSequenceWithMerge(){
        queue.insert(1);
        queue.insert(2);
        queue.insert(0);
        queue.insert(3);
        queue.insert(6);
        queue.insert(9);
        queue.insert(5);
        queue.insert(1);

        assertEquals("9 6 5 1 2 1 3 0 ", queue.showHeap());
    }

    @Test
    public void testRemoveSmallest(){
        queue.insert(5);
        queue.insert(56);
        queue.insert(1);
        queue.insert(9);

        queue.removeSmallest();
        assertEquals("9 56 5 ", queue.showHeap());
    }
}
