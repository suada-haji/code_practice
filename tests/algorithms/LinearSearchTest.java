package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {
    @Test
    public void linearSearch() {
        int[]a = {1, 2, 3, 4, 5, 19, 17, 7};
        assertTrue(LinearSearch.contains(a, 17));
        assertTrue(LinearSearch.contains(a, 1));
        assertTrue(LinearSearch.contains(a, 2));
        assertTrue(LinearSearch.contains(a, 3));
        assertTrue(LinearSearch.contains(a, 4));
        assertFalse(LinearSearch.contains(a, 10));
    }

}