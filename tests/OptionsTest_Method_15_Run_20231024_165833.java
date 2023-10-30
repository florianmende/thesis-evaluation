package org.apache.commons.cli;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_15_Run_20231024_165833 {

    @Test
    public void testHasShortOption_WhenOptionIsMemberOfOptionsInstance_ReturnsTrue() {
        // Arrange
        Options options = new Options();
        options.addOption("a", "first-option");
        options.addOption("b", "second-option");
        String opt = "a";

        // Act
        boolean result = options.hasShortOption(opt);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testHasShortOption_WhenOptionIsNotMemberOfOptionsInstance_ReturnsFalse() {
        // Arrange
        Options options = new Options();
        options.addOption("a", "first-option");
        options.addOption("b", "second-option");
        String opt = "c";

        // Act
        boolean result = options.hasShortOption(opt);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testHasShortOption_WhenOptionIsNullOrEmpty_ReturnsFalse() {
        // Arrange
        Options options = new Options();
        options.addOption("a", "first-option");
        options.addOption("b", "second-option");
        String opt = null;

        // Act
        boolean result = options.hasShortOption(opt);

        // Assert
        assertFalse(result);
    }
}