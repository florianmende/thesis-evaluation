package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OptionsTest_Method_16_Run_20231024_091429 {
    @Test
    void testHelpOptions() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "");
        options.addOption("b", "bbb", false, "");
        options.addOption("c", "ccc", false, "");

        List<Option> expected = new ArrayList<>();
        expected.add(new Option("a", "aaa", false, ""));
        expected.add(new Option("b", "bbb", false, ""));
        expected.add(new Option("c", "ccc", false, ""));

        List<Option> actual = options.helpOptions();

        assertEquals(expected, actual);
    }
}