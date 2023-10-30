package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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

class HelpFormatterTest_Method_183_Run_20231024_004630 {
    @Test
    public void testGetLongOptSeparator() {
        // Case 1: Non-default value
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Case 2: Default value
        formatter = new HelpFormatter();
        assertEquals(" ", formatter.getLongOptSeparator());

        // Case 3: Not set at all, default value used
        formatter = new HelpFormatter();
        assertEquals(" ", formatter.getLongOptSeparator());
    }

    private void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }
}