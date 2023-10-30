package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

class HelpFormatterTest_Method_188_Run_20231027_222616 {
    @Test
    void testGetWidth() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(100);
        Assertions.assertEquals(100, formatter.getWidth());
    }

    @Test
    void testGetWidthNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(-100);
        Assertions.assertEquals(-100, formatter.getWidth());
    }

    @Test
    void testGetWidthZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(0);
        Assertions.assertEquals(0, formatter.getWidth());
    }
}