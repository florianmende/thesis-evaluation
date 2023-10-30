package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_212_Run_20231025_121248 {

    @Test
    public void testSetOptionComparator() {
        // Create a mock Comparator
        Comparator<Option> comparator = mock(Comparator.class);

        // Create a HelpFormatter object
        HelpFormatter helpFormatter = new HelpFormatter();

        // Set the option comparator to the mock comparator
        helpFormatter.setOptionComparator(comparator);

        // Check that the option comparator was set correctly
        assertEquals(comparator, helpFormatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNull() {
        // Create a HelpFormatter object
        HelpFormatter helpFormatter = new HelpFormatter();

        // Set the option comparator to null
        helpFormatter.setOptionComparator(null);

        // Check that the option comparator was set to null
        assertNull(helpFormatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorSameComparator() {
        // Create a HelpFormatter object
        HelpFormatter helpFormatter = new HelpFormatter();

        // Set the option comparator to the same comparator
        helpFormatter.setOptionComparator(helpFormatter.getOptionComparator());

        // Check that the option comparator was set correctly
        assertEquals(helpFormatter.getOptionComparator(), helpFormatter.getOptionComparator());
    }
}