package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_3_Run_20231027_232619 {
    @Test
    public void testAddOptionWithShortName() {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");
        assertTrue(options.hasOption("h"));
        assertEquals("Show help", options.getOption("h").getDescription());
    }

    @Test
    public void testAddOptionWithLongName() {
        Options options = new Options();
        options.addOption("help", false, "Show help");
        assertTrue(options.hasOption("help"));
        assertEquals("Show help", options.getOption("help").getDescription());
    }

    @Test
    public void testAddOptionWithShortAndLongName() {
        Options options = new Options();
        options.addOption("h", "help", false, "Show help");
        assertTrue(options.hasOption("h"));
        assertTrue(options.hasOption("help"));
        assertEquals("Show help", options.getOption("h").getDescription());
        assertEquals("Show help", options.getOption("help").getDescription());
    }
}