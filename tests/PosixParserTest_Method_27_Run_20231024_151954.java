package org.apache.commons.cli;

import org.apache.commons.cli.PosixParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PosixParserTest_Method_27_Run_20231024_151954 {
    @Test
    public void testFlattenValidOption() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", true, "beta option");
        String[] arguments = {"-a", "--beta", "betaValue"};
        String[] expected = {"-a", "--beta", "betaValue"};
        String[] actual = parser.flatten(options, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    public void testFlattenNonOptionArgument() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", true, "beta option");
        String[] arguments = {"nonOptionArgument"};
        String[] expected = {"nonOptionArgument"};
        String[] actual = parser.flatten(options, arguments, false);
        assertEquals(expected, actual);
    }

    @Test
    public void testFlattenSpecialToken() throws Exception {
        PosixParser parser = new PosixParser();
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", true, "beta option");
        String[] arguments = {"--", "--beta", "betaValue"};
        String[] expected = {"--", "--beta", "betaValue"};
        String[] actual = parser.flatten(options, arguments, false);
        assertEquals(expected, actual);
    }
}