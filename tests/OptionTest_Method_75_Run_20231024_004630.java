package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class OptionTest_Method_75_Run_20231024_004630 {
    @Test
    void testEquals() {
        // Create an Option object with the option "a" and the long option "arg-name"
        Option option = new Option("a", "arg-name", false, "description");

        // Create another Option object with the same option and long option
        Option otherOption = new Option("a", "arg-name", false, "description");

        // Test that the two objects are equal
        assertEquals(option, otherOption);

        // Create a different Option object with a different option and long option
        Option differentOption = new Option("b", "arg-name2", false, "description");

        // Test that the two objects are not equal
        assertNotEquals(option, differentOption);

        // Create a mock Serializable object
        Serializable mockSerializable = Mockito.mock(Serializable.class);

        // Test that the Option object is not equal to the mock object
        assertNotEquals(option, mockSerializable);

        // Create a list of Option objects
        List<Option> optionList = new ArrayList<>();
        optionList.add(option);
        optionList.add(otherOption);

        // Test that the list contains both Option objects
        assertTrue(optionList.contains(option));
        assertTrue(optionList.contains(otherOption));

        // Remove the first Option object from the list
        optionList.remove(0);

        // Test that the list only contains the second Option object
        assertEquals(1, optionList.size());
        assertEquals(otherOption, optionList.get(0));
    }
}