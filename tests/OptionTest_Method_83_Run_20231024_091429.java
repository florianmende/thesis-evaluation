package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest_Method_83_Run_20231024_091429 {
    @Test
    public void testGetType() {
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals(String.class, option.getType());
    }
}