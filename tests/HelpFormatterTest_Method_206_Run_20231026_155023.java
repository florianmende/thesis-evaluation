package org.apache.commons.cli;



import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

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

public class HelpFormatterTest_Method_206_Run_20231026_155023 {
    @Test
    public void testSetArgName() throws IOException {
        // Case 1: The method sets the 'argName' field to a non-null value.
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("name");
        Assertions.assertEquals("name", formatter.getArgName());

        // Case 2: The method sets the 'argName' field to a null value.
        formatter = new HelpFormatter();
        formatter.setArgName(null);
        Assertions.assertNull(formatter.getArgName());

        // Case 3: The method sets the 'argName' field to a value that is not a String.
        formatter = new HelpFormatter();
        formatter.setArgName("1");
        Assertions.assertEquals("1", formatter.getArgName());
    }
}