package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_193_Run_20231028_032631 {

    @Test
    public void testPrintHelpWithNoOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        formatter.printHelp("myapp", options);
        // Check that the help information was printed correctly
        // ...
    }

    @Test
    public void testPrintHelpWithOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        formatter.printHelp("myapp", options);
        // Check that the help information was printed correctly
        // ...
    }

    @Test
    public void testPrintHelpThrowsException() {
        HelpFormatter formatter = new HelpFormatter();
        Options options = new Options();
        try {
            formatter.printHelp(null, options);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    private void fail(String message) {
        throw new AssertionError(message);
    }
}