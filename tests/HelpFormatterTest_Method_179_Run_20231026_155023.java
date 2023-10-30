package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_179_Run_20231026_155023 {
    @Test
    public void testGetArgName() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getArgName()).thenReturn("argName");
        Assertions.assertEquals("argName", formatter.getArgName());
    }

    @Test
    public void testGetDefaultArgName() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getArgName()).thenReturn(null);
        Assertions.assertNull(formatter.getArgName());
    }

    @Test
    public void testGetNullArgName() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getArgName()).thenReturn(null);
        Assertions.assertNull(formatter.getArgName());
    }
}