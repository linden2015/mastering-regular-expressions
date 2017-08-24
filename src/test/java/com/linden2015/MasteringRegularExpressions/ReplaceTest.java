package com.linden2015.MasteringRegularExpressions;

import org.junit.Test;
import java.util.regex.Pattern;
import static org.junit.Assert.*;

public class ReplaceTest {
    @Test
    public void replace_all() {
        assertEquals(
            "Jeff Friedl jeffrey Friedl",
            Pattern.compile("\\bjeff\\b", Pattern.CASE_INSENSITIVE)
                .matcher("jeff Friedl jeffrey Friedl")
                .replaceAll("Jeff")
        );
    }
}