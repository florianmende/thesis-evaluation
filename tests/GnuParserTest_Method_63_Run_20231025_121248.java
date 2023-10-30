package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;

public class GnuParserTest_Method_63_Run_20231025_121248 {
    @Test
    public void testEmptyArguments() {
        Options options = new Options();
        String[] arguments = new String[0];
        String[] expected = new String[0];
        String[] actual = new GnuParser().flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlatten() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");
        String[] arguments = new String[]{"-a", "--b", "-c"};
        String[] expected = new String[]{"-a", "--b", "-c"};
        String[] actual = new GnuParser().flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDoubleDash() {
        Options options = new Options();
        options.addOption("a", false, "option a");
        options.addOption("b", false, "option b");
        options.addOption("c", false, "option c");
        String[] arguments = new String[]{"-a", "--b", "--", "-c"};
        String[] expected = new String[]{"-a", "--b", "--", "-c"};
        String[] actual = new GnuParser().flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }
}