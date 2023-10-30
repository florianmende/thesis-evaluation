package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

public class OptionsTest_Method_9_Run_20231026_155023 {
    @Test
    public void testGetOptionGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option option = new Option("a", "aaa");
        group.addOption(option);
        options.addOptionGroup(group);

        // Test case 1: The option belongs to an option group
        OptionGroup result = options.getOptionGroup(option);
        Assert.assertEquals(group, result);

        // Test case 2: The option does not belong to an option group
        OptionGroup result2 = options.getOptionGroup(new Option("b", "bbb"));
        Assert.assertNull(result2);

        // Test case 3: The option is null
        Assert.assertThrows(NullPointerException.class, () -> options.getOptionGroup(null));
    }
}