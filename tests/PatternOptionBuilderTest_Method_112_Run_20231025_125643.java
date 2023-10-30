package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class PatternOptionBuilderTest_Method_112_Run_20231025_125643 {

    @Test
    public void testIsValueCode() {
        PatternOptionBuilder builder = new PatternOptionBuilder();

        // Case 1: When the character is a value code, the method should return true
        assertEquals(true, builder.isValueCode('@'));
        assertEquals(true, builder.isValueCode(':'));
        assertEquals(true, builder.isValueCode('%'));
        assertEquals(true, builder.isValueCode('+'));
        assertEquals(true, builder.isValueCode('#'));
        assertEquals(true, builder.isValueCode('<'));
        assertEquals(true, builder.isValueCode('>'));
        assertEquals(true, builder.isValueCode('*'));
        assertEquals(true, builder.isValueCode('/'));
        assertEquals(true, builder.isValueCode('!'));

        // Case 2: When the character is not a value code, the method should return false
        assertEquals(false, builder.isValueCode('a'));
        assertEquals(false, builder.isValueCode('b'));
        assertEquals(false, builder.isValueCode('c'));
        assertEquals(false, builder.isValueCode('d'));
        assertEquals(false, builder.isValueCode('e'));
        assertEquals(false, builder.isValueCode('f'));
        assertEquals(false, builder.isValueCode('g'));
        assertEquals(false, builder.isValueCode('h'));
        assertEquals(false, builder.isValueCode('i'));
        assertEquals(false, builder.isValueCode('j'));

        // Case 3: When the character is null, the method should return false
        assertEquals(false, builder.isValueCode(Character.MIN_VALUE));
    }
}