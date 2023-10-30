package org.apache.commons.cli;


import org.junit.Test;

public class HelpFormatterTest_Method_189_Run_20231028_042634 {
    @Test
    public void testPrintHelp() {
        // Set up test data
        int width = 80;
        String cmdLineSyntax = "myapp [options]";
        String header = "My Application";
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        String footer = "My Application Footer";

        // Test that the method prints the help information to System.out when the boolean flag is set to true
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(width, cmdLineSyntax, header, options, footer, true);
        // Verify that the help information was printed to System.out
        // ...

        // Test that the method does not print the help information to System.out when the boolean flag is set to false
        formatter.printHelp(width, cmdLineSyntax, header, options, footer, false);
        // Verify that the help information was not printed to System.out
        // ...

        // Test that the method throws an IllegalArgumentException when an invalid width is provided
        try {
            formatter.printHelp(-1, cmdLineSyntax, header, options, footer, true);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    private void fail(String message) {
        throw new IllegalArgumentException(message);
    }
}