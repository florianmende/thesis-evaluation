package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OptionsTest_Method_9_Run_20231025_224954 {
    @Mock
    private Options options;

    @Test
    void testGetOptionGroup_belongsToOptionGroup() {
        // Arrange
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Option A");
        optionGroup.addOption(option);
        when(options.getOptionGroup(option)).thenReturn(optionGroup);

        // Act
        OptionGroup actualOptionGroup = options.getOptionGroup(option);

        // Assert
        assertEquals(optionGroup, actualOptionGroup);
    }

    @Test
    void testGetOptionGroup_doesNotBelongToOptionGroup() {
        // Arrange
        OptionGroup optionGroup = new OptionGroup();
        Option option = new Option("a", "alpha", false, "Option A");
        when(options.getOptionGroup(option)).thenReturn(null);

        // Act
        OptionGroup actualOptionGroup = options.getOptionGroup(option);

        // Assert
        assertNull(actualOptionGroup);
    }

    @Test
    void testGetOptionGroup_optionIsNull() {
        // Arrange
        Option option = null;
        when(options.getOptionGroup(option)).thenReturn(null);

        // Act
        OptionGroup actualOptionGroup = options.getOptionGroup(option);

        // Assert
        assertNull(actualOptionGroup);
    }
}