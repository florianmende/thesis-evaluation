package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AlreadySelectedExceptionTest_Method_154_Run_20231024_080105 {
    @Mock
    private OptionGroup group1;

    @Mock
    private OptionGroup group2;

    @Mock
    private Option option1;

    @Mock
    private Option option2;

    @Test
    public void testGetOptionGroup_whenOptionBelongsToSelectedGroup() {
        // Arrange
        AlreadySelectedException exception = new AlreadySelectedException(group1, option1);

        // Act
        OptionGroup actualGroup = exception.getOptionGroup();

        // Assert
        assertEquals(group1, actualGroup);
    }

    @Test
    public void testGetOptionGroup_whenOptionBelongsToUnselectedGroup() {
        // Arrange
        AlreadySelectedException exception = new AlreadySelectedException(group2, option2);

        // Act
        OptionGroup actualGroup = exception.getOptionGroup();

        // Assert
        assertNotNull(actualGroup);
    }

    @Test
    public void testGetOptionGroup_whenSameOptionSelectedTwice() {
        // Arrange
        AlreadySelectedException exception = new AlreadySelectedException(group1, option1);

        // Act
        OptionGroup actualGroup1 = exception.getOptionGroup();
        OptionGroup actualGroup2 = exception.getOptionGroup();

        // Assert
        assertEquals(group1, actualGroup1);
        assertEquals(group1, actualGroup2);
    }
}