package com.linden2015.MasteringRegularExpressions;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.regex.Pattern;

public class BackreferenceTest {
    @Test
    public void backreferences() {
        assertEquals(
            true,
            Pattern.compile("\\b([a-z]+)\\s+\\1\\b")
                .matcher("the the")
                .find()
        );

        assertEquals(
            true,
            Pattern.compile("([a-z]+)\\s+\\1")
                .matcher("the the")
                .find()
        );

        assertEquals(
            true,
            Pattern.compile("\\d{2}(\\d{2})\\d{2} \\d{2}\\1\\d{2}")
                .matcher("110011 220022")
                .find()
        );

        assertEquals(
            true,
            Pattern.compile("\\b\\d{2}(\\d{2})\\d{2}\\b.*\\b\\d{2}\\1\\d{2}\\b")
                .matcher("110011 2200022 220122 220022 331133")
                .find()
        );
    }
}
