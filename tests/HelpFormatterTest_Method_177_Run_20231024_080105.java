package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class HelpFormatterTest_Method_177_Run_20231024_080105 {
    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();

        // Case 1: The method returns a String of the correct length.
        assertEquals(10, formatter.createPadding(10).length());

        // Case 2: The method returns a String consisting only of spaces.
        assertEquals("          ", formatter.createPadding(10));

        // Case 3: The method returns a new String instance each time it is called.
        assertNotSame(formatter.createPadding(10), formatter.createPadding(10));
    }
}