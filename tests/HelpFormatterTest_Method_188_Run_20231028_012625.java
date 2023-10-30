package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_188_Run_20231028_012625 {
    @Test
    void testGetWidth() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        assertEquals(10, formatter.getWidth());
    }

    @Test
    void testGetWidthZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(0);
        assertEquals(0, formatter.getWidth());
    }

    @Test
    void testGetWidthNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(-10);
        assertEquals(-10, formatter.getWidth());
    }
}