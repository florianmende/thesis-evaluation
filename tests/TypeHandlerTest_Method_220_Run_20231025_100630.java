package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TypeHandlerTest_Method_220_Run_20231025_100630 {
    @Test
    public void testCreateNumberWithDecimalPoint() throws ParseException {
        TypeHandler typeHandler = Mockito.mock(TypeHandler.class);
        String input = "1.23";
        Number expected = Double.valueOf(input);
        Number actual = typeHandler.createNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumberWithoutDecimalPoint() throws ParseException {
        TypeHandler typeHandler = Mockito.mock(TypeHandler.class);
        String input = "123";
        Number expected = Long.valueOf(input);
        Number actual = typeHandler.createNumber(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumberWithInvalidInput() throws ParseException {
        TypeHandler typeHandler = Mockito.mock(TypeHandler.class);
        String input = "abc";
        assertThrows(ParseException.class, () -> typeHandler.createNumber(input));
    }
}