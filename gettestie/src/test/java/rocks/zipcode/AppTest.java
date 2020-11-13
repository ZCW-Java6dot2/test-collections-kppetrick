package rocks.zipcode;

import org.junit.Test;

import java.util.*;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOGGER = Logger.getLogger(AppTest.class.getName());
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testHashSet(){
        HashSet<Integer> test = new HashSet<>();
        assertTrue(test.isEmpty());
        test.add(543);
        assertTrue(test.contains(543));
        assertFalse(test.add(543));
    }

    @Test
    public void testArrayList(){
        ArrayList<Integer> test = new ArrayList<>();
        assertEquals(0, test.size());
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        assertEquals(2, test.lastIndexOf(1));
        test.remove(3);
        assertFalse(test.contains(3));
    }

    @Test
    public void testHashMap(){
        HashMap<Character, Integer> test = new HashMap<>();
        assertTrue(test.isEmpty());
        Integer a = 12;
        Integer b = 13;
        test.put('K',a);
        assertEquals(a, test.get('K'));
        assertTrue(test.containsKey('K'));
        assertTrue(test.containsValue(a));
        assertEquals(1, test.size());
        test.put('K', b);
        assertFalse(test.containsValue(a));
    }

    @Test
    public void testLinkedList(){
        LinkedList<Integer> testLL = new LinkedList<>();
        Integer a = 4;
        Integer b = 3;
        Integer c = 1;
        Integer d = 2;
        testLL.add(a);
        testLL.add(b);
        testLL.add(c);
        testLL.add(2, d);
        assertEquals(c, testLL.get(3));
        assertEquals(a, testLL.pop());
    }

    @Test
    public void testArrayDeque(){
        ArrayDeque<Integer> testAD = new ArrayDeque<>();
        assertTrue(testAD.isEmpty());
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        testAD.add(a);
        assertTrue(testAD.contains(a));
        testAD.add(a);
        testAD.add(c);
        assertEquals(3, testAD.size());
        assertEquals(a, testAD.pop());
    }

    @Test
    public void testVector(){
        Vector<Integer> vector = new Vector<>();
        assertTrue(vector.isEmpty());
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        vector.add(a);
        assertEquals(a, vector.get(0));
        vector.add(b);
        vector.add(c);
        assertEquals(10, vector.capacity());
    }

    @Test
    public void testTreeMap(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "val");
        map.put(2, "val");
        map.put(1, "val");
        map.put(5, "val");
        map.put(4, "val");

        assertEquals("[1, 2, 3, 4, 5]", map.keySet().toString());
    }

    @Test
    public void testIteratorAndTreeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("3");
        treeSet.add("2");
        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            LOGGER.info("\n" + itr.next());
        }
    }

    @Test
    public void testPriorityQueue(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(15);
        priorityQueue.add(10);
        Integer a = 10;
        Integer b = 15;
        Integer c = 20;

        assertEquals(a, priorityQueue.poll());
        assertEquals(b, priorityQueue.poll());
        assertEquals(c, priorityQueue.poll());
    }
}
