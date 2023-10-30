package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

class GnuParserTest_Method_63_Run_20231026_155023 {
    @Test
    void testFlatten() {
        Options options = new Options();
        options.addOption("a", "option a");
        options.addOption("b", "option b");
        options.addOption("c", "option c");

        String[] arguments = new String[] {"-a", "-b", "-c"};
        boolean stopAtNonOption = false;

        GnuParser parser = new GnuParser();
        String[] result = parser.flatten(options, arguments, stopAtNonOption);

        String[] expected = new String[] {"-a", "-b", "-c"};
        Assertions.assertArrayEquals(expected, result);
    }
}