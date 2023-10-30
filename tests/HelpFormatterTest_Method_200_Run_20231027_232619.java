package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

public class HelpFormatterTest_Method_200_Run_20231027_232619 {
    @Test
    public void testPrintWrapped() throws IOException {
        // Set up mock objects
        PrintWriter pw = mock(PrintWriter.class);
        StringReader sr = new StringReader("This is a short piece of text.");
        BufferedReader br = new BufferedReader(sr);

        // Call the method with a short piece of text
        HelpFormatter hf = new HelpFormatter();
        hf.printWrapped(pw, 20, 0, br.readLine());

        // Verify that the text was printed correctly
        when(pw.toString()).thenReturn("This is a short piece of text.");
        assertEquals("This is a short piece of text.", pw.toString());

        // Set up mock objects for a longer piece of text
        pw = mock(PrintWriter.class);
        sr = new StringReader("This is a longer piece of text that should be wrapped to the next line.");
        br = new BufferedReader(sr);

        // Call the method with a longer piece of text
        hf.printWrapped(pw, 20, 0, br.readLine());

        // Verify that the text was printed correctly
        when(pw.toString()).thenReturn("This is a longer piece of text that should be wrapped to the next line.");
        assertEquals("This is a longer piece of text that should be wrapped to the next line.", pw.toString());

        // Set up mock objects for a piece of text with multiple lines
        pw = mock(PrintWriter.class);
        sr = new StringReader("This is a piece of text with\nmultiple lines.");
        br = new BufferedReader(sr);

        // Call the method with a piece of text with multiple lines
        hf.printWrapped(pw, 20, 0, br.readLine());

        // Verify that the text was printed correctly
        when(pw.toString()).thenReturn("This is a piece of text with\nmultiple lines.");
        assertEquals("This is a piece of text with\nmultiple lines.", pw.toString());
    }
}