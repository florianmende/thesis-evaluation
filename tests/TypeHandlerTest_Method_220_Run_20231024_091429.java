package org.apache.commons.cli;


import org.junit.Test;
import org.junit.Assert;

public class TypeHandlerTest_Method_220_Run_20231024_091429 {
    @Test
    public void testCreateNumber_Double() throws ParseException {
        String str = "1.23";
        Number number = TypeHandler.createNumber(str);
        Assert.assertEquals(Double.class, number.getClass());
        Assert.assertEquals(1.23, number.doubleValue(), 0.001);
    }

    @Test
    public void testCreateNumber_Long() throws ParseException {
        String str = "123";
        Number number = TypeHandler.createNumber(str);
        Assert.assertEquals(Long.class, number.getClass());
        Assert.assertEquals(123, number.longValue());
    }
}