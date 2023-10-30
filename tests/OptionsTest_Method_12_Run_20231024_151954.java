package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class OptionsTest_Method_12_Run_20231024_151954 {
    @Test
    void testGetRequiredOptions_emptyList() {
        Options options = new Options();
        List<Option> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }

    @Test
    void testGetRequiredOptions_nonEmptyList() {
        Options options = new Options();
        options.addRequiredOption("a", "alpha", false, "option a");
        options.addRequiredOption("b", "beta", false, "option b");
        List<Option> requiredOptions = options.getRequiredOptions();
        assertEquals(2, requiredOptions.size());
    }

    @Test
    void testGetRequiredOptions_noOptionalOptions() {
        Options options = new Options();
        options.addOption("c", "charlie", false, "option c");
        List<Option> requiredOptions = options.getRequiredOptions();
        assertTrue(requiredOptions.isEmpty());
    }
}