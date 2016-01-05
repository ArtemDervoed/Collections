package newpackage;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class DictionaryTest {

    @Test
    public void testFrecuaency() {
        Dictionary tester = new Dictionary("I feel shook " +
                "Everytime I close my eyes and travel " +
                "Into the place in the back of my mind ");

        Map<String, Integer> testData = new HashMap<>();
        testData.put("i", 2);
        testData.put("feel", 1);
        testData.put("shook", 1);
        testData.put("everytime", 1);
        testData.put("close", 1);
        testData.put("my", 2);
        testData.put("eyes", 1);
        testData.put("and", 1);
        testData.put("travel", 1);
        testData.put("into", 1);
        testData.put("the", 2);
        testData.put("place", 1);
        testData.put("in", 1);
        testData.put("back", 1);
        testData.put("of", 1);
        testData.put("mind", 1);
        assertEquals(testData, tester.frecuaency());
    }

    @Test
    public void testNull() {
        Dictionary tester = new Dictionary(null);
        assertEquals(null, tester.frecuaency());
    }

}