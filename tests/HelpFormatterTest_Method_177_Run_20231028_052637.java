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

public class HelpFormatterTest_Method_177_Run_20231028_052637 {

    @Test
    public void testCreatePadding() {
        // Test case 1: The method returns a String of the correct length
        int len = 10;
        String padding = createPadding(len);
        Assertions.assertEquals(len, padding.length());

        // Test case 2: The method returns a String of spaces only
        len = 5;
        padding = createPadding(len);
        Assertions.assertEquals("     ", padding);

        // Test case 3: The method returns a String that is not null
        len = 0;
        padding = createPadding(len);
        Assertions.assertNotNull(padding);
    }

    private String createPadding(int len) {
        return new HelpFormatter().createPadding(len);
    }
}