package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class IntervalTest {

    @Test
    public void intervals() {
        MatcherAssert.assertThat(
            "1111".matches("\\d{4,5}"),
            Matchers.is(true)
        );
        MatcherAssert.assertThat(
            "11111".matches("\\d{4,5}"),
            Matchers.is(true)
        );

        // Only min specific
        MatcherAssert.assertThat(
            "1111".matches("\\d{4}"),
            Matchers.is(true)
        );
        MatcherAssert.assertThat(
            "1111".matches("\\d{4,}"),
            Matchers.is(true)
        );

        // Min and max the same
        MatcherAssert.assertThat(
            "11111".matches("\\d{5,5}"),
            Matchers.is(true)
        );

        // Min 0 times
        MatcherAssert.assertThat(
            "abc".matches("abc\\d{0}"),
            Matchers.is(true)
        );
        MatcherAssert.assertThat(
            "abc2".matches("abc\\d{0,1}"),
            Matchers.is(true)
        );

        // Group
        MatcherAssert.assertThat(
            "101010".matches("(10){3}"),
            Matchers.is(true)
        );
        MatcherAssert.assertThat(
            "1010".matches("(10){3}"),
            Matchers.is(false)
        );
    }
}
