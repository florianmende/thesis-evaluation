package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;

public class BasicParserTest_Method_226_Run_20231028_042634 {

    @Test
    public void testFlattenWithoutOptionsAndStopAtNonOption() {
        BasicParser parser = new BasicParser();
        String[] arguments = {"arg1", "arg2", "arg3"};
        String[] expected = {"arg1", "arg2", "arg3"};
        String[] actual = parser.flatten(null, arguments, false);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithOptionsButNotStopAtNonOption() {
        BasicParser parser = new BasicParser();
        String[] arguments = {"arg1", "arg2", "arg3"};
        String[] expected = {"arg1", "arg2", "arg3"};
        String[] actual = parser.flatten(Mockito.mock(Options.class), arguments, false);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithStopAtNonOptionButNotOptions() {
        BasicParser parser = new BasicParser();
        String[] arguments = {"arg1", "arg2", "arg3"};
        String[] expected = {"arg1", "arg2", "arg3"};
        String[] actual = parser.flatten(null, arguments, true);
        Assertions.assertArrayEquals(expected, actual);
    }
}