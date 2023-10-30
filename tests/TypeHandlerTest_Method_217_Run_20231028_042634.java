package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TypeHandlerTest_Method_217_Run_20231028_042634 {
    @Test
    void testCreateDate_throwsException() {
        assertThrows(UnsupportedOperationException.class, () -> TypeHandler.createDate("2023-02-28"));
    }

    @Test
    void testCreateDate_invalidDateString_throwsException() {
        assertThrows(UnsupportedOperationException.class, () -> TypeHandler.createDate("invalid date string"));
    }

    @Test
    void testCreateDate_nullDateString_throwsException() {
        assertThrows(UnsupportedOperationException.class, () -> TypeHandler.createDate(null));
    }
}