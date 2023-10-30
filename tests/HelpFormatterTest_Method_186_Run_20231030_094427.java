package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest_Method_186_Run_20231030_094427 {
    @Test
    public void testGetOptPrefix() {
        // Set up mock objects
        HelpFormatter helpFormatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(helpFormatter.getOptPrefix()).thenReturn("-");

        // Test the method
        assertEquals("-", helpFormatter.getOptPrefix());
    }
}