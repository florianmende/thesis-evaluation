package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_109_Run_20231024_165833 {
    @Test
    public void testSetValueSeparator() {
        Option option = new Option("testOption", "description");
        option.setValueSeparator(Character.valueOf('='));
        assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void testSetInvalidValueSeparator() {
        Option option = new Option("testOption", "description");
        option.setValueSeparator(Character.valueOf('&'));
        assertEquals('&', option.getValueSeparator());
    }
}