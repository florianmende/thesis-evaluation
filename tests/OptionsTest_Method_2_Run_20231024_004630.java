package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionsTest_Method_2_Run_20231024_004630 {
    private Options options;
    private Option option;

    @BeforeEach
    public void setUp() {
        options = new Options();
        option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        when(option.getLongOpt()).thenReturn("long");
        when(option.isRequired()).thenReturn(true);
    }

    @Test
    public void testAddOptionWithShortNameOnly() {
        options.addOption("s", false, "description");
        assertEquals(1, options.getOptions().size());
        assertEquals("s", options.getOption("s").getKey());
        assertEquals(false, options.getOption("s").isRequired());
    }

    @Test
    public void testAddOptionWithShortNameAndLongName() {
        options.addOption("s", "long", false, "description");
        assertEquals(1, options.getOptions().size());
        assertEquals("s", options.getOption("s").getKey());
        assertEquals("long", options.getOption("s").getLongOpt());
        assertEquals(false, options.getOption("s").isRequired());
    }

    @Test
    public void testAddOptionWithShortNameLongNameAndDescription() {
        options.addOption("s", "long", false, "description");
        assertEquals(1, options.getOptions().size());
        assertEquals("s", options.getOption("s").getKey());
        assertEquals("long", options.getOption("s").getLongOpt());
        assertEquals("description", options.getOption("s").getDescription());
        assertEquals(false, options.getOption("s").isRequired());
    }
}