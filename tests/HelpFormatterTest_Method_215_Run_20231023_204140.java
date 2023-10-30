package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_215_Run_20231023_204140 {
    @Test
    void testSetWidthPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(10);
        Assertions.assertEquals(10, formatter.getWidth());
    }

    @Test
    void testSetWidthNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(-10);
        Assertions.assertEquals(-10, formatter.getWidth());
    }

    @Test
    void testSetWidthZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(0);
        Assertions.assertEquals(0, formatter.getWidth());
    }
}