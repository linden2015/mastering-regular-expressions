package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class MetaCharactersTest {

    @Test
    public void java() {
        // A word character is [a-zA-Z0-9_]
        MatcherAssert.assertThat(
            "_".matches("\\w"),
            Matchers.is(true)
        );

        // Matching a single backslash
        MatcherAssert.assertThat(
            "\\".matches("\\\\"),
            Matchers.is(true)
        );
    }
}
