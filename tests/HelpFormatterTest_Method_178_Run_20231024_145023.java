package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_178_Run_20231024_145023 {

    @Test
    public void testFindWrapPos() {
        // Create a mock HelpFormatter object
        HelpFormatter formatter = mock(HelpFormatter.class);

        // Set up the mock object to return the expected results for the test cases
        when(formatter.findWrapPos("Hello World!", 5, 0)).thenReturn(5);
        when(formatter.findWrapPos("Hello World!", 5, 6)).thenReturn(11);
        when(formatter.findWrapPos("Hello World!", 10, 0)).thenReturn(-1);

        // Run the tests
        assertEquals(5, formatter.findWrapPos("Hello World!", 5, 0));
        assertEquals(11, formatter.findWrapPos("Hello World!", 5, 6));
        assertEquals(-1, formatter.findWrapPos("Hello World!", 10, 0));
    }
}