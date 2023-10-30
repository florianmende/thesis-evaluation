package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BasicParserTest_Method_226_Run_20231024_080105 {
    @Test
    public void testFlattenWithEmptyOptions() {
        String[] arguments = {"-a", "foo", "-b", "bar"};
        String[] expected = {"-a", "foo", "-b", "bar"};
        String[] actual = new BasicParser().flatten(new Options(), arguments, false);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithNonEmptyOptions() {
        String[] arguments = {"-a", "foo", "-b", "bar"};
        String[] expected = {"-a", "foo", "-b", "bar"};
        String[] actual = new BasicParser().flatten(new Options(), arguments, false);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithNullArguments() {
        String[] arguments = null;
        String[] expected = null;
        String[] actual = new BasicParser().flatten(new Options(), arguments, false);
        Assertions.assertArrayEquals(expected, actual);
    }
}