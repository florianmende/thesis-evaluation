package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_6_Run_20231024_080105 {
    @Test
    public void testAddRequiredOption() {
        Options options = new Options();
        String shortName = "s";
        String longName = "long";
        boolean hasArg = true;
        String description = "description";
        Option option = new Option(shortName, longName, hasArg, description);
        options.addRequiredOption(shortName, longName, hasArg, description);
        List<Option> optionList = new ArrayList<>();
        optionList.add(option);
        assertTrue(optionList.contains(option));
        assertTrue(options.hasOption(shortName));
        assertTrue(options.hasOption(longName));
    }

    @Test
    public void testAddRequiredOptionNullShortName() {
        Options options = new Options();
        String longName = "long";
        boolean hasArg = true;
        String description = "description";
        options.addRequiredOption(null, longName, hasArg, description);
        assertTrue(options.hasOption(longName));
    }

    @Test
    public void testAddRequiredOptionNullLongName() {
        Options options = new Options();
        String shortName = "s";
        boolean hasArg = true;
        String description = "description";
        options.addRequiredOption(shortName, null, hasArg, description);
        assertTrue(options.hasOption(shortName));
    }

    @Test
    public void testAddRequiredOptionNullShortAndLongName() {
        Options options = new Options();
        boolean hasArg = true;
        String description = "description";
        try {
            options.addRequiredOption(null, null, hasArg, description);
        } catch (IllegalArgumentException e) {
            assertEquals(0, options.getOptions().size());
        }
    }
}