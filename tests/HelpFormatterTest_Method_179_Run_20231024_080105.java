package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.List;

public class HelpFormatterTest_Method_179_Run_20231024_080105 {

    @Test
    public void testGetArgName_NonEmptyString() {
        // Set up mock object
        HelpFormatter mockHelpFormatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(mockHelpFormatter.getArgName()).thenReturn("argName");

        // Call the method and verify the result
        String result = mockHelpFormatter.getArgName();
        Assertions.assertEquals("argName", result);
    }

    @Test
    public void testGetArgName_EmptyString() {
        // Set up mock object
        HelpFormatter mockHelpFormatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(mockHelpFormatter.getArgName()).thenReturn("");

        // Call the method and verify the result
        String result = mockHelpFormatter.getArgName();
        Assertions.assertEquals("", result);
    }

    @Test
    public void testGetArgName_Null() {
        // Set up mock object
        HelpFormatter mockHelpFormatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(mockHelpFormatter.getArgName()).thenReturn(null);

        // Call the method and verify the result
        String result = mockHelpFormatter.getArgName();
        Assertions.assertNull(result);
    }
}