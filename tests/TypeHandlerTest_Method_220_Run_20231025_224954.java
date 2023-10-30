package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TypeHandlerTest_Method_220_Run_20231025_224954 {

    @Test
    public void testCreateNumber1() throws ParseException {
        String str = "1.23";
        Number number = TypeHandler.createNumber(str);
        assertTrue(number instanceof Double);
        assertEquals(1.23, number.doubleValue(), 0.001);
    }

    @Test
    public void testCreateNumber2() throws ParseException {
        String str = "123";
        Number number = TypeHandler.createNumber(str);
        assertTrue(number instanceof Long);
        assertEquals(123, number.longValue());
    }

    @Test(expected = ParseException.class)
    public void testCreateNumber3() throws ParseException {
        String str = "abc";
        TypeHandler.createNumber(str);
    }
}