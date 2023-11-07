/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:19:05 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OptionGroup_ESTest extends OptionGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      boolean boolean0 = optionGroup0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("J", "J", true, "J");
      optionGroup0.setSelected(option0);
      String string0 = optionGroup0.getSelected();
      assertEquals("J", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      optionGroup0.setSelected(option0);
      String string0 = optionGroup0.getSelected();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      // Undeclared exception!
      try { 
        optionGroup0.addOption((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.OptionGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Collection<Option> collection0 = optionGroup0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      String string0 = optionGroup0.getSelected();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("XFT8S", (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Option option1 = new Option("", true, "(D%[;mdmdNpT-W&a");
      optionGroup1.addOption(option1);
      String string0 = optionGroup0.toString();
      assertEquals("[-XFT8S, - (D%[;mdmdNpT-W&a]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, "#1I[f QG$");
      optionGroup0.addOption(option0);
      String string0 = optionGroup0.toString();
      assertEquals("[--null #1I[f QG$]", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "");
      optionGroup0.setSelected(option0);
      optionGroup0.setSelected(option0);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setSelected((Option) null);
      assertFalse(optionGroup0.isRequired());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option option0 = new Option("NO_ARGQSALLOWED", "NO_ARGQSALLOWED");
      Option option1 = new Option("NO_ARGQSALLOWAD", "NO_ARGQSALLOWED");
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setSelected(option0);
      try { 
        optionGroup0.setSelected(option1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The option 'NO_ARGQSALLOWAD' was specified but an option from this group has already been selected: 'NO_ARGQSALLOWED'
         //
         verifyException("org.apache.commons.cli.OptionGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Collection<String> collection0 = optionGroup0.getNames();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option("", true, (String) null);
      optionGroup0.addOption(option0);
      assertTrue(optionGroup0.isRequired());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      boolean boolean0 = optionGroup0.isRequired();
      assertFalse(boolean0);
  }
}