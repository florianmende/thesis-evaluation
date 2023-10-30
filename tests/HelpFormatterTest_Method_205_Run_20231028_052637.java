package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class HelpFormatterTest_Method_205_Run_20231028_052637 {

    @Test
    void testRtrimEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("");
        org.junit.jupiter.api.Assertions.assertEquals("", result);
    }

    @Test
    void testRtrimNoTrailingWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("hello");
        org.junit.jupiter.api.Assertions.assertEquals("hello", result);
    }

    @Test
    void testRtrimTrailingWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("hello   ");
        org.junit.jupiter.api.Assertions.assertEquals("hello", result);
    }
}