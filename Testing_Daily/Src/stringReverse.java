package charchiltesing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

    @Test
    void testReverse() {
        DayTesting util = new DayTesting();

        // Test cases
        assertEquals("cba", util.reverse("abc"));
        assertEquals("54321", util.reverse("12345"));
        assertEquals("a", util.reverse("a"));
        assertEquals("", util.reverse(""));
        assertNull(util.reverse(null)); // Testing for null input
        assertEquals(" ", util.reverse(" ")); // Single space character
    }
}

