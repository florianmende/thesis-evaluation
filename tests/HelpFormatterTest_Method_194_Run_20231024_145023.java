package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.Test;

public class HelpFormatterTest_Method_194_Run_20231024_145023 {
    @Test
    public void testPrintHelpAutoUsage() {
        // Arrange
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "myapp [options]";
        Options options = new Options();
        options.addOption("h", "help", false, "display this help message");
        options.addOption("v", "version", false, "display version information");
        boolean autoUsage = true;

        // Act
        formatter.printHelp(cmdLineSyntax, options, autoUsage);

        // Assert
        // Check that the help information is printed correctly
        // Check that the usage statement is printed
    }

    @Test
    public void testPrintHelpNoAutoUsage() {
        // Arrange
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "myapp [options]";
        Options options = new Options();
        options.addOption("h", "help", false, "display this help message");
        options.addOption("v", "version", false, "display version information");
        boolean autoUsage = false;

        // Act
        formatter.printHelp(cmdLineSyntax, options, autoUsage);

        // Assert
        // Check that the help information is printed correctly
        // Check that the usage statement is not printed
    }

    @Test(expected = NullPointerException.class)
    public void testPrintHelpNullOptions() {
        // Arrange
        HelpFormatter formatter = new HelpFormatter();
        String cmdLineSyntax = "myapp [options]";
        Options options = null;
        boolean autoUsage = true;

        // Act
        formatter.printHelp(cmdLineSyntax, options, autoUsage);

        // Assert
        // Check that a NullPointerException is thrown
    }
}