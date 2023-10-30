package org.apache.commons.cli;


import static org.junit.Assert.*;
import org.junit.Test;

public class OptionTest_Method_102_Run_20231023_204140 {
    @Test
    public void testSetArgsPositive() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setArgs(5);
        assertEquals(5, option.getArgs());
    }

    @Test
    public void testSetArgsZero() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setArgs(0);
        assertEquals(0, option.getArgs());
    }

    @Test
    public void testSetArgsNegative() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setArgs(-1);
        assertEquals(-1, option.getArgs());
    }
}