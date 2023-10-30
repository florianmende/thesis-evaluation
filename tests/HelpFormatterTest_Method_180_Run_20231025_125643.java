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

public class HelpFormatterTest_Method_180_Run_20231025_125643 {
    @Test
    public void testGetDescPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(0);
        assertEquals(0, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-10);
        assertEquals(-10, formatter.getDescPadding());
    }
}