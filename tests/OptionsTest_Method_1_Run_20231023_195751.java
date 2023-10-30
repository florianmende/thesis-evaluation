package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionsTest_Method_1_Run_20231023_195751 {
    @Test
    public void testAddOption() {
        Option opt = Mockito.mock(Option.class);
        Mockito.when(opt.getKey()).thenReturn("key");
        Mockito.when(opt.getLongOpt()).thenReturn("longOpt");
        Mockito.when(opt.hasLongOpt()).thenReturn(true);
        Mockito.when(opt.isRequired()).thenReturn(true);

        Options options = new Options();
        options.addOption(opt);

        Assertions.assertEquals(1, options.getOptions().size());
        Assertions.assertEquals(opt, options.getOption("key"));
        Assertions.assertEquals(opt, options.getOption("longOpt"));
        Assertions.assertTrue(options.hasOption("key"));
        Assertions.assertTrue(options.hasOption("longOpt"));
        Assertions.assertTrue(options.hasLongOption("longOpt"));
        Assertions.assertTrue(options.hasShortOption("key"));
        Assertions.assertEquals(1, options.getRequiredOptions().size());
        Assertions.assertEquals("key", options.getRequiredOptions().get(0));
    }

    @Test
    public void testAddOptionWithoutLongOpt() {
        Option opt = Mockito.mock(Option.class);
        Mockito.when(opt.getKey()).thenReturn("key");
        Mockito.when(opt.getLongOpt()).thenReturn(null);
        Mockito.when(opt.hasLongOpt()).thenReturn(false);
        Mockito.when(opt.isRequired()).thenReturn(true);

        Options options = new Options();
        options.addOption(opt);

        Assertions.assertEquals(1, options.getOptions().size());
        Assertions.assertEquals(opt, options.getOption("key"));
        Assertions.assertNull(options.getOption("longOpt"));
        Assertions.assertTrue(options.hasOption("key"));
        Assertions.assertFalse(options.hasOption("longOpt"));
        Assertions.assertFalse(options.hasLongOption("longOpt"));
        Assertions.assertTrue(options.hasShortOption("key"));
        Assertions.assertEquals(1, options.getRequiredOptions().size());
        Assertions.assertEquals("key", options.getRequiredOptions().get(0));
    }

    @Test
    public void testAddOptionWithoutRequired() {
        Option opt = Mockito.mock(Option.class);
        Mockito.when(opt.getKey()).thenReturn("key");
        Mockito.when(opt.getLongOpt()).thenReturn("longOpt");
        Mockito.when(opt.hasLongOpt()).thenReturn(true);
        Mockito.when(opt.isRequired()).thenReturn(false);

        Options options = new Options();
        options.addOption(opt);

        Assertions.assertEquals(1, options.getOptions().size());
        Assertions.assertEquals(opt, options.getOption("key"));
        Assertions.assertEquals(opt, options.getOption("longOpt"));
        Assertions.assertTrue(options.hasOption("key"));
        Assertions.assertTrue(options.hasOption("longOpt"));
        Assertions.assertTrue(options.hasLongOption("longOpt"));
        Assertions.assertTrue(options.hasShortOption("key"));
        Assertions.assertEquals(0, options.getRequiredOptions().size());
    }
}