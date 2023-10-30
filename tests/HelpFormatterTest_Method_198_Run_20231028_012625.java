package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.PrintWriter;

class HelpFormatterTest_Method_198_Run_20231028_012625 {

    @Test
    void testPrintUsage() {
        // Given
        HelpFormatter formatter = new HelpFormatter();
        PrintWriter pw = Mockito.mock(PrintWriter.class);
        int width = 80;
        String cmdLineSyntax = "java -jar myJar.jar [options]";

        // When
        formatter.printUsage(pw, width, cmdLineSyntax);

        // Then
        Mockito.verify(pw).println("usage: java -jar myJar.jar [options]");
    }
}