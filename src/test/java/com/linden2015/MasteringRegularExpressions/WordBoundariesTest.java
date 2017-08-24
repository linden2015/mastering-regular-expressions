package com.linden2015.MasteringRegularExpressions;

import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.assertTrue;

public class WordBoundariesTest {
    /**
     * Word boundaries mark a position; they don't consume a character.
     */
    @Test
    public void that_dang() {
        String line = "That dang-tootin' #@!%* varmint's cost me $199.95!";
        assertTrue(Pattern.compile("\\bThat\\b").matcher(line).find());
        assertTrue(Pattern.compile("\\bvarmint\\b").matcher(line).find());
        assertTrue(Pattern.compile("\\b199\\b").matcher(line).find());
        assertTrue(Pattern.compile("\\b95\\b").matcher(line).find());
    }
}
