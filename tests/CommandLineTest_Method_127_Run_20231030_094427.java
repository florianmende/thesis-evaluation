package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CommandLineTest_Method_127_Run_20231030_094427 {

    @Test
    public void testAddArg() {
        CommandLine commandLine = new CommandLine();
        String arg = "--help";
        commandLine.addArg(arg);
        assertEquals(1, commandLine.getArgList().size());
        assertEquals(arg, commandLine.getArgList().get(0));
    }

    @Test
    public void testAddArgNull() {
        CommandLine commandLine = new CommandLine();
        String arg = null;
        commandLine.addArg(arg);
        assertEquals(0, commandLine.getArgList().size());
    }

    @Test
    public void testAddArgDuplicate() {
        CommandLine commandLine = new CommandLine();
        String arg = "--help";
        commandLine.addArg(arg);
        if (!commandLine.getArgList().contains(arg)) {
            commandLine.addArg(arg);
        }
        assertEquals(1, commandLine.getArgList().size());
        assertEquals(arg, commandLine.getArgList().get(0));
    }
}