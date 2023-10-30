package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.Test;
import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class OptionBuilderTest_Method_170_Run_20231023_195751 {

    @Test
    public void testWithLongOpt() {
        Option option = OptionBuilder.withLongOpt("longOpt").create();
        assertEquals("longOpt", option.getLongOpt());
    }

    @Test
    public void testWithInvalidLongOpt() {
        assertThrows(IllegalArgumentException.class, () -> OptionBuilder.withLongOpt(null).create());
    }

    @Test
    public void testLongOptFieldIsSet() throws Exception {
        Option option = OptionBuilder.withLongOpt("longOpt").create();
        Field longOptField = Option.class.getDeclaredField("longOption");
        longOptField.setAccessible(true);
        assertEquals("longOpt", longOptField.get(option));
    }
}