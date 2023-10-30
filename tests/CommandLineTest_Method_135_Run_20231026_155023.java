package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CommandLineTest_Method_135_Run_20231026_155023 {

    @Test
    public void testGetOptions_Empty() {
        CommandLine commandLine = new CommandLine();
        Option[] options = commandLine.getOptions();
        assertEquals(0, options.length);
    }

    @Test
    public void testGetOptions_SingleOption() {
        CommandLine commandLine = new CommandLine();
        Option option = new Option("option", "description");
        commandLine.addOption(option);
        Option[] options = commandLine.getOptions();
        assertEquals(1, options.length);
        assertEquals(option, options[0]);
    }

    @Test
    public void testGetOptions_MultipleOptions() {
        CommandLine commandLine = new CommandLine();
        Option option1 = new Option("option1", "description1");
        Option option2 = new Option("option2", "description2");
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        Option[] options = commandLine.getOptions();
        assertEquals(2, options.length);
        assertEquals(option1, options[0]);
        assertEquals(option2, options[1]);
    }
}