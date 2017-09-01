package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class BackreferenceTest {

    @Test
    public void backreferences() {
        MatcherAssert.assertThat(
            Pattern.compile("\\b([a-z]+)\\s+\\1\\b")
                .matcher("the the")
                .find()
            ,
            Matchers.is(true)
        );

        MatcherAssert.assertThat(
            Pattern.compile("([a-z]+)\\s+\\1")
                .matcher("the the")
                .find(),
            Matchers.is(true)
        );

        MatcherAssert.assertThat(
            Pattern.compile("\\d{2}(\\d{2})\\d{2} \\d{2}\\1\\d{2}")
                .matcher("110011 220022")
                .find(),
            Matchers.is(true)
        );

        MatcherAssert.assertThat(
            Pattern.compile("\\b\\d{2}(\\d{2})\\d{2}\\b.*\\b\\d{2}\\1\\d{2}\\b")
                .matcher("110011 2200022 220122 220022 331133")
                .find(),
            Matchers.is(true)
        );
    }
}
