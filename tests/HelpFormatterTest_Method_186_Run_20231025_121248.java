package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_186_Run_20231025_121248 {
    @Test
    public void testGetOptPrefix() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getOptPrefix()).thenReturn("-");
        Assertions.assertEquals("-", formatter.getOptPrefix());

        formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getOptPrefix()).thenReturn("");
        Assertions.assertEquals("", formatter.getOptPrefix());

        formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getOptPrefix()).thenReturn(null);
        Assertions.assertEquals(null, formatter.getOptPrefix());
    }
}