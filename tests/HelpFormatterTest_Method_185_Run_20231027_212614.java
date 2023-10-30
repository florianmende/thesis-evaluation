package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest_Method_185_Run_20231027_212614 {
    private HelpFormatter formatter = new HelpFormatter();

    @Test
    public void testGetOptionComparator() {
        // Case 1: Default comparator
        Comparator<Option> comparator = formatter.getOptionComparator();
        assertNotNull(comparator);

        // Case 2: Custom comparator
        Comparator<Option> customComparator = new Comparator<Option>() {
            public int compare(Option o1, Option o2) {
                return o1.getOpt().compareTo(o2.getOpt());
            }
        };
        formatter.setOptionComparator(customComparator);
        comparator = formatter.getOptionComparator();
        assertSame(customComparator, comparator);

        // Case 3: Null comparator
        formatter.setOptionComparator(null);
        comparator = formatter.getOptionComparator();
        assertNull(comparator);
    }
}