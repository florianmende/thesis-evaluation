package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_103_Run_20231028_042634 {
    @Test
    public void testSetDescriptionValidString() {
        Option option = Mockito.mock(Option.class);
        option.setDescription("Valid description");
        Mockito.verify(option).setDescription("Valid description");
    }

    @Test
    public void testSetDescriptionEmptyString() {
        Option option = Mockito.mock(Option.class);
        option.setDescription("");
        Mockito.verify(option).setDescription("");
    }

    @Test
    public void testSetDescriptionNull() {
        Option option = Mockito.mock(Option.class);
        option.setDescription(null);
        Mockito.verify(option).setDescription(null);
    }
}