/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:59:37 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.AlreadySelectedException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AlreadySelectedException_ESTest extends AlreadySelectedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      optionGroup0.setRequired(true);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup0, optionGroup1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("The option 'null' was specified but an option from this group has already been selected: 'null'");
      Option option0 = alreadySelectedException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", (String) null, true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setRequired(true);
      Option option1 = alreadySelectedException0.getOption();
      assertEquals("", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", (String) null, true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setValueSeparator('1');
      Option option1 = alreadySelectedException0.getOption();
      assertEquals(1, option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("e478", "e478", true, "C");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setOptionalArg(true);
      Option option1 = alreadySelectedException0.getOption();
      assertTrue(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", (String) null, true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgs(691);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null);
      option0.setArgName("org.apache.commons.cli.OptionValidator");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertSame(option1, option0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", false, "");
      option0.setArgs(0);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = null;
      try {
        alreadySelectedException0 = new AlreadySelectedException((OptionGroup) null, option0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.AlreadySelectedException", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", (String) null, true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup1, optionGroup0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("");
      OptionGroup optionGroup0 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup0);
  }
}
