package com.linden2015.MasteringRegularExpressions;

import com.jcabi.matchers.RegexMatchers;
import java.util.regex.Pattern;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class ReplaceTest {

    @Test
    public void replace_all() {
        MatcherAssert.assertThat(
            Pattern.compile("\\bjeff\\b", Pattern.CASE_INSENSITIVE)
                .matcher("jeff Friedl jeffrey Friedl")
                .replaceAll("Jeff"),
            Matchers.equalTo("Jeff Friedl jeffrey Friedl")
        );
    }
}