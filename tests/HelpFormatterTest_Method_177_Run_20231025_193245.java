package org.apache.commons.cli;


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

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_177_Run_20231025_193245 {
    @Test
    public void testCreatePadding() {
        // Case 1: The method returns a String of the correct length.
        HelpFormatter formatter = new HelpFormatter();
        int len = 10;
        String padding = formatter.createPadding(len);
        Assertions.assertEquals(len, padding.length());

        // Case 2: The method returns a String containing only spaces.
        Assertions.assertTrue(padding.matches("^\\s+$"));

        // Case 3: The method returns a String that is not empty.
        Assertions.assertFalse(padding.isEmpty());
    }
}