package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_183_Run_20231024_165833 {
    @Test
    public void testGetLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        // Set the long option separator to "="
        formatter.setLongOptSeparator("=");
        // Get the long option separator
        String separator = formatter.getLongOptSeparator();
        // Assert that the separator is "="
        assertEquals("=", separator);
    }

    @Test
    public void testGetDefaultLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        // Get the long option separator without setting it
        String separator = formatter.getLongOptSeparator();
        // Assert that the separator is the default value
        assertEquals(" ", separator);
    }

    @Test
    public void testResetLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        // Set the long option separator to "="
        formatter.setLongOptSeparator("=");
        // Reset the long option separator to the default value
        formatter.setLongOptSeparator(" ");
        // Get the long option separator
        String separator = formatter.getLongOptSeparator();
        // Assert that the separator is the default value
        assertEquals(" ", separator);
    }
}