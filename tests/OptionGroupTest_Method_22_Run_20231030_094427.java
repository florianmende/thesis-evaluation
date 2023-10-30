package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionGroupTest_Method_22_Run_20231030_094427 {
    @Test
    public void testIsRequired_required() {
        // Arrange
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        
        // Act
        boolean actual = group.isRequired();
        
        // Assert
        assertTrue(actual);
    }
    
    @Test
    public void testIsRequired_notRequired() {
        // Arrange
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        
        // Act
        boolean actual = group.isRequired();
        
        // Assert
        assertFalse(actual);
    }
    
    @Test
    public void testIsRequired_empty() {
        // Arrange
        OptionGroup group = new OptionGroup();
        
        // Act
        boolean actual = group.isRequired();
        
        // Assert
        assertFalse(actual);
    }
}