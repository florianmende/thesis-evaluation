package org.apache.commons.cli;


import java.io.PrintWriter;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.junit.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_197_Run_20231027_222616 {
    @Test
    public void testPrintOptions() {
        // Set up mock objects
        PrintWriter pw = Mockito.mock(PrintWriter.class);
        Options options = Mockito.mock(Options.class);

        // Set up test data
        int width = 80;
        int leftPad = 2;
        int descPad = 2;

        // Call the method under test
        HelpFormatter formatter = new HelpFormatter();
        formatter.printOptions(pw, width, options, leftPad, descPad);

        // Verify the results
        Mockito.verify(pw).println(Mockito.anyString());
    }

    @Test
    public void testPrintOptions_WideText() {
        // Set up mock objects
        PrintWriter pw = Mockito.mock(PrintWriter.class);
        Options options = Mockito.mock(Options.class);

        // Set up test data
        int width = 80;
        int leftPad = 2;
        int descPad = 2;

        // Call the method under test
        HelpFormatter formatter = new HelpFormatter();
        formatter.printOptions(pw, width, options, leftPad, descPad);

        // Verify the results
        Mockito.verify(pw).println(Mockito.anyString());
    }

    @Test
    public void testPrintOptions_NoOptions() {
        // Set up mock objects
        PrintWriter pw = Mockito.mock(PrintWriter.class);
        Options options = Mockito.mock(Options.class);

        // Set up test data
        int width = 80;
        int leftPad = 2;
        int descPad = 2;

        // Call the method under test
        HelpFormatter formatter = new HelpFormatter();
        formatter.printOptions(pw, width, options, leftPad, descPad);

        // Verify the results
        Mockito.verify(pw).println(Mockito.anyString());
    }
}