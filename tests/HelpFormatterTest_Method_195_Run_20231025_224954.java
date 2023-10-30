package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.junit.Test;

public class HelpFormatterTest_Method_195_Run_20231025_224954 {

    @Test
    public void testPrintHelpWithEmptyOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        String cmdLineSyntax = "myapp";
        String header = "My Application";
        String footer = "Copyright 2023";
        formatter.printHelp(cmdLineSyntax, header, options, footer);
        // Check that the help information is printed correctly
    }

    @Test
    public void testPrintHelpWithSingleOption() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option = new Option("h", "help", false, "print this help message");
        options.addOption(option);
        String cmdLineSyntax = "myapp";
        String header = "My Application";
        String footer = "Copyright 2023";
        formatter.printHelp(cmdLineSyntax, header, options, footer);
        // Check that the help information is printed correctly
    }

    @Test
    public void testPrintHelpWithMultipleOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        Option option1 = new Option("h", "help", false, "print this help message");
        Option option2 = new Option("v", "version", false, "print the version information");
        options.addOption(option1);
        options.addOption(option2);
        String cmdLineSyntax = "myapp";
        String header = "My Application";
        String footer = "Copyright 2023";
        formatter.printHelp(cmdLineSyntax, header, options, footer);
        // Check that the help information is printed correctly
    }
}