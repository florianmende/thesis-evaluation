package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_205_Run_20231024_060930 {

    @Test
    public void testRtrimWithNullString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim(null);
        assertEquals(null, result);
    }

    @Test
    public void testRtrimWithEmptyString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("");
        assertEquals("", result);
    }

    @Test
    public void testRtrimWithWhitespaceString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("   ");
        assertEquals("", result);
    }

    @Test
    public void testRtrimWithMixedString() {
        HelpFormatter formatter = new HelpFormatter();
        String result = formatter.rtrim("hello world  ");
        assertEquals("hello world", result);
    }
}