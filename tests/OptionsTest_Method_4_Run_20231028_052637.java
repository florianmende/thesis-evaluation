package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.List;

public class OptionsTest_Method_4_Run_20231028_052637 {
    @Test
    public void testAddOption() {
        Options options = new Options();
        options.addOption("a", "long-a", true, "description");
        Assertions.assertTrue(options.hasOption("a"));
        Assertions.assertTrue(options.hasOption("long-a"));
        Assertions.assertEquals("description", options.getOption("a").getDescription());
        Assertions.assertTrue(options.getOption("a").hasArg());
    }

    @Test
    public void testAddOptionHasArg() {
        Options options = new Options();
        options.addOption("a", "long-a", true, "description");
        Assertions.assertTrue(options.getOption("a").hasArg());
    }

    @Test
    public void testAddOptionDescription() {
        Options options = new Options();
        options.addOption("a", "long-a", true, "description");
        Assertions.assertEquals("description", options.getOption("a").getDescription());
    }
}