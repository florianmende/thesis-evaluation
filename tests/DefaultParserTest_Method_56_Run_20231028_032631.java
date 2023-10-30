package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;

public class DefaultParserTest_Method_56_Run_20231028_032631 {
    @Test
    public void testParse() throws ParseException {
        Options options = new Options();
        options.addOption("a", "arg1", true, "argument 1");
        options.addOption("b", "arg2", true, "argument 2");

        String[] arguments = new String[] { "-a", "value1", "-b", "value2" };
        Properties properties = new Properties();
        properties.setProperty("arg1", "value1");
        properties.setProperty("arg2", "value2");

        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, arguments, properties, false);

        assertEquals("value1", cmd.getOptionValue("a"));
        assertEquals("value2", cmd.getOptionValue("b"));
    }

    @Test
    public void testParseWithInvalidOption() {
        Options options = new Options();
        options.addOption("a", "arg1", true, "argument 1");
        options.addOption("b", "arg2", true, "argument 2");

        String[] arguments = new String[] { "-a", "value1", "-c", "value2" };
        Properties properties = new Properties();
        properties.setProperty("arg1", "value1");
        properties.setProperty("arg2", "value2");

        DefaultParser parser = new DefaultParser();
        assertThrows(ParseException.class, () -> parser.parse(options, arguments, properties, false));
    }

    @Test
    public void testParseWithMissingOptionValue() {
        Options options = new Options();
        options.addOption("a", "arg1", true, "argument 1");
        options.addOption("b", "arg2", true, "argument 2");

        String[] arguments = new String[] { "-a", "value1", "-b" };
        Properties properties = new Properties();
        properties.setProperty("arg1", "value1");
        properties.setProperty("arg2", "value2");

        DefaultParser parser = new DefaultParser();
        assertThrows(ParseException.class, () -> parser.parse(options, arguments, properties, false));
    }
}