package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class OptionBuilderTest_Method_160_Run_20231023_195751 {

    @Test
    public void testHasArgs() {
        OptionBuilder builder = OptionBuilder.hasArgs();
        Option option = builder.withLongOpt("longopt").create();
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void testReturnInstance() {
        OptionBuilder builder = OptionBuilder.hasArgs();
        assertNotNull(builder);
    }

    @Test
    public void testNoExceptions() {
        OptionBuilder builder = OptionBuilder.hasArgs();
        assertDoesNotThrow(() -> builder.withLongOpt("longopt").create());
    }
}