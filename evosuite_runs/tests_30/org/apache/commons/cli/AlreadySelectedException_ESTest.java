/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:43:52 GMT 2023
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
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      optionGroup0.setRequired(true);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup0, optionGroup1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "' was specified but an option from this group has already been selected: '", false, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup0, optionGroup1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("x");
      Option option0 = alreadySelectedException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setRequired(true);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      option0.setValueSeparator('z');
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setOptionalArg(true);
      Option option1 = alreadySelectedException0.getOption();
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("J", false, "J");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setLongOpt("org.evosuite.runtime.mock.java.lang.MockThrowable: The option 'J' was specified but an option from this group has already been selected: 'null'");
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getArgName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("J", false, "J");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgName("J");
      Option option1 = alreadySelectedException0.getOption();
      assertEquals("J", option1.getDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      option0.setArgs(0);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgs(897);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getArgName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = null;
      try {
        alreadySelectedException0 = new AlreadySelectedException((OptionGroup) null, (Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.AlreadySelectedException", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("x");
      OptionGroup optionGroup0 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup0);
  }
}
