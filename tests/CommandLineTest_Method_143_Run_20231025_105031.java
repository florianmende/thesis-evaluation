package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandLineTest_Method_143_Run_20231025_105031 {

    @Test
    public void testGetOptionValues() {
        Option option1 = new Option("a", "option1");
        Option option2 = new Option("b", "option2");
        Option option3 = new Option("c", "option3");
        Option option4 = new Option("d", "option4");

        CommandLine commandLine = new CommandLine();
        commandLine.addOption(option1);
        commandLine.addOption(option2);
        commandLine.addOption(option3);
        commandLine.addOption(option4);

        String[] expectedValues1 = new String[]{"value1", "value2"};
        String[] expectedValues2 = new String[]{"value3", "value4"};
        String[] expectedValues3 = new String[]{"value5", "value6"};
        String[] expectedValues4 = new String[]{"value7", "value8"};

        String[] actualValues1 = commandLine.getOptionValues(option1);
        String[] actualValues2 = commandLine.getOptionValues(option2);
        String[] actualValues3 = commandLine.getOptionValues(option3);
        String[] actualValues4 = commandLine.getOptionValues(option4);

        if (actualValues1 != null) {
            assertArrayEquals(expectedValues1, actualValues1);
        }
        if (actualValues2 != null) {
            assertArrayEquals(expectedValues2, actualValues2);
        }
        if (actualValues3 != null) {
            assertArrayEquals(expectedValues3, actualValues3);
        }
        if (actualValues4 != null) {
            assertArrayEquals(expectedValues4, actualValues4);
        }
    }
}