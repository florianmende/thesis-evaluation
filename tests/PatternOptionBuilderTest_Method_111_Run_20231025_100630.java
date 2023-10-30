package org.apache.commons.cli;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class PatternOptionBuilderTest_Method_111_Run_20231025_100630 {
    @Test
    public void testGetValueClass() {
        // Test case 1: Input character is @
        Assert.assertEquals(PatternOptionBuilder.OBJECT_VALUE, PatternOptionBuilder.getValueClass('@'));

        // Test case 2: Input character is :
        Assert.assertEquals(PatternOptionBuilder.STRING_VALUE, PatternOptionBuilder.getValueClass(':'));

        // Test case 3: Input character is +
        Assert.assertEquals(PatternOptionBuilder.CLASS_VALUE, PatternOptionBuilder.getValueClass('+'));
    }
}