package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TypeHandlerTest_Method_220_Run_20231024_151954 {
    @Test
    public void testCreateNumber_DecimalPoint() throws ParseException {
        String input = "1.234";
        Number expectedOutput = Double.valueOf(1.234);
        Number actualOutput = TypeHandler.createNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCreateNumber_NoDecimalPoint() throws ParseException {
        String input = "1234";
        Number expectedOutput = Long.valueOf(1234);
        Number actualOutput = TypeHandler.createNumber(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCreateNumber_InvalidNumber() {
        String input = "abc";
        assertThrows(ParseException.class, () -> TypeHandler.createNumber(input));
    }
}