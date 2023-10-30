package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AlreadySelectedExceptionTest_Method_154_Run_20231028_012625 {
    @Test
    public void testGetOptionGroup() {
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Option option = Mockito.mock(Option.class);
        AlreadySelectedException exception = new AlreadySelectedException(group, option);

        assertEquals(group, exception.getOptionGroup());
    }
}