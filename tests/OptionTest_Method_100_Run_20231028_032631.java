package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.Test;
import junit.framework.Assert;

public class OptionTest_Method_100_Run_20231028_032631 {

    @Test
    public void testRequiresArg() {
        Option option = new Option("a", "arg-name", false, "description");
        Assert.assertFalse(option.requiresArg());

        option = new Option("a", "arg-name", true, "description");
        Assert.assertTrue(option.requiresArg());

        option = new Option("a", "arg-name", true, "description");
        option.setRequired(true);
        Assert.assertTrue(option.requiresArg());
    }
}