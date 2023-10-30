package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OptionTest_Method_76_Run_20231028_042634 {
    @Test
    public void testGetArgName() {
        Option option = Option.builder("a").argName("arg-name").build();
        assertEquals("arg-name", option.getArgName());
    }
}