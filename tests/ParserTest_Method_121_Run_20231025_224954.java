package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Properties;

class ParserTest_Method_121_Run_20231025_224954 {
    @Test
    void testParse() throws ParseException {
        // Test case 1: Simple command line argument
        String[] args = new String[]{"-a", "foo"};
        Options options = new Options();
        options.addOption("a", "arg", true, "arg");
        Properties properties = new Properties();
        CommandLine cmd = new DefaultParser().parse(options, args, properties, false);
        assertEquals("foo", cmd.getOptionValue("a"));

        // Test case 2: Command line argument with multiple options
        args = new String[]{"-a", "foo", "-b", "bar"};
        options = new Options();
        options.addOption("a", "arg", true, "arg");
        options.addOption("b", "arg", true, "arg");
        properties = new Properties();
        cmd = new DefaultParser().parse(options, args, properties, false);
        assertEquals("foo", cmd.getOptionValue("a"));
        assertEquals("bar", cmd.getOptionValue("b"));

        // Test case 3: Unrecognized option
        args = new String[]{"-c", "foo"};
        options = new Options();
        options.addOption("a", "arg", true, "arg");
        properties = new Properties();
        try {
            cmd = new DefaultParser().parse(options, args, properties, false);
            fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            assertEquals("Unrecognized option: -c", e.getMessage());
        }
    }
}