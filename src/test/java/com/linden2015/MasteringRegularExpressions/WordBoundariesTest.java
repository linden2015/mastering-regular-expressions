package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class WordBoundariesTest {
    /**
     * Word boundaries mark a position; they don't consume a character.
     */
    @Test
    public void that_dang() {
        String line = "That dang-tootin' #@!%* varmint's cost me $199.95!";

        MatcherAssert.assertThat(
            Pattern.compile("\\bThat\\b").matcher(line).find(),
            Matchers.is(true)
        );

        MatcherAssert.assertThat(
            Pattern.compile("\\bvarmint\\b").matcher(line).find(),
            Matchers.is(true)
        );

        MatcherAssert.assertThat(
            Pattern.compile("\\b199\\b").matcher(line).find(),
            Matchers.is(true)
        );

        MatcherAssert.assertThat(
            Pattern.compile("\\b95\\b").matcher(line).find(),
            Matchers.is(true)
        );
    }
}
