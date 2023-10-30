package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;
import java.io.IOException; // Add this import statement

class HelpFormatterTest_Method_180_Run_20231024_004630 {

    @Test
    void testGetDescPadding() throws IOException {
        HelpFormatter helpFormatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(helpFormatter.getDescPadding()).thenReturn(1);
        Assertions.assertEquals(1, helpFormatter.getDescPadding());
        Mockito.when(helpFormatter.getDescPadding()).thenReturn(-1);
        Assertions.assertEquals(-1, helpFormatter.getDescPadding());
        Mockito.when(helpFormatter.getDescPadding()).thenReturn(0);
        Assertions.assertEquals(0, helpFormatter.getDescPadding());
    }
}