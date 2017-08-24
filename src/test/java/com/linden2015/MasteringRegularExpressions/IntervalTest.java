package com.linden2015.MasteringRegularExpressions;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.regex.Pattern;

public class IntervalTest {
    @Test
    public void intervals() {
        assertEquals(true, Pattern.compile("\\d{4,5}").matcher("1111").matches());
        assertEquals(true, Pattern.compile("\\d{4,5}").matcher("11111").matches());
        // Only min specific
        assertEquals(true, Pattern.compile("\\d{4}").matcher("1111").matches());
        assertEquals(true, Pattern.compile("\\d{4,}").matcher("1111").matches());
        // Min and max the same
        assertEquals(true, Pattern.compile("\\d{5,5}").matcher("11111").matches());
        // Min 0 times
        assertEquals(true, Pattern.compile("abc\\d{0}").matcher("abc").matches());
        assertEquals(true, Pattern.compile("abc\\d{0,1}").matcher("abc2").matches());
        // Group
        assertEquals(true, Pattern.compile("(10){3}").matcher("101010").matches());
        assertEquals(false, Pattern.compile("(10){3}").matcher("1010").matches());
    }
}
