import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testCircle {
    @Test
    public void testfrequaehcy() {
        System.out.println(d.frecuaency(1));
        assertTrue(true);
    }
    @Test
    public void testWork() {
        List<Integer> testata = new ArrayList<Integer>();
        testata.add(1);
        testata.add(2);
        testata.add(3);
        testata.add(4);
        testata.add(5);
        testata.add(6);
        int data = Circle.lastMan(testata);
        assertEquals(data, 1);

    }
    @Test
    public void testNull() {
        List<Integer> testata = null;
        int data = Circle.lastMan(testata);
        assertEquals(data, 0);
    }

}
