package org.apache.commons.cli;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class HelpFormatterTest_Method_177_Run_20231026_105918 {

    @Test
    void testCreatePadding() {
        // Create a new HelpFormatter instance
        HelpFormatter formatter = new HelpFormatter();

        // Test that the createPadding method returns a String of the correct length
        String padding = formatter.createPadding(10);
        Assertions.assertEquals(10, padding.length());

        // Test that the String is composed of spaces
        for (char c : padding.toCharArray()) {
            Assertions.assertEquals(' ', c);
        }
    }
}