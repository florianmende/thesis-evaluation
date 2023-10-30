package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MissingArgumentExceptionTest_Method_32_Run_20231028_022628 {

    @Mock
    private Option option;

    @Test
    void testGetOption() {
        // given
        MissingArgumentException exception = new MissingArgumentException(option);

        // when
        Option result = exception.getOption();

        // then
        assertEquals(option, result);
    }
}