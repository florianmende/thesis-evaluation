package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class OptionTest_Method_77_Run_20231027_232619 {
    @Test
    void testGetArgs_UnlimitedArguments() {
        // Arrange
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);

        // Act
        int result = option.getArgs();

        // Assert
        assertEquals(Option.UNLIMITED_VALUES, result);
    }

    @Test
    void testGetArgs_SpecificNumberOfArguments() {
        // Arrange
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(5);

        // Act
        int result = option.getArgs();

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testGetArgs_NoArguments() {
        // Arrange
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(Option.UNINITIALIZED);

        // Act
        int result = option.getArgs();

        // Assert
        assertEquals(Option.UNINITIALIZED, result);
    }
}