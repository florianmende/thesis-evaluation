package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_77_Run_20231024_091429 {
    @Test
    public void testGetArgs_SpecificNumberOfArgs() {
        // Arrange
        Option option = Mockito.mock(Option.class);
        when(option.getArgs()).thenReturn(3);

        // Act
        int result = option.getArgs();

        // Assert
        assertEquals(3, result);
    }

    @Test
    public void testGetArgs_UnlimitedNumberOfArgs() {
        // Arrange
        Option option = Mockito.mock(Option.class);
        when(option.getArgs()).thenReturn(-2);

        // Act
        int result = option.getArgs();

        // Assert
        assertEquals(-2, result);
    }

    @Test
    public void testGetArgs_NoNumberOfArgsSpecified() {
        // Arrange
        Option option = Mockito.mock(Option.class);
        when(option.getArgs()).thenReturn(-1);

        // Act
        int result = option.getArgs();

        // Assert
        assertEquals(-1, result);
    }
}