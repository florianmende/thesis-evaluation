/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:16:03 GMT 2023
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
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("lcU(7vT8M!pKiV,;v");
      OptionGroup optionGroup0 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option((String) null, "'");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup1, optionGroup0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setRequired(true);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setValueSeparator('q');
      Option option1 = alreadySelectedException0.getOption();
      assertEquals('q', option1.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setOptionalArg(true);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      String string0 = optionGroup0.toString();
      Option option0 = new Option("", string0, false, "'");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertEquals("", option1.getOpt());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgs(2);
      Option option1 = alreadySelectedException0.getOption();
      assertNull(option1.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, "'");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgName("The option 'null' was specified but an option from this group has already been selected: 'null'");
      Option option1 = alreadySelectedException0.getOption();
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("U", "U");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertEquals(85, option1.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", true, "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgs(0);
      Option option1 = alreadySelectedException0.getOption();
      assertSame(option0, option1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      AlreadySelectedException alreadySelectedException0 = null;
      try {
        alreadySelectedException0 = new AlreadySelectedException(optionGroup0, (Option) null);
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
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertSame(optionGroup1, optionGroup0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("lcU(7vT8M!pKiV,;v");
      Option option0 = alreadySelectedException0.getOption();
      assertNull(option0);
  }
}