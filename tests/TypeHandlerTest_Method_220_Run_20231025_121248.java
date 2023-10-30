package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class TypeHandlerTest_Method_220_Run_20231025_121248 {
    @Test
    void testCreateNumberWithDecimalPoint() throws ParseException {
        Number result = TypeHandler.createNumber("1.2");
        assertEquals(1.2, result);
    }

    @Test
    void testCreateNumberWithoutDecimalPoint() throws ParseException {
        Number result = TypeHandler.createNumber("12");
        assertEquals(12L, result);
    }

    @Test
    void testCreateNumberWithInvalidNumber() throws ParseException {
        assertThrows(ParseException.class, () -> TypeHandler.createNumber("abc"));
    }
}