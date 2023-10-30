package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;

public class GnuParserTest_Method_63_Run_20231023_195751 {
    @Test
    public void testFlattenEmptyArguments() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[] {};
        boolean stopAtNonOption = false;
        String[] expected = new String[] {};
        Assertions.assertArrayEquals(expected, parser.flatten(options, arguments, stopAtNonOption));
    }

    @Test
    public void testFlattenNonOptionArguments() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        String[] arguments = new String[] {"foo", "bar", "baz"};
        boolean stopAtNonOption = false;
        String[] expected = new String[] {"foo", "bar", "baz"};
        Assertions.assertArrayEquals(expected, parser.flatten(options, arguments, stopAtNonOption));
    }

    @Test
    public void testFlattenOptionArguments() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("foo", false, "foo option");
        options.addOption("bar", false, "bar option");
        options.addOption("baz", false, "baz option");
        String[] arguments = new String[] {"--foo", "--bar", "--baz"};
        boolean stopAtNonOption = false;
        String[] expected = new String[] {"--foo", "--bar", "--baz"};
        Assertions.assertArrayEquals(expected, parser.flatten(options, arguments, stopAtNonOption));
    }

    @Test
    public void testFlattenMixedArguments() {
        GnuParser parser = new GnuParser();
        Options options = new Options();
        options.addOption("foo", false, "foo option");
        options.addOption("bar", false, "bar option");
        options.addOption("baz", false, "baz option");
        String[] arguments = new String[] {"foo", "--bar", "baz"};
        boolean stopAtNonOption = false;
        String[] expected = new String[] {"foo", "--bar", "baz"};
        Assertions.assertArrayEquals(expected, parser.flatten(options, arguments, stopAtNonOption));
    }
}