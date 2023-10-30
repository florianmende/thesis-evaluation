package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.junit.Test;

public class HelpFormatterTest_Method_196_Run_20231025_105031 {
    @Test
    public void testPrintHelp() {
        // Set up test data
        String cmdLineSyntax = "myapp [options]";
        String header = "My Application";
        Options options = new Options();
        options.addOption("h", "help", false, "Print this help message");
        String footer = "My Application is a command line application.";
        boolean autoUsage = true;

        // Create a new HelpFormatter instance
        HelpFormatter formatter = new HelpFormatter();

        // Call the printHelp method with the test data
        formatter.printHelp(cmdLineSyntax, header, options, footer, autoUsage);

        // Verify the output
        // ...
    }

    @Test(expected = NullPointerException.class)
    public void testPrintHelpNullOptions() {
        // Set up test data
        String cmdLineSyntax = "myapp [options]";
        String header = "My Application";
        Options options = null;
        String footer = "My Application is a command line application.";
        boolean autoUsage = true;

        // Create a new HelpFormatter instance
        HelpFormatter formatter = new HelpFormatter();

        // Call the printHelp method with the test data
        formatter.printHelp(cmdLineSyntax, header, options, footer, autoUsage);
    }

    @Test
    public void testPrintHelpAutoUsage() {
        // Set up test data
        String cmdLineSyntax = "myapp [options]";
        String header = "My Application";
        Options options = new Options();
        options.addOption("h", "help", false, "Print this help message");
        String footer = "My Application is a command line application.";
        boolean autoUsage = false;

        // Create a new HelpFormatter instance
        HelpFormatter formatter = new HelpFormatter();

        // Call the printHelp method with the test data
        formatter.printHelp(cmdLineSyntax, header, options, footer, autoUsage);

        // Verify the output
        // ...
    }
}