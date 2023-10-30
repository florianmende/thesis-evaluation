package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest_Method_88_Run_20231025_224954 {

    @Test
    public void testGetValueSeparator() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
    }
}