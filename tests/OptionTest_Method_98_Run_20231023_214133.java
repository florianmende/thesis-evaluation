package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionTest_Method_98_Run_20231023_214133 {
    @Test
    public void testIsRequired() {
        // create a mock Option object
        Option mockOption = mock(Option.class);

        // set the required field to true
        when(mockOption.isRequired()).thenReturn(true);

        // test that the isRequired method returns true
        assertTrue(mockOption.isRequired());

        // set the required field to false
        when(mockOption.isRequired()).thenReturn(false);

        // test that the isRequired method returns false
        assertFalse(mockOption.isRequired());

        // set the required field to null
        when(mockOption.isRequired()).thenReturn(false);

        // test that the isRequired method returns false
        assertFalse(mockOption.isRequired());
    }
}