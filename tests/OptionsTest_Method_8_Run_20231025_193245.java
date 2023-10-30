package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_8_Run_20231025_193245 {
    @Test
    public void testGetOptionShortName() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        Option result = options.getOption("a");
        assertNotNull(result);
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionLongName() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        Option result = options.getOption("a");
        assertNotNull(result);
        assertEquals(option, result);
    }

    @Test
    public void testGetOptionNeitherShortNorLongName() {
        Options options = new Options();
        Option option = new Option("a", "description");
        options.addOption(option);
        Option result = options.getOption("b");
        assertNull(result);
    }
}