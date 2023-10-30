package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_2_Run_20231025_224954 {
    @Test
    public void testAddOption() {
        Options options = new Options();
        options.addOption("a", "arg", false, "description");
        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOptions().contains(new Option("a", "arg", false, "description")));
    }

    @Test
    public void testAddOptionWithArgument() {
        Options options = new Options();
        options.addOption("a", "arg", true, "description");
        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOptions().contains(new Option("a", "arg", true, "description")));
    }

    @Test
    public void testAddOptionWithArgumentAndRequired() {
        Options options = new Options();
        options.addOption("a", "arg", true, "description");
        options.addOption("b", "arg", true, "description");
        options.addOption("c", "arg", true, "description");
        options.addOption("d", "arg", true, "description");
        assertEquals(4, options.getOptions().size());
        assertTrue(options.getOptions().contains(new Option("a", "arg", true, "description")));
        assertTrue(options.getOptions().contains(new Option("b", "arg", true, "description")));
        assertTrue(options.getOptions().contains(new Option("c", "arg", true, "description")));
        assertTrue(options.getOptions().contains(new Option("d", "arg", true, "description")));
    }
}