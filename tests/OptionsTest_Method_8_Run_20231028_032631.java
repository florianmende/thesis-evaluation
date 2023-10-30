package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionsTest_Method_8_Run_20231028_032631 {
    @Test
    public void testGetOptionShortName() {
        Options options = new Options();
        Option option = new Option("a", "aLong", false, "description");
        options.addOption(option);

        Option result = options.getOption("a");

        assertEquals(option, result);
    }

    @Test
    public void testGetOptionLongName() {
        Options options = new Options();
        Option option = new Option("a", "aLong", false, "description");
        options.addOption(option);

        Option result = options.getOption("aLong");

        assertEquals(option, result);
    }

    @Test
    public void testGetOptionInvalidName() {
        Options options = new Options();
        Option option = new Option("a", "aLong", false, "description");
        options.addOption(option);

        Option result = options.getOption("invalid");

        assertNull(result);
    }
}