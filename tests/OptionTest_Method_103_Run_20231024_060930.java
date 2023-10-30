package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest_Method_103_Run_20231024_060930 {
    @Test
    public void testSetDescription() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setDescription("new description");
        assertEquals("new description", option.getDescription());
    }
}