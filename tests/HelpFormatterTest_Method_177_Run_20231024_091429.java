package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class HelpFormatterTest_Method_177_Run_20231024_091429 {

    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);

        // Check that the returned String has the correct length
        assertEquals(10, padding.length());

        // Check that the returned String consists only of spaces
        for (int i = 0; i < padding.length(); i++) {
            assertEquals(' ', padding.charAt(i));
        }

        // Check that the method returns a new String instance each time it is called
        String padding2 = formatter.createPadding(10);
        assertNotSame(padding, padding2);
    }
}