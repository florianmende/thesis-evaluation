package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest_Method_91_Run_20231025_183916 {
    @Test
    public void testArgName() {
        Option.Builder builder = Option.builder("a");
        builder.argName("arg-name");
        Option option = builder.build();
        assertEquals("arg-name", option.getArgName());
    }
}