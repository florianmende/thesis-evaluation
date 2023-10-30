package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import java.util.Comparator; // Added import statement for Comparator

public class HelpFormatterTest_Method_185_Run_20231025_121248 {

    @Test
    public void testGetOptionComparator() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        Assertions.assertNotNull(comparator);
    }

    @Test
    public void testComparatorSortsOptionsInCaseInsensitiveAlphabeticalOrder() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        Option optionA = new Option("a", "Option A");
        Option optionB = new Option("b", "Option B");
        Option optionC = new Option("c", "Option C");
        List<Option> options = Arrays.asList(optionA, optionB, optionC);
        Collections.sort(options, comparator);
        Assertions.assertEquals(Arrays.asList(optionA, optionB, optionC), options);
    }

    @Test
    public void testComparatorHandlesOptionsWithDifferentLengths() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        Option optionA = new Option("a", "Option A");
        Option optionB = new Option("bb", "Option B");
        Option optionC = new Option("ccc", "Option C");
        List<Option> options = Arrays.asList(optionA, optionB, optionC);
        Collections.sort(options, comparator);
        Assertions.assertEquals(Arrays.asList(optionA, optionB, optionC), options);
    }
}