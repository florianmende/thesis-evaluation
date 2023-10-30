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

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_183_Run_20231028_042634 {

    @Test
    public void testGetLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorDefault() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(" ", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorNotSet() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }
}