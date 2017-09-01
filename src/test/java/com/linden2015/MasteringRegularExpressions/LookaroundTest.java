package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class LookaroundTest {

    @Test
    public void thousand_separator() {
        MatcherAssert.assertThat(
            "123456789".replaceAll("(?<=\\d)(?=(\\d{3})+$)", ","),
            Matchers.equalTo("123,456,789")
        );
    }

    @Test
    public void combo_with_count() {
        MatcherAssert.assertThat(
            "ab1212".matches("^(?=[a-z]{2}\\d{4}).*(\\d{2})\\1$"),
            Matchers.equalTo(true)
        );
    }
}
