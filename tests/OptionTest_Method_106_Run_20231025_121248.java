package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_106_Run_20231025_121248 {

    @Test
    public void testSetRequired_mandatory() {
        Option option = new Option("a", "arg-name", true, "description");
        option.setRequired(true);
        assertTrue(option.isRequired());
    }

    @Test
    public void testSetRequired_notMandatory() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    public void testSetRequired_mandatoryToNotMandatory() {
        Option option = new Option("a", "arg-name", true, "description");
        option.setRequired(false);
        assertFalse(option.isRequired());
    }
}