package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_196_Run_20231025_125643 {
    @Test
    public void testPrintHelp() throws ParseException, IOException {
        // Set up mock objects
        Options options = mock(Options.class);
        when(options.getOptions()).thenReturn(Arrays.asList(new Option("h", "help", false, "display this help message")));
        when(options.getOption("h")).thenReturn(new Option("h", "help", false, "display this help message"));
        when(options.getOption("help")).thenReturn(new Option("h", "help", false, "display this help message"));

        // Set up test data
        String cmdLineSyntax = "myapp [options]";
        String header = "My App";
        String footer = "Copyright My Company 2023";
        boolean autoUsage = true;

        // Set up expected output
        String expectedOutput = "Usage: myapp [options]\n" +
                "My App\n" +
                "Options:\n" +
                "  -h, --help  display this help message\n" +
                "Copyright My Company 2023\n";

        // Test with valid parameters
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(cmdLineSyntax, header, options, footer, autoUsage);
        assertEquals(expectedOutput, expectedOutput);

        // Test with different values for parameters
        cmdLineSyntax = "myapp [options]";
        header = "My App";
        footer = "Copyright My Company 2023";
        autoUsage = false;
        expectedOutput = "Usage: myapp [options]\n" +
                "My App\n" +
                "Options:\n" +
                "  -h, --help  display this help message\n" +
                "Copyright My Company 2023\n";
        formatter.printHelp(cmdLineSyntax, header, options, footer, autoUsage);
        assertEquals(expectedOutput, expectedOutput);

        // Test with invalid values for parameters
        cmdLineSyntax = "myapp [options]";
        header = "My App";
        footer = "Copyright My Company 2023";
        autoUsage = true;
        expectedOutput = "Usage: myapp [options]\n" +
                "My App\n" +
                "Options:\n" +
                "  -h, --help  display this help message\n" +
                "Copyright My Company 2023\n";
        formatter.printHelp(cmdLineSyntax, header, options, footer, autoUsage);
        assertEquals(expectedOutput, expectedOutput);
    }
}