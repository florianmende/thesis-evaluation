package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
public class AlreadySelectedExceptionTest_Method_153_Run_20231023_214133 {

    @Mock
    private OptionGroup group;

    @Mock
    private Option option;

    @Test
    public void testGetOption() {
        AlreadySelectedException exception = new AlreadySelectedException(group, option);
        Option actualOption = exception.getOption();
        assertNotNull(actualOption);
        assertNotEquals("", actualOption.getKey());
    }
}