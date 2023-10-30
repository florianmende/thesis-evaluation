package org.apache.commons.cli;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasicParserTest_Method_226_Run_20231026_155023 {
    @Test
    public void testFlatten() throws ParseException {
        // create an instance of the BasicParser class
        BasicParser parser = new BasicParser();

        // test case 1: empty arguments array
        String[] args = new String[0];
        assertArrayEquals(args, parser.flatten(new Options(), args, false));

        // test case 2: non-empty arguments array with no options
        args = new String[] {"hello", "world"};
        assertArrayEquals(args, parser.flatten(new Options(), args, false));

        // test case 3: non-empty arguments array with options
        Options options = new Options();
        options.addOption("a", "alpha");
        options.addOption("b", "bravo");
        args = new String[] {"-a", "hello", "-b", "world"};
        assertArrayEquals(args, parser.flatten(options, args, false));
    }

    @Test
    public void testFlattenWithStopAtNonOption() throws ParseException {
        // create an instance of the BasicParser class
        BasicParser parser = new BasicParser();

        // test case 1: empty arguments array
        String[] args = new String[0];
        assertArrayEquals(args, parser.flatten(new Options(), args, true));

        // test case 2: non-empty arguments array with no options
        args = new String[] {"hello", "world"};
        assertArrayEquals(args, parser.flatten(new Options(), args, true));

        // test case 3: non-empty arguments array with options
        Options options = new Options();
        options.addOption("a", "alpha");
        options.addOption("b", "bravo");
        args = new String[] {"-a", "hello", "-b", "world"};
        assertArrayEquals(args, parser.flatten(options, args, true));
    }
}