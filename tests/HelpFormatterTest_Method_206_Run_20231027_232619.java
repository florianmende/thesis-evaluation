package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelpFormatterTest_Method_206_Run_20231027_232619 {
    @Test
    public void testSetArgName() {
        // Case 1: The method sets the defaultArgName field to the value passed as argument.
        HelpFormatter formatter = new HelpFormatter();
        formatter.setArgName("argName");
        assertEquals("argName", formatter.getArgName());

        // Case 2: The method throws a NullPointerException if the argument is null.
        try {
            formatter.setArgName(null);
        } catch (NullPointerException e) {
            throw new RuntimeException("NullPointerException thrown");
        }

        // Case 3: The method does not throw any exception if the argument is not null.
        formatter.setArgName("argName");
    }
}