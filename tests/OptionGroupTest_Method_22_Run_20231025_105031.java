package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

public class OptionGroupTest_Method_22_Run_20231025_105031 {

    @Test
    public void testIsRequired_required() {
        // Arrange
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);

        // Act
        boolean result = optionGroup.isRequired();

        // Assert
        assertTrue(result);
    }

    @Test
    public void testIsRequired_notRequired() {
        // Arrange
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);

        // Act
        boolean result = optionGroup.isRequired();

        // Assert
        assertFalse(result);
    }

    @Test
    public void testIsRequired_requiredButNotSet() {
        // Arrange
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        optionGroup.setRequired(false);

        // Act
        boolean result = optionGroup.isRequired();

        // Assert
        assertFalse(result);
    }
}