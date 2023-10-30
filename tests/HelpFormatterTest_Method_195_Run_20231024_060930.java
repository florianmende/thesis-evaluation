package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.junit.Test;

public class HelpFormatterTest_Method_195_Run_20231024_060930 {

    @Test
    public void testPrintHelpWithValidParameters() {
        String cmdLineSyntax = "myapp";
        String header = "My Application";
        Options options = new Options();
        options.addOption("h", "help", false, "print this message");
        String footer = "This is the footer";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(cmdLineSyntax, header, options, footer);
        // assert that the help information was printed correctly
    }

    @Test
    public void testPrintHelpWithEmptyOptions() {
        String cmdLineSyntax = "myapp";
        String header = "My Application";
        Options options = new Options();
        String footer = "This is the footer";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(cmdLineSyntax, header, options, footer);
        // assert that nothing was printed
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpWithNullCmdLineSyntax() {
        String cmdLineSyntax = null;
        String header = "My Application";
        Options options = new Options();
        options.addOption("h", "help", false, "print this message");
        String footer = "This is the footer";
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(cmdLineSyntax, header, options, footer);
    }
}