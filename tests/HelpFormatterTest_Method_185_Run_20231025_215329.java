package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; // <-- added import statement

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_185_Run_20231025_215329 {

    @Test
    public void testGetOptionComparator() {
        // Test that the method returns a non-null Comparator object
        HelpFormatter formatter = new HelpFormatter();
        assertNotNull(formatter.getOptionComparator());

        // Test that the Comparator returned by the method sorts options in case-insensitive alphabetical order by option key
        Option option1 = mock(Option.class);
        when(option1.getKey()).thenReturn("key1");
        Option option2 = mock(Option.class);
        when(option2.getKey()).thenReturn("key2");
        Option option3 = mock(Option.class);
        when(option3.getKey()).thenReturn("key3");

        List<Option> options = new ArrayList<Option>();
        options.add(option1);
        options.add(option2);
        options.add(option3);

        Comparator<Option> comparator = formatter.getOptionComparator();
        Collections.sort(options, comparator); // <-- corrected line

        assertEquals("key1", options.get(0).getKey());
        assertEquals("key2", options.get(1).getKey());
        assertEquals("key3", options.get(2).getKey());

        // Test that the Comparator returned by the method is the same as the one set using the setOptionComparator() method
        Comparator<Option> customComparator = new Comparator<Option>() {
            @Override
            public int compare(Option o1, Option o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        };

        formatter.setOptionComparator(customComparator);
        comparator = formatter.getOptionComparator();
        Collections.sort(options, comparator); // <-- corrected line

        assertEquals("key1", options.get(0).getKey());
        assertEquals("key2", options.get(1).getKey());
        assertEquals("key3", options.get(2).getKey());
    }
}