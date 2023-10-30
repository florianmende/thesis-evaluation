package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import junit.framework.Assert;

class HelpFormatterTest_Method_184_Run_20231024_080105 {
    @Test
    void testGetNewLineNull() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getNewLine()).thenReturn(null);
        Assert.assertNull(formatter.getNewLine());
    }

    @Test
    void testGetNewLineNotNull() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getNewLine()).thenReturn("test");
        Assert.assertEquals("test", formatter.getNewLine());
    }

    @Test
    void testGetNewLineEmptyString() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getNewLine()).thenReturn("");
        Assert.assertEquals("", formatter.getNewLine());
    }
}