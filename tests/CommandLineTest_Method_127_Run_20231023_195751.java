package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class CommandLineTest_Method_127_Run_20231023_195751 {
    @Test
    public void testAddArg_NullArgument() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg(null);
        Assert.assertEquals(0, commandLine.getArgList().size());
    }

    @Test
    public void testAddArg_NonNullArgument() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        Assert.assertEquals(1, commandLine.getArgList().size());
    }

    @Test
    public void testAddArg_MultipleArguments() {
        CommandLine commandLine = new CommandLine();
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        Assert.assertEquals(2, commandLine.getArgList().size());
    }
}