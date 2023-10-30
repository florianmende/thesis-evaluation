package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.Test;
import org.junit.Assert;

public class DefaultParserTest_Method_54_Run_20231024_165833 {

    @Test
    public void testParseValidInput() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "bravo", false, "Bravo option");
        options.addOption("c", "charlie", false, "Charlie option");
        String[] arguments = new String[] {"-a", "-b", "-c"};
        CommandLine cmd = new DefaultParser().parse(options, arguments, false);
        Assert.assertEquals(3, cmd.getOptions().length);
        Assert.assertEquals("alpha", cmd.getOptions()[0].getLongOpt());
        Assert.assertEquals("bravo", cmd.getOptions()[1].getLongOpt());
        Assert.assertEquals("charlie", cmd.getOptions()[2].getLongOpt());
    }

    @Test(expected = ParseException.class)
    public void testParseInvalidInput() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "bravo", false, "Bravo option");
        options.addOption("c", "charlie", false, "Charlie option");
        String[] arguments = new String[] {"-d", "-e", "-f"};
        CommandLine cmd = new DefaultParser().parse(options, arguments, false);
    }

    @Test
    public void testStopAtNonOption() throws ParseException {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "bravo", false, "Bravo option");
        options.addOption("c", "charlie", false, "Charlie option");
        String[] arguments = new String[] {"-a", "-b", "--", "-c"};
        CommandLine cmd = new DefaultParser().parse(options, arguments, true);
        Assert.assertEquals(2, cmd.getOptions().length);
        Assert.assertEquals("alpha", cmd.getOptions()[0].getLongOpt());
        Assert.assertEquals("bravo", cmd.getOptions()[1].getLongOpt());
    }
}