package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;
import org.junit.Test;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            // The range metacharacter is treated as a plain character when on
            // the edge.
            {true, "^[-a]$", "a"},
            {true, "^[-a]$", "-"},
            {true, "^[a-]$", "a"},
            {true, "^[a-]$", "-"},
            // Quantifying metacharacters have no special meaning inside a
            // character class.
            {false, "^[.]$", "a"},
            {false, "^[?]$", "a"},
            {false, "^[a?]$", ""},
            {true, "^[a?]$", "?"},
            {true, "^[*]$", "*"},
            {false, "^[.]$", "_"},
            {true, "^[.]$", "."},
            // Negated character class
            {true, "^[^0]$", "1"},
            {false, "^[^0]$", "0"},
            {true, "^[^0-3]$", "4"},
            {false, "^[^0-3]$", "1"},
            {true, "^[0^1]$", "^"},
            {true, "^[01^]$", "^"},
            // Dot is a shortcut for a character class matching any char
            {true, "^.$", "_"},
            {false, "^.$", ""},
            // Alternation
            {true, "^3(0|1|2)5$", "325"},
        });
    }

    private boolean expected;

    private String pattern;

    private String target;

    public ParameterizedTest(boolean expected, String pattern, String target) {
        this.expected = expected;
        this.pattern = pattern;
        this.target = target;
    }

    @Test
    public void test() {
        MatcherAssert.assertThat(
            Pattern.matches(pattern, target), Matchers.equalTo(expected)
        );
    }
}