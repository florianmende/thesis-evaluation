package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TypeHandlerTest_Method_220_Run_20231024_004630 {

    @Test
    public void testCreateNumberWithDecimalPoint() throws ParseException {
        String str = "1.1";
        Number expected = Double.valueOf(str);
        Number actual = TypeHandler.createNumber(str);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumberWithoutDecimalPoint() throws ParseException {
        String str = "1";
        Number expected = Long.valueOf(str);
        Number actual = TypeHandler.createNumber(str);
        assertEquals(expected, actual);
    }

    @Test
    public void testCreateNumberWithInvalidString() {
        String str = "abc";
        assertThrows(ParseException.class, () -> TypeHandler.createNumber(str));
    }
}