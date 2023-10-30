package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_98_Run_20231025_193245 {
    @Test
    public void testIsRequired() {
        // create a mock Option instance
        Option option = mock(Option.class);

        // set the value of the "required" field to true
        when(option.isRequired()).thenReturn(true);

        // assert that the method returns true
        assertTrue(option.isRequired());

        // set the value of the "required" field to false
        when(option.isRequired()).thenReturn(false);

        // assert that the method returns false
        assertFalse(option.isRequired());
    }
}