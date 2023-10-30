package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandLineTest_Method_127_Run_20231024_145023 {
    @Test
    public void testAddArgNull() {
        CommandLine cmd = new CommandLine();
        cmd.addArg(null);
        assertEquals(0, cmd.getArgList().size());
    }

    @Test
    public void testAddArgNotNull() {
        CommandLine cmd = new CommandLine();
        cmd.addArg("arg");
        assertEquals(1, cmd.getArgList().size());
        assertEquals("arg", cmd.getArgList().get(0));
    }

    @Test
    public void testAddArgEmptyString() {
        CommandLine cmd = new CommandLine();
        cmd.addArg("");
        assertEquals(1, cmd.getArgList().size());
        assertEquals("", cmd.getArgList().get(0));
    }
}