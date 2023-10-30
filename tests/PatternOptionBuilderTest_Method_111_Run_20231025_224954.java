package org.apache.commons.cli;

import org.apache.commons.cli.PatternOptionBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PatternOptionBuilderTest_Method_111_Run_20231025_224954 {
    @Test
    public void testGetValueClassWithValidCharacters() {
        assertEquals(PatternOptionBuilder.OBJECT_VALUE, PatternOptionBuilder.getValueClass('@'));
        assertEquals(PatternOptionBuilder.STRING_VALUE, PatternOptionBuilder.getValueClass(':'));
        assertEquals(PatternOptionBuilder.NUMBER_VALUE, PatternOptionBuilder.getValueClass('%'));
        assertEquals(PatternOptionBuilder.CLASS_VALUE, PatternOptionBuilder.getValueClass('+'));
        assertEquals(PatternOptionBuilder.DATE_VALUE, PatternOptionBuilder.getValueClass('#'));
        assertEquals(PatternOptionBuilder.EXISTING_FILE_VALUE, PatternOptionBuilder.getValueClass('<'));
        assertEquals(PatternOptionBuilder.FILE_VALUE, PatternOptionBuilder.getValueClass('>'));
        assertEquals(PatternOptionBuilder.FILES_VALUE, PatternOptionBuilder.getValueClass('*'));
        assertEquals(PatternOptionBuilder.URL_VALUE, PatternOptionBuilder.getValueClass('/'));
    }

    @Test
    public void testGetValueClassWithInvalidCharacters() {
        assertNull(PatternOptionBuilder.getValueClass('a'));
        assertNull(PatternOptionBuilder.getValueClass('b'));
        assertNull(PatternOptionBuilder.getValueClass('c'));
        assertNull(PatternOptionBuilder.getValueClass('d'));
        assertNull(PatternOptionBuilder.getValueClass('e'));
        assertNull(PatternOptionBuilder.getValueClass('f'));
        assertNull(PatternOptionBuilder.getValueClass('g'));
        assertNull(PatternOptionBuilder.getValueClass('h'));
        assertNull(PatternOptionBuilder.getValueClass('i'));
        assertNull(PatternOptionBuilder.getValueClass('j'));
        assertNull(PatternOptionBuilder.getValueClass('k'));
        assertNull(PatternOptionBuilder.getValueClass('l'));
        assertNull(PatternOptionBuilder.getValueClass('m'));
        assertNull(PatternOptionBuilder.getValueClass('n'));
        assertNull(PatternOptionBuilder.getValueClass('o'));
        assertNull(PatternOptionBuilder.getValueClass('p'));
        assertNull(PatternOptionBuilder.getValueClass('q'));
        assertNull(PatternOptionBuilder.getValueClass('r'));
        assertNull(PatternOptionBuilder.getValueClass('s'));
        assertNull(PatternOptionBuilder.getValueClass('t'));
        assertNull(PatternOptionBuilder.getValueClass('u'));
        assertNull(PatternOptionBuilder.getValueClass('v'));
        assertNull(PatternOptionBuilder.getValueClass('w'));
        assertNull(PatternOptionBuilder.getValueClass('x'));
        assertNull(PatternOptionBuilder.getValueClass('y'));
        assertNull(PatternOptionBuilder.getValueClass('z'));
    }
}