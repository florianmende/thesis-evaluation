package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class TypeHandlerTest_Method_220_Run_20231024_060930 {

    @Test
    public void testCreateNumberWithDecimalPoint() throws ParseException {
        String str = "3.14";
        Number expected = 3.14;
        Number actual = TypeHandler.createNumber(str);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumberWithoutDecimalPoint() throws ParseException {
        String str = "42";
        Number expected = 42L;
        Number actual = TypeHandler.createNumber(str);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumberWithInvalidNumber() throws ParseException {
        String str = "invalid";
        assertThrows(ParseException.class, () -> TypeHandler.createNumber(str));
    }
}