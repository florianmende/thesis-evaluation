package org.apache.commons.cli;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_102_Run_20231025_105031 {
    @Test
    public void testSetArgsPositive() {
        Option option = new Option("test", "description");
        option.setArgs(5);
        Assertions.assertEquals(5, option.getArgs());
    }

    @Test
    public void testSetArgsZero() {
        Option option = new Option("test", "description");
        option.setArgs(0);
        Assertions.assertEquals(0, option.getArgs());
    }

    @Test
    public void testSetArgsNegative() {
        Option option = new Option("test", "description");
        option.setArgs(-1);
        Assertions.assertEquals(-1, option.getArgs());
    }
}