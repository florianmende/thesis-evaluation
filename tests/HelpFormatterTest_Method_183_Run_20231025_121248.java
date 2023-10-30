package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
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

class HelpFormatterTest_Method_183_Run_20231025_121248 {
    @Test
    void testGetLongOptSeparator() {
        // Case 1: The method returns the correct separator when it is set to a non-empty string.
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Case 2: The method returns the correct separator when it is set to an empty string.
        formatter.setLongOptSeparator("");
        assertEquals("", formatter.getLongOptSeparator());

        // Case 3: The method returns the correct separator when it is not set (i.e., it is null).
        formatter.setLongOptSeparator(null);
        assertNull(formatter.getLongOptSeparator());
    }
}