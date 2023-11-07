/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:52:35 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("Ib", "Ib", true, "Ib");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-Ib";
      stringArray0[1] = "--org.apache.commons.cli.MissingArgumentException";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--1";
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.checkRequiredOptions();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("II", "II", false, "II");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--=";
      options1.addRequiredOption("II", "--=", false, "--=");
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'II', '--=')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption((String) null, (String) null, true, (String) null);
      String[] stringArray0 = new String[0];
      try { 
        defaultParser0.parse(options1, stringArray0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: null
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption((String) null, "Ib", true, (String) null);
      options0.addOption((String) null, "f))uYsb", false, "\"");
      String[] stringArray0 = new String[4];
      stringArray0[0] = ")~zG=l#";
      stringArray0[1] = "--=";
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'Ib', 'f))uYsb')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(defaultParser0, object0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("II", "II", true, "II");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--=";
      options1.addRequiredOption("II", "--=", true, "--=");
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'II', '--=')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      Object object0 = new Object();
      properties0.put(object0, object0);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[0];
      defaultParser0.parse(options0, stringArray0, false);
      try { 
        defaultParser0.handleConcatenatedOptions("-Illegal option name '");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -Illegal option name '
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.handleConcatenatedOptions("' contains an illegal character : '");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0, false);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "", true, "");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      Properties properties0 = new Properties(674);
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option("", true, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options2 = options1.addOptionGroup(optionGroup1);
      try { 
        defaultParser0.parse(options2, stringArray0, properties0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "", true, "");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      Properties properties0 = new Properties(674);
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", true, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options2 = options1.addOptionGroup(optionGroup1);
      try { 
        defaultParser0.parse(options2, stringArray0, properties0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("Ib", "Ib", true, "Ib");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Ib";
      stringArray0[1] = "--Ib";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("Ib", "Ib", true, "Ib");
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--Ib";
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf(false);
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("", "", true, " ] [ long ");
      Properties properties0 = new Properties();
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.TRUE;
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      String[] stringArray0 = new String[4];
      stringArray0[0] = " ] [ long ";
      stringArray0[1] = "";
      stringArray0[2] = "--=";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", true, " ] [ long ");
      Properties properties0 = new Properties();
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.FALSE;
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "--=";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[1];
      Properties properties0 = new Properties(674);
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("", true, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0, properties0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("Ib", "Ib", true, "Ib");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[9];
      stringArray0[0] = ")G=l#";
      stringArray0[1] = "Ib";
      stringArray0[2] = "--Ib";
      stringArray0[3] = "---=";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("Ib", "Ib", true, "Ib");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[12];
      stringArray0[0] = "--=";
      stringArray0[2] = "--=";
      stringArray0[1] = "--Ib";
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: Ib
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("Ib", "Ib", true, "Ib");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Ib";
      stringArray0[1] = "--Ib";
      stringArray0[2] = "-";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("I", "I", true, "I");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-Ib";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("Ib", "Ib", true, "Ib");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-Ib";
      stringArray0[1] = "Ib";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("X", "-X=tZg\"g", false, "dn&k&+An=E`EHee");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-X=tZg\"g";
      DefaultParser defaultParser0 = new DefaultParser();
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -X=tZg\"g
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("X", "-X=tZg\"g", true, "dn&k&+An=E`EHee");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-X=tZg\"g";
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-=t_Zg\"J$Lg";
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -=t_Zg\"J$Lg
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("I", "I", false, "I");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-I";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(false);
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-F";
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -F
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.setProperty("-", "-");
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Default option wasn't defined
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("Ib", "Ib", true, "Ib");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--I";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("o", "o", false, "o");
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "org.apache.commons.cli.DefaultParser$Builder";
      stringArray0[1] = " ] [ long ";
      stringArray0[2] = " ] [ long ";
      stringArray0[3] = " ] [ long ";
      stringArray0[4] = "--=";
      try { 
        defaultParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --=
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("ETs", "ETs", false, "ETs");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      Options options2 = options1.addRequiredOption("ETs", "--=", false, "--=");
      try { 
        defaultParser0.parse(options2, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Ambiguous option: '--'  (could be: 'ETs', '--=')
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, "");
      DefaultParser defaultParser0 = new DefaultParser(false);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      defaultParser0.parse(options1, stringArray0, false);
      defaultParser0.handleConcatenatedOptions("--");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("", "");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("--=");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      defaultParser0.handleConcatenatedOptions("");
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Options options0 = new Options();
      Options options1 = options0.addOption("", "Ib", true, "");
      DefaultParser defaultParser0 = new DefaultParser(false);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-Ib";
      try { 
        defaultParser0.parse(options1, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[17];
      stringArray0[0] = "-+'C9~{A0*@D#u";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Options options0 = new Options();
      options0.addRequiredOption("", "", true, "");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "--=";
      defaultParser0.parse(options0, stringArray0, true);
      defaultParser0.handleConcatenatedOptions("--=");
      defaultParser0.handleConcatenatedOptions("--=");
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setAllowPartialMatching(true);
      assertSame(defaultParser_Builder0, defaultParser_Builder1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("Ib", "~-", true, "Ib");
      DefaultParser defaultParser0 = new DefaultParser(true);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-Ib";
      stringArray0[1] = "-Ib";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: Ib
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-X=t_Zg\"J$Lg";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[17];
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      LinkedList<OptionGroup> linkedList0 = new LinkedList<OptionGroup>();
      OptionGroup optionGroup0 = new OptionGroup();
      linkedList0.add(optionGroup0);
      defaultParser0.expectedOpts = (List) linkedList0;
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option: []
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}
