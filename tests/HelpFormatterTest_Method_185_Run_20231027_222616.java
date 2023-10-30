package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_185_Run_20231027_222616 {

    @Test
    public void testGetOptionComparatorDefault() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        assertNotNull(comparator);
    }

    @Test
    public void testGetOptionComparatorSet() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> mockComparator = mock(Comparator.class);
        formatter.setOptionComparator(mockComparator);
        Comparator<Option> comparator = formatter.getOptionComparator();
        assertEquals(mockComparator, comparator);
    }

    @Test
    public void testGetOptionComparatorSort() {
        HelpFormatter formatter = new HelpFormatter();
        Comparator<Option> comparator = formatter.getOptionComparator();
        List<Option> options = new ArrayList<>();
        options.add(new Option("a", "aaa"));
        options.add(new Option("b", "bbb"));
        options.add(new Option("c", "ccc"));
        Collections.sort(options, comparator);
        assertEquals(Arrays.asList(new Option("a", "aaa"), new Option("b", "bbb"), new Option("c", "ccc")), options);
    }
}