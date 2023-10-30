package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OptionTest_Method_98_Run_20231026_105918 {

    @Test
    public void testIsRequired_Mandatory() {
        // create an option with the required field set to true
        Option option = Option.builder("a").required(true).build();

        // check that the isRequired method returns true
        assertEquals(true, option.isRequired());
    }

    @Test
    public void testIsRequired_NotMandatory() {
        // create an option with the required field set to false
        Option option = Option.builder("a").required(false).build();

        // check that the isRequired method returns false
        assertEquals(false, option.isRequired());
    }

    @Test
    public void testIsRequired_MandatoryButNotRequired() {
        // create an option with the required field set to true
        Option option = Option.builder("a").required(true).build();

        // set the required field to false
        option.setRequired(false);

        // check that the isRequired method returns false
        assertEquals(false, option.isRequired());
    }
}