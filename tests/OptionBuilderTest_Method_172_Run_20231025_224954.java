package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class OptionBuilderTest_Method_172_Run_20231025_224954 {
    @Test
    public void testWithType() {
        OptionBuilder ob = OptionBuilder.withLongOpt("test");
        Class<?> type = String.class;
        Option option = ob.withType(type).create();
        assertEquals(type, option.getType());
    }
}