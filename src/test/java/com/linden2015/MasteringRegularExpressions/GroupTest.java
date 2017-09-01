package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class GroupTest {

    @Test
    public void group_numbering_left_to_right() {
        Matcher matcher = Pattern.compile("(1((2)3))").matcher("123");
        MatcherAssert.assertThat(matcher.matches(), Matchers.is(true));
        MatcherAssert.assertThat(matcher.group(1), Matchers.equalTo("123"));
        MatcherAssert.assertThat(matcher.group(2), Matchers.equalTo("23"));
        MatcherAssert.assertThat(matcher.group(3), Matchers.equalTo("2"));

        MatcherAssert.assertThat(
            Pattern.compile("(1(2))(3)\\3\\2\\1").matcher("1233212").matches(),
            Matchers.is(true)
        );
    }
}
