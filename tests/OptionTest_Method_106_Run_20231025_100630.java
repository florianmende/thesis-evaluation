package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

import java.lang.reflect.Field;

@RunWith(JUnit4.class)
public class OptionTest_Method_106_Run_20231025_100630 {

    @Test
    public void testSetRequired() throws Exception {
        Option option = new Option("a", "arg-name", true, "description");
        option.setRequired(true);

        Field requiredField = Option.class.getDeclaredField("required");
        requiredField.setAccessible(true);
        boolean required = (boolean) requiredField.get(option);

        Assert.assertTrue(required);
    }
}