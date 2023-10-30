package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OptionTest_Method_104_Run_20231024_165833 {

    @Mock
    private Option option;

    @Test
    public void testSetLongOption() {
        String longOpt = "long-opt";
        option.setLongOpt(longOpt);
    }
}