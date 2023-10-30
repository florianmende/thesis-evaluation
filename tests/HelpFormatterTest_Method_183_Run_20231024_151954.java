package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_183_Run_20231024_151954 {

    @Test
    public void testGetLongOptSeparatorDefault() {
        HelpFormatter formatter = new HelpFormatter();
        Assertions.assertEquals(" ", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorNonDefault() {
        HelpFormatter formatter = new HelpFormatter();
        Assertions.assertEquals(" ", formatter.getLongOptSeparator());
    }

    @Test
    public void testGetLongOptSeparatorCustom() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator(":");
        Assertions.assertEquals(":", formatter.getLongOptSeparator());
    }
}