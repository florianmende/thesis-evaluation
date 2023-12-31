/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:17:21 GMT 2023
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
      Option option0 = new Option("?", "5_A5,iqyj*;ADX&");
      optionGroup0.setSelected(option0);
      String string0 = optionGroup0.getSelected();
      assertEquals("?", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", true, "");
      optionGroup0.setSelected(option0);
      String string0 = optionGroup0.getSelected();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, true, (String) null);
      optionGroup0.setRequired(true);
      optionGroup0.addOption(option0);
      assertTrue(optionGroup0.isRequired());
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
      Option option0 = new Option("?", "}W8xz+;>GVN", true, "?");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Option option1 = new Option("LQ2ay", "");
      optionGroup1.addOption(option1);
      String string0 = optionGroup0.toString();
      assertEquals("[-? ?, -LQ2ay ]", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, true, (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      String string0 = optionGroup1.toString();
      assertEquals("[--null]", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("?", "}W8xz+;>GVN", true, "?");
      Option option1 = new Option("LQ2ay", "");
      optionGroup0.setSelected(option0);
      try { 
        optionGroup0.setSelected(option1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The option 'LQ2ay' was specified but an option from this group has already been selected: '?'
         //
         verifyException("org.apache.commons.cli.OptionGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setSelected((Option) null);
      assertNull(optionGroup0.getSelected());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("?", "}W8xz+;>GVN", true, "?");
      optionGroup0.setSelected(option0);
      optionGroup0.setSelected(option0);
      assertEquals("}W8xz+;>GVN", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      String string0 = optionGroup0.getSelected();
      assertNull(string0);
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
      boolean boolean0 = optionGroup0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionGroup optionGroup0 = new OptionGroup();
      boolean boolean0 = optionGroup0.isRequired();
      assertFalse(boolean0);
  }
}
