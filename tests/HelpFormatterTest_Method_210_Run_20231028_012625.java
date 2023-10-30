package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelpFormatterTest_Method_210_Run_20231028_012625 {
    private static final String LONG_OPT_SEPARATOR = "=";

    @Test
    public void testSetLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator(LONG_OPT_SEPARATOR);
        assertEquals(LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
    }

    @Test
    public void testSetLongOptSeparatorUnsupported() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void testSetLongOptSeparatorSupported() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator(LONG_OPT_SEPARATOR);
        assertEquals(LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
    }
}