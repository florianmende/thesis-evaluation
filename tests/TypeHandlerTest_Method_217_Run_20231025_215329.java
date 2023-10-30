package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TypeHandlerTest_Method_217_Run_20231025_215329 {
    @Test
    public void testCreateDate() {
        // Test case 1:
        String validDateString = "2023-02-28";
        try {
            TypeHandler.createDate(validDateString);
            Assertions.fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Expected exception thrown
        }

        // Test case 2:
        String invalidDateString = "2023-02-31";
        try {
            TypeHandler.createDate(invalidDateString);
            Assertions.fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Expected exception thrown
        }

        // Test case 3:
        String nullDateString = null;
        try {
            TypeHandler.createDate(nullDateString);
            Assertions.fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException e) {
            // Expected exception thrown
        }
    }
}