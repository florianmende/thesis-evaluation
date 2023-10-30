package org.apache.commons.cli;


import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import java.util.Properties; // <-- Added import statement

public class DefaultParserTest_Method_55_Run_20231023_204140 {
    @Test
    public void testValidArguments() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", false, "beta option");
        options.addOption("c", "charlie", false, "charlie option");

        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, new String[]{"-a", "-b", "-c"}, new Properties());

        Assert.assertNotNull(cmd);
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertTrue(cmd.hasOption("b"));
        Assert.assertTrue(cmd.hasOption("c"));
    }
}