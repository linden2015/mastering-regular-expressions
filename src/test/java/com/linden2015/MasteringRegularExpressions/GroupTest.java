package com.linden2015.MasteringRegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Test;
import static org.junit.Assert.*;

public class GroupTest {
    @Test
    public void group_numbering_left_to_right() {
        Matcher matcher = Pattern.compile("(1((2)3))").matcher("123");
        assertTrue(matcher.matches());
        assertEquals("123", matcher.group(1));
        assertEquals("23", matcher.group(2));
        assertEquals("2", matcher.group(3));

        assertTrue(
            Pattern.compile("(1(2))(3)\\3\\2\\1").matcher("1233212").matches()
        );
    }
}
