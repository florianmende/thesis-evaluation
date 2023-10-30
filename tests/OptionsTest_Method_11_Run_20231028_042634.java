package org.apache.commons.cli;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_11_Run_20231028_042634 {
    private Options options;

    @BeforeEach
    public void setUp() {
        options = new Options();
        options.addOption(new Option("a", "alpha", false, "An option"));
        options.addOption(new Option("b", "beta", false, "Another option"));
        options.addOption(new Option("c", "gamma", false, "A third option"));
    }

    @Test
    public void testGetOptions() {
        Collection<Option> options = this.options.getOptions();
        assertEquals(3, options.size());
        assertTrue(options.contains(new Option("a", "alpha", false, "An option")));
        assertTrue(options.contains(new Option("b", "beta", false, "Another option")));
        assertTrue(options.contains(new Option("c", "gamma", false, "A third option")));
    }
}