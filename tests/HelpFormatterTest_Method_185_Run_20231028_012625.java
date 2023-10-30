package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_185_Run_20231028_012625 {

    @Test
    void testGetOptionComparatorReturnsComparator() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Comparator<Option> comparator = helpFormatter.getOptionComparator();
        assertNotNull(comparator);
    }

    @Test
    void testGetOptionComparatorReturnsCaseInsensitiveComparator() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Comparator<Option> comparator = helpFormatter.getOptionComparator();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.getKey()).thenReturn("key");
        when(option2.getKey()).thenReturn("KEY");
        assertEquals(0, comparator.compare(option1, option2));
    }

    @Test
    void testGetOptionComparatorReturnsAlphabeticalComparator() {
        HelpFormatter helpFormatter = new HelpFormatter();
        Comparator<Option> comparator = helpFormatter.getOptionComparator();
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.getKey()).thenReturn("a");
        when(option2.getKey()).thenReturn("b");
        assertEquals(-1, comparator.compare(option1, option2));
    }
}