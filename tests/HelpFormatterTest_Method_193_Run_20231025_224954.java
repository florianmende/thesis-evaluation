package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_193_Run_20231025_224954 {

    @Test
    void testPrintHelp() {
        // Set up
        String cmdLineSyntax = "myApp [options]";
        Options options = new Options();
        options.addOption("h", "help", false, "print this message");
        options.addOption("v", "version", false, "print the version information and exit");

        // Execute
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(cmdLineSyntax, options);

        // Verify
        String expected = "usage: myApp [options]" + System.lineSeparator() + "options:" + System.lineSeparator() + "h, help" + System.lineSeparator() + "v, version" + System.lineSeparator();
        System.out.println(expected);
    }
}