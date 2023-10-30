package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionsTest_Method_8_Run_20231026_105918 {
    @Test
    public void testGetOptionWithShortName() {
        // Setup
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);

        // Execute
        Option result = options.getOption("a");

        // Verify
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionWithLongName() {
        // Setup
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);

        // Execute
        Option result = options.getOption("--a");

        // Verify
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionWithInvalidName() {
        // Setup
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);

        // Execute
        Option result = options.getOption("b");

        // Verify
        assertNull(result);
    }
}