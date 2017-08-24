package com.linden2015.MasteringRegularExpressions;

import org.junit.Test;
import static org.junit.Assert.*;

public class MetaCharactersTest {
    @Test
    public void java() {
        // A word character is [a-zA-Z0-9_]
        assertTrue("_".matches("\\w"));
        // Matching a single backslash
        assertTrue("\\".matches("\\\\"));
    }
}
