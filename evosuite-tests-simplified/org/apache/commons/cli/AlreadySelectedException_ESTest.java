/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 30 09:51:14 GMT 2023
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

public class AlreadySelectedException_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "syxy'yWg");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      optionGroup0.setRequired(true);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertTrue(optionGroup1.isRequired());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "oqYUQ}'po");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      OptionGroup optionGroup1 = alreadySelectedException0.getOptionGroup();
      assertFalse(optionGroup1.isRequired());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException("[- syxy'yWg]");
      Option option0 = alreadySelectedException0.getOption();
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("W$ydBC", "", true, "");
      option0.setRequired(true);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", false, "");
      option0.setValueSeparator('Z');
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasArg());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "oqYUQ}'po");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setOptionalArg(true);
      Option option1 = alreadySelectedException0.getOption();
      assertTrue(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("@", "@");
      option0.setArgName("' was specified but an option from this group has already been selected: '");
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("@", "@");
      option0.setArgs(0);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      Option option1 = alreadySelectedException0.getOption();
      assertFalse(option1.isRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null);
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException(optionGroup0, option0);
      option0.setArgs(61);
      Option option1 = alreadySelectedException0.getOption();
      assertEquals((-1), Option.UNINITIALIZED);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      AlreadySelectedException alreadySelectedException0 = new AlreadySelectedException((String) null);
      OptionGroup optionGroup0 = alreadySelectedException0.getOptionGroup();
      assertNull(optionGroup0);
  }
}
