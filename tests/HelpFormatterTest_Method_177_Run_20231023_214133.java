package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_177_Run_20231023_214133 {
    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(5);
        assertEquals(5, padding.length());
        assertTrue(padding.contains(" "));
        String padding2 = formatter.createPadding(5);
        assertNotSame(padding, padding2);
    }
}