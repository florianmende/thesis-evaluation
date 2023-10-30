package org.apache.commons.cli;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptionTest_Method_102_Run_20231027_212614 {

    @Test
    public void testSetArgsPositive() {
        Option option = new Option("test", "Test option");
        option.setArgs(5);
        assertEquals(5, option.getArgs());
    }

    @Test
    public void testSetArgsNegative() {
        Option option = new Option("test", "Test option");
        option.setArgs(-5);
        assertEquals(-5, option.getArgs());
    }

    @Test
    public void testSetArgsZero() {
        Option option = new Option("test", "Test option");
        option.setArgs(0);
        assertEquals(0, option.getArgs());
    }
}