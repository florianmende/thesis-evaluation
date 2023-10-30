package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.apache.commons.cli.Option;

public class OptionTest_Method_108_Run_20231027_232619 {
    @Test
    public void testSetType() {
        Option option = new Option("a", "arg-name", false, "description");
        Class<?> type = String.class;
        option.setType(type);
        assertEquals(type, option.getType());
    }
}