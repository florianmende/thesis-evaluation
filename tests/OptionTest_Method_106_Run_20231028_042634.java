package org.apache.commons.cli;


import org.junit.Test;
import org.junit.Assert;

public class OptionTest_Method_106_Run_20231028_042634 {
    @Test
    public void testRequired() {
        Option.Builder builder = Option.builder("test");
        builder.required(true);
        Option option = builder.build();
        Assert.assertTrue(option.isRequired());

        builder.required(false);
        option = builder.build();
        Assert.assertFalse(option.isRequired());

        builder.required(true);
        option = builder.build();
        Assert.assertTrue(option.isRequired());
    }
}