package org.apache.commons.cli;


import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

class AlreadySelectedExceptionTest_Method_154_Run_20231025_193245 {

    @Test
    void testGetOptionGroup_optionFromGroupSelected() throws Exception {
        // Setup
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Option option = Mockito.mock(Option.class);
        Mockito.when(group.getSelected()).thenReturn("option");
        AlreadySelectedException exception = new AlreadySelectedException(group, option);

        // Exercise
        OptionGroup actualGroup = exception.getOptionGroup();

        // Verify
        Assertions.assertEquals(group, actualGroup);
    }

    @Test
    void testGetOptionGroup_noOptionFromGroupSelected() throws Exception {
        // Setup
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Option option = Mockito.mock(Option.class);
        Mockito.when(group.getSelected()).thenReturn(null);
        AlreadySelectedException exception = new AlreadySelectedException(group, option);

        // Exercise
        OptionGroup actualGroup = exception.getOptionGroup();

        // Verify
        Assertions.assertEquals(group, actualGroup);
    }

    @Test
    void testGetOptionGroup_multipleOptionsFromGroupSelected() throws Exception {
        // Setup
        OptionGroup group = Mockito.mock(OptionGroup.class);
        Option option1 = Mockito.mock(Option.class);
        Option option2 = Mockito.mock(Option.class);
        Mockito.when(group.getSelected()).thenReturn("option1", "option2");
        AlreadySelectedException exception = new AlreadySelectedException(group, option1);

        // Exercise
        OptionGroup actualGroup = exception.getOptionGroup();

        // Verify
        Assertions.assertEquals(group, actualGroup);
    }
}