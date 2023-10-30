package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_71_Run_20231024_145023 {
    @Test
    public void testAddValue() {
        Option option = mock(Option.class);
        when(option.addValue("value")).thenCallRealMethod();
        
        assertThrows(UnsupportedOperationException.class, () -> option.addValue("value"));
    }
}