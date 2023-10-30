package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DefaultParserTest_Method_44_Run_20231028_052637 {
    private final DefaultParser parser = new DefaultParser();

    @Test
    public void testShortOption() throws ParseException {
        Options options = new Options();
        options.addOption(Option.builder("S").build());

        CommandLine cmd = parser.parse(options, new String[]{"-S"});

        assertEquals(1, cmd.getOptions().length);
        assertEquals("S", cmd.getOptions()[0].getOpt());
    }

    @Test
    public void testLongOption() throws ParseException {
        Options options = new Options();
        options.addOption(Option.builder("L").hasArg().build());

        CommandLine cmd = parser.parse(options, new String[]{"-L", "V"});

        assertEquals(1, cmd.getOptions().length);
        assertEquals("L", cmd.getOptions()[0].getOpt());
        assertEquals("V", cmd.getOptions()[0].getValue());
    }

    @Test
    public void testUnknownToken() {
        Options options = new Options();
        options.addOption(Option.builder("S").build());

        assertThrows(ParseException.class, () -> parser.parse(options, new String[]{"-X"}));
    }
}