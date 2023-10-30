package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_77_Run_20231023_214133 {

    @Mock
    private Option option;

    @Test
    public void testGetArgsNoArgs() {
        // given
        when(option.getArgs()).thenReturn(0);

        // when
        int result = option.getArgs();

        // then
        assertEquals(0, result);
    }

    @Test
    public void testGetArgsOneArg() {
        // given
        when(option.getArgs()).thenReturn(1);

        // when
        int result = option.getArgs();

        // then
        assertEquals(1, result);
    }

    @Test
    public void testGetArgsUnlimitedArgs() {
        // given
        when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);

        // when
        int result = option.getArgs();

        // then
        assertEquals(Option.UNLIMITED_VALUES, result);
    }
}