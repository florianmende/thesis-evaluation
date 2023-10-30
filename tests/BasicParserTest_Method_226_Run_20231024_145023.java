package org.apache.commons.cli;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class BasicParserTest_Method_226_Run_20231024_145023 {
    @Mock
    private Options options;

    @Test
    public void testFlatten() {
        BasicParser parser = new BasicParser();
        String[] arguments = new String[] {"-a", "foo", "-b", "bar"};
        String[] expected = new String[] {"-a", "foo", "-b", "bar"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithStopAtNonOption() {
        BasicParser parser = new BasicParser();
        String[] arguments = new String[] {"-a", "foo", "-b", "bar"};
        String[] expected = new String[] {"-a", "foo", "-b", "bar"};
        String[] actual = parser.flatten(options, arguments, true);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenWithEmptyArguments() {
        BasicParser parser = new BasicParser();
        String[] arguments = new String[] {};
        String[] expected = new String[] {};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }
}