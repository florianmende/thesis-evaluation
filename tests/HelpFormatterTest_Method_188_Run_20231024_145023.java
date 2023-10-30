package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_188_Run_20231024_145023 {

    @Test
    public void testGetWidthDefault() {
        HelpFormatter formatter = new HelpFormatter();
        assertEquals(74, formatter.getWidth()); // default width is 74
    }

    @Test
    public void testGetWidthSpecified() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testGetWidthChanged() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        formatter.setWidth(50);
        assertEquals(50, formatter.getWidth());
    }
}