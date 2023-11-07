/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:51:18 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.List;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Options_ESTest extends Options_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("l;_n1ytp4tb", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'l;_n1ytp4tb' contains an illegal character : ';'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "gscOXxaOGoT}R-4p", true, (String) null);
      options0.addOption(option0);
      List<Option> list0 = options0.helpOptions();
      assertTrue(list0.contains(option0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, " `;*Mf1_pZHxi_WHnXO..+i7{");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      optionGroup0.setRequired(true);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertNotNull(optionGroup2);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options1.getOptionGroup(option0);
      assertNotNull(optionGroup2);
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption((String) null, (String) null, false, (String) null);
      Option option0 = options0.getOption((String) null);
      assertEquals((-1), option0.getArgs());
      assertNotNull(option0);
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null);
      option0.setLongOpt("]rn>Yr x|XNjZ");
      option0.setValueSeparator('o');
      Options options1 = options0.addOption(option0);
      Option option1 = options1.getOption("]rn>Yr x|XNjZ");
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("Gw", "Gw");
      option0.setLongOpt("]rn>Yr :SdX&jB");
      option0.setOptionalArg(true);
      options0.addOption(option0);
      Option option1 = options0.getOption("]rn>Yr :SdX&jB");
      assertTrue(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      Option option0 = options1.getOption((String) null);
      assertNotNull(option0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("Ge", "Ge");
      option0.setArgName(">U=1K:$i!");
      option0.setLongOpt("]rn>Yr :SdX&jB");
      options0.addOption(option0);
      Option option1 = options0.getOption("]rn>Yr :SdX&jB");
      assertTrue(option1.hasArgName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", "", true, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      Option option1 = options0.getOption("");
      assertFalse(option1.isRequired());
      assertNotNull(option1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.getOptionGroup((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("Ge", "Ge", true, "Ge");
      // Undeclared exception!
      try { 
        options1.getMatchingOptions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("#\"eH5Vsrot\"Fk2G", "nD_J]jTyO{2mW(9,", false, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '#\"eH5Vsrot\"Fk2G' contains an illegal character : '#'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOptionGroup((OptionGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption((Option) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Options", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("js2L?(8EO[I_ycX.x", true, "js2L?(8EO[I_ycX.x");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'js2L?(8EO[I_ycX.x' contains an illegal character : '?'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption(": Z+ATlRU %bDT*Y,", " ] [ long ", true, "--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ': Z+ATlRU %bDT*Y,' contains an illegal character : ':'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "gscOXxaOGoT}R-4p", true, (String) null);
      option0.setRequired(true);
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("P", "P");
      Options options1 = options0.addOption(option0);
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("Gw", "Q.XzDZ%}`KwjcD", true, "Gw");
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("Agp5", "", true, "");
      boolean boolean0 = options0.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", " `;*Mf1_pZHxi_WHnXO..+i7{", true, "");
      boolean boolean0 = options1.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("RCj", "RCj", true, "RCj");
      boolean boolean0 = options1.hasLongOption("RCj");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption(">U=1K:$i!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption("]rn>Yr :SdX&jB");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", " `;*Mf1_pZHxi_WHnXO..+i7{", true, "");
      List<String> list0 = options0.getMatchingOptions("[-  `;*Mf1_pZHxi_WHnXO..+i7{]");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, "gscOXxaOGoT}R-4p", true, (String) null);
      options0.addOption(option0);
      List<String> list0 = options0.getMatchingOptions("gscOXxaOGoT}R-4p");
      assertTrue(list0.contains("gscOXxaOGoT}R-4p"));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "gscOXxaOGoT}R-4p", true, "gscOXxaOGoT}R-4p");
      Option option0 = new Option((String) null, "gscOXxaOGoT}R-4p", true, (String) null);
      option0.setRequired(true);
      Options options2 = options1.addOption(option0);
      assertSame(options2, options1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", "", true, " `;*Mf1_pZHxi_WHnXO..+i7{");
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, (String) null);
      boolean boolean0 = options1.hasShortOption((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", " `;*Mf1_pZHxi_WHnXO..+i7{", true, "");
      List<String> list0 = options1.getMatchingOptions("");
      assertFalse(list0.isEmpty());
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption((String) null, true, "");
      assertSame(options0, options1);
  }
}