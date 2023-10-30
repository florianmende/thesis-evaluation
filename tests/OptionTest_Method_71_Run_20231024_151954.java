package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.Test;

public class OptionTest_Method_71_Run_20231024_151954 {
    @Test(expected = UnsupportedOperationException.class)
    public void testAddValue() {
        Option option = new Option("a", "add", false, "Add a value");
        option.addValue("test");
    }
}