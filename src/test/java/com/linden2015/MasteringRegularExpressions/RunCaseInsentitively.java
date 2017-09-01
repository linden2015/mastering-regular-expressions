package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class RunCaseInsentitively {
    @Test
    public void test() {
        MatcherAssert.assertThat(
            Pattern.compile("^abc$", Pattern.CASE_INSENSITIVE)
                .matcher("ABC")
                .matches(),
            Matchers.is(true)
        );

        MatcherAssert.assertThat(
            Pattern.compile("^à$", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE)
                .matcher("À")
                .matches(),
            Matchers.is(true)
        );
    }
}
