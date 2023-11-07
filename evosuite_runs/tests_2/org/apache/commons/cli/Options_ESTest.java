/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:10:19 GMT 2023
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
      Options options1 = options0.addOption("rFkCOO", "");
      assertSame(options0, options1);
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
      options0.addRequiredOption("", "", false, " :: ");
      List<Option> list0 = options0.helpOptions();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      optionGroup1.setRequired(true);
      Options options1 = options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options1.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", true, "v7M~P<clH:So E");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      OptionGroup optionGroup2 = options0.getOptionGroup(option0);
      assertFalse(option0.isRequired());
      assertNotNull(optionGroup2);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", false, "");
      OptionGroup optionGroup0 = new OptionGroup();
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      option0.setArgName("`,u.O!<+Z");
      options0.addOptionGroup(optionGroup1);
      Option option1 = options0.getOption("");
      assertFalse(option1.isRequired());
      assertNotNull(option1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("n", "n", true, "n");
      Option option0 = options0.getOption("n");
      assertTrue(option0.isRequired());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", false, "");
      assertSame(options0, options1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, "-B_", true, "-B_");
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
  public void test10()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addRequiredOption("[ Options: [ short java.util.LinkedHashMap@0000000002 ] [ long {} ]", "[ Options: [ short java.util.LinkedHashMap@0000000002 ] [ long {} ]", false, "[ Options: [ short java.util.LinkedHashMap@0000000002 ] [ long {} ]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '[ Options: [ short java.util.LinkedHashMap@0000000002 ] [ long {} ]' contains an illegal character : '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("(a2`KKYOH ]", "(a2`KKYOH ]", false, "(a2`KKYOH ]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '(a2`KKYOH ]' contains an illegal character : '('
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption("EYPMJx8{s{11Y)EjPM&\"p(gAN+l.\"x+/5+", "EYPMJx8{s{11Y)EjPM&\"p(gAN+l.\"x+/5+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'EYPMJx8{s{11Y)EjPM&\"p(gAN+l.\"x+/5+' contains an illegal character : '{'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", false, "");
      Option option0 = options0.getOption("");
      Options options1 = new Options();
      options1.addOption(option0);
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("", false, "");
      Options options1 = options0.addOption(option0);
      assertSame(options1, options0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "");
      boolean boolean0 = options1.hasShortOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasShortOption("q-2@!*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasOption("W.j^");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("3", "3", false, "3");
      boolean boolean0 = options0.hasLongOption("3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      boolean boolean0 = options0.hasLongOption("q-2@!*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = options0.getOption(" -?o:");
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("wzP", "X} M}", true, "wzP");
      List<String> list0 = options0.getMatchingOptions("wzP");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "W.r[j^", false, "W.r[j^");
      List<String> list0 = options1.getMatchingOptions("");
      assertTrue(list0.contains("W.r[j^"));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", true, "");
      List<String> list0 = options0.getMatchingOptions("");
      assertTrue(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", false, "");
      Option option0 = options0.getOption("");
      options0.addOption(option0);
      assertTrue(option0.isRequired());
      assertFalse(option0.hasArg());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      Collection<OptionGroup> collection0 = options0.getOptionGroups();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      OptionGroup optionGroup0 = options0.getOptionGroup(option0);
      assertNull(optionGroup0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      String string0 = options0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Options options0 = new Options();
      List list0 = options0.getRequiredOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Options options0 = new Options();
      Collection<Option> collection0 = options0.getOptions();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", "");
      boolean boolean0 = options0.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "W.j^", false, "W.j^");
      boolean boolean0 = options1.hasOption("W.j^");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      // Undeclared exception!
      try { 
        options0.addOption(" SVGohUg3CPgK-!<qeJGl/i+,PRKj ,O7zJGl/i+,PRKj ,O7z", false, " SVGohUg3CPgK-!<qeJGl/i+,PRKj ,O7zJGl/i+,PRKj ,O7z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option ' SVGohUg3CPgK-!<qeJGl/i+,PRKj ,O7zJGl/i+,PRKj ,O7z' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }
}