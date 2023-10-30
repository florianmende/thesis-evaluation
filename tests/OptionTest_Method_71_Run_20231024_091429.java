package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class OptionTest_Method_71_Run_20231024_091429 {
    @Test
    public void testAddValue() {
        Option option = new Option("test", "This is a test option");
        assertThrows(UnsupportedOperationException.class, () -> option.addValue("test value"));
    }
}