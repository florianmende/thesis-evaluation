package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class HelpFormatterTest_Method_208_Run_20231030_094427 {

    @Test
    void testSetLeftPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(10);
        Assertions.assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    void testSetLeftPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(-10);
        Assertions.assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    void testSetLeftPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        Assertions.assertEquals(0, formatter.getLeftPadding());
    }
}