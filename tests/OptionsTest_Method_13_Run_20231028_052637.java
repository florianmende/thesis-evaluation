package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_13_Run_20231028_052637 {
    @Test
    public void testHasLongOption() {
        Options options = new Options();
        options.addOption("foo", "Foo option");
        options.addOption("bar", "Bar option");
        options.addOption("baz", "Baz option");

        assertTrue(options.hasOption("foo"));
        assertTrue(options.hasOption("bar"));
        assertTrue(options.hasOption("baz"));
    }

    @Test
    public void testHasLongOptionWithInvalidOption() {
        Options options = new Options();
        options.addOption("foo", "Foo option");
        options.addOption("bar", "Bar option");
        options.addOption("baz", "Baz option");

        assertFalse(options.hasOption("qux"));
    }

    @Test
    public void testHasLongOptionWithEmptyOptions() {
        Options options = new Options();

        assertFalse(options.hasOption("foo"));
        assertFalse(options.hasOption("bar"));
        assertFalse(options.hasOption("baz"));
    }
}