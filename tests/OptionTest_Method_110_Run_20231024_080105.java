package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_110_Run_20231024_080105 {

    @Test
    public void testToStringWithOptionAndLongOption() {
        // Arrange
        Option option = mock(Option.class);
        String expectedString = "[ option: option longOption: longOption description: description type: type ]";
        when(option.toString()).thenReturn(expectedString);

        // Act
        String actualString = option.toString();

        // Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void testToStringWithOptionNullAndLongOptionNotNull() {
        // Arrange
        Option option = mock(Option.class);
        String expectedString = "[ option: null longOption: longOption description: description type: type ]";
        when(option.toString()).thenReturn(expectedString);

        // Act
        String actualString = option.toString();

        // Assert
        assertEquals(expectedString, actualString);
    }

    @Test
    public void testToStringWithOptionAndLongOptionNull() {
        // Arrange
        Option option = mock(Option.class);
        String expectedString = "[ option: option longOption: null description: description type: type ]";
        when(option.toString()).thenReturn(expectedString);

        // Act
        String actualString = option.toString();

        // Assert
        assertEquals(expectedString, actualString);
    }
}