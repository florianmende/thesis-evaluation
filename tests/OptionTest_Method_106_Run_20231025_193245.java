package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest_Method_106_Run_20231025_193245 {

    @Test
    public void testSetRequiredTrue() {
        Option option = new Option("option", "option description");
        option.setRequired(true);
        assertEquals(true, option.isRequired());
    }

    @Test
    public void testSetRequiredFalse() {
        Option option = new Option("option", "option description");
        option.setRequired(false);
        assertEquals(false, option.isRequired());
    }

    @Test
    public void testSetRequiredNull() {
        Option option = new Option("option", "option description");
        option.setRequired(false);
        assertEquals(false, option.isRequired());
    }
}