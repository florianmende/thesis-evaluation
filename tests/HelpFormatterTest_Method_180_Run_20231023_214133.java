package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class HelpFormatterTest_Method_180_Run_20231023_214133 {

    @Mock
    private HelpFormatter formatter;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDescPaddingPositive() {
        // Setup
        int expected = 10;
        when(formatter.getDescPadding()).thenReturn(expected);

        // Execute
        int actual = formatter.getDescPadding();

        // Verify
        assertEquals(expected, actual);
    }

    @Test
    void testGetDescPaddingZero() {
        // Setup
        int expected = 0;
        when(formatter.getDescPadding()).thenReturn(expected);

        // Execute
        int actual = formatter.getDescPadding();

        // Verify
        assertEquals(expected, actual);
    }

    @Test
    void testGetDescPaddingNegative() {
        // Setup
        int expected = -10;
        when(formatter.getDescPadding()).thenReturn(expected);

        // Execute
        int actual = formatter.getDescPadding();

        // Verify
        assertEquals(expected, actual);
    }
}