package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_194_Run_20231025_121248 {
    @Test
    public void testPrintHelp() {
        // Set up the command line syntax and options
        String cmdLineSyntax = "myapp [options]";
        Options options = new Options();
        options.addOption("h", "help", false, "print this message");
        options.addOption("v", "version", false, "print the version number");

        // Create a new HelpFormatter instance
        HelpFormatter formatter = new HelpFormatter();

        // Test case 1: The method prints the help information correctly when the command line syntax and options are valid.
        formatter.printHelp(cmdLineSyntax, options, false);
        // Verify that the help information is printed correctly

        // Test case 2: The method prints the usage statement correctly when the boolean indicating whether to print the usage statement is set to true.
        formatter.printHelp(cmdLineSyntax, options, true);
        // Verify that the usage statement is printed correctly

        // Test case 3: The method does not print the usage statement when the boolean indicating whether to print the usage statement is set to false.
        formatter.printHelp(cmdLineSyntax, options, false);
        // Verify that the usage statement is not printed
    }
}