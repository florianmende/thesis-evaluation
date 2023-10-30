package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.*;

public class HelpFormatterTest_Method_185_Run_20231027_232619 {

    @Test
    public void testGetOptionComparatorNotNull() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        assertNotNull(comparator);
    }

    @Test
    public void testGetOptionComparatorAlphabetical() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        List<Option> options = new ArrayList<>();
        options.add(new Option("a", "Option A"));
        options.add(new Option("b", "Option B"));
        options.add(new Option("c", "Option C"));
        Collections.sort(options, comparator);
        assertEquals("a", options.get(0).getOpt());
        assertEquals("b", options.get(1).getOpt());
        assertEquals("c", options.get(2).getOpt());
    }

    @Test
    public void testGetOptionComparatorCaseInsensitive() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        List<Option> options = new ArrayList<>();
        options.add(new Option("A", "Option A"));
        options.add(new Option("b", "Option B"));
        options.add(new Option("C", "Option C"));
        Collections.sort(options, comparator);
        assertEquals("A", options.get(0).getOpt());
        assertEquals("b", options.get(1).getOpt());
        assertEquals("C", options.get(2).getOpt());
    }
}