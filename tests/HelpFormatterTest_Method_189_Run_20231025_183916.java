package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_189_Run_20231025_183916 {
    @Test
    public void testPrintHelp() {
        // Test case 1: No options
        Options options = new Options();
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(80, "myapp", "My Application", options, "footer");
        // Expected output:
        // Usage: myapp [options]
        // My Application
        // footer

        // Test case 2: One option
        options = new Options();
        options.addOption("a", "arg", true, "argument");
        formatter = new HelpFormatter();
        formatter.printHelp(80, "myapp", "My Application", options, "footer");
        // Expected output:
        // Usage: myapp [options]
        // My Application
        // footer
        // Options:
        //   -a, --arg <argument>

        // Test case 3: Multiple options
        options = new Options();
        options.addOption("a", "arg", true, "argument");
        options.addOption("b", "bool", false, "boolean");
        formatter = new HelpFormatter();
        formatter.printHelp(80, "myapp", "My Application", options, "footer");
        // Expected output:
        // Usage: myapp [options]
        // My Application
        // footer
        // Options:
        //   -a, --arg <argument>
        //   -b, --bool
    }
}