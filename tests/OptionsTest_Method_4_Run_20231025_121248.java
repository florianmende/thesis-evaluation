package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionsTest_Method_4_Run_20231025_121248 {
    @Test
    public void testAddOptionNew() {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, "Alpha option");
        options.addOption(option);
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("alpha"));
    }

    @Test
    public void testAddOptionExisting() {
        Options options = new Options();
        Option option = new Option("a", "alpha", false, "Alpha option");
        options.addOption(option);
        Option option2 = new Option("b", "beta", false, "Beta option");
        options.addOption(option2);
        assertTrue(options.hasOption("a"));
        assertTrue(options.hasOption("alpha"));
        assertTrue(options.hasOption("b"));
        assertTrue(options.hasOption("beta"));
    }

    @Test
    public void testAddOptionNull() {
        Options options = new Options();
        Option option = new Option(null, null, false, "Null option");
        options.addOption(option);
        assertTrue(options.hasOption(null));
    }
}