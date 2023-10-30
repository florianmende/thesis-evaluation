package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_189_Run_20231027_212614 {
    @Test
    void testPrintHelp() {
        String header = "Header";
        String footer = "Footer";
        String cmdLineSyntax = "cmdLineSyntax";
        Options options = new Options();
        options.addOption("a", "aaa", false, "aaa description");
        options.addOption("b", "bbb", false, "bbb description");

        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp(80, cmdLineSyntax, header, options, footer);
    }
}