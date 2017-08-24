package com.linden2015.MasteringRegularExpressions;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class RunCaseInsentitively {
    @Test
    public void test() {
        assertEquals(
            true,
            Pattern.compile("^abc$", Pattern.CASE_INSENSITIVE)
                .matcher("ABC")
                .matches()
        );
        assertEquals(
            true,
            Pattern.compile("^à$", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE)
                .matcher("À")
                .matches()
        );
    }
}
