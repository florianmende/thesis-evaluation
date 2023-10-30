package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionsTest_Method_4_Run_20231023_214133 {
    @Test
    public void testAddOption() {
        Options options = new Options();
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getKey()).thenReturn("key");
        Mockito.when(option.getLongOpt()).thenReturn("longKey");
        Mockito.when(option.isRequired()).thenReturn(true);
        Mockito.when(option.hasArg()).thenReturn(true);
        options.addOption(option);
        Assertions.assertEquals(1, options.getOptions().size());
        Option addedOption = options.getOption("key");
        Assertions.assertEquals("key", addedOption.getKey());
        Assertions.assertEquals("longKey", addedOption.getLongOpt());
        Assertions.assertTrue(addedOption.isRequired());
        Assertions.assertTrue(addedOption.hasArg());
    }
}