package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_180_Run_20231026_155023 {

    @Test
    public void testGetDescPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        int descPadding = formatter.getDescPadding();
        Assertions.assertEquals(10, descPadding);
    }

    @Test
    public void testGetDescPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-10);
        int descPadding = formatter.getDescPadding();
        Assertions.assertEquals(-10, descPadding);
    }

    @Test
    public void testGetDescPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(0);
        int descPadding = formatter.getDescPadding();
        Assertions.assertEquals(0, descPadding);
    }
}