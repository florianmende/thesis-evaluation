package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

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

class HelpFormatterTest_Method_177_Run_20231024_004630 {
    @Test
    void testCreatePadding() {
        // Case 1: The method returns a String of the correct length.
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);
        Assertions.assertEquals(10, padding.length());

        // Case 2: The method returns a String that contains only spaces.
        padding = formatter.createPadding(10);
        Assertions.assertTrue(padding.matches("^ +$"));

        // Case 3: The method returns a String that is the same length as the input length.
        padding = formatter.createPadding(10);
        Assertions.assertEquals(10, padding.length());
    }
}