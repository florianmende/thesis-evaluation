/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:26:45 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addOption("o", "' X){ll\"ChNo", false, "o");
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[0];
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("Boz]");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      defaultParser0.handleConcatenatedOptions("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-Wo";
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser(false);
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -Wo
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser(true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-o";
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.checkRequiredOptions();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-Wo";
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      try { 
        defaultParser0.parse(options0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -Wo
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse((Options) null, (String[]) null, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put(defaultParser0, defaultParser0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.DefaultParser cannot be cast to class java.lang.String (org.apache.commons.cli.DefaultParser is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @106e2774; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      defaultParser0.parse(options0, (String[]) null);
      try { 
        defaultParser0.handleConcatenatedOptions("-c");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -c
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.handleConcatenatedOptions("--' was specified but an option from this group has already been selected: '");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = new DefaultParser();
      Object object0 = new Object();
      List<Object> list0 = List.of(object0, object0, (Object) defaultParser_Builder0, object0);
      defaultParser0.expectedOpts = list0;
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required options: java.lang.Object@7c0eb7ab, java.lang.Object@7c0eb7ab, org.apache.commons.cli.DefaultParser$Builder@1, java.lang.Object@7c0eb7ab
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      // Undeclared exception!
      try { 
        defaultParser0.checkRequiredOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0, true);
      properties0.put(defaultParser0, commandLine0);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, (String[]) null, properties0, true);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.DefaultParser cannot be cast to class java.lang.String (org.apache.commons.cli.DefaultParser is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @106e2774; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("java.util.Properties", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      OptionGroup optionGroup0 = new OptionGroup();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[8];
      Option option0 = new Option("", true, "");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addRequiredOption("o", "o", true, "o");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "o";
      stringArray0[1] = "o";
      stringArray0[2] = "--o";
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      Option option0 = new Option("o", "MV", true, "_[(Z9O~%#.?0KUhH)");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
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
  public void test16()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[32];
      stringArray0[0] = "-org.apache.commons.cli.DefaultParser$1";
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("o", "t");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addRequiredOption("o", "o", true, "o");
      String[] stringArray0 = new String[17];
      stringArray0[0] = "-org.apache.commons.cli.DefaultParser$1";
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("o", "o", true, "o");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf(true);
      defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "--o";
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
  public void test19()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[32];
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("o", "t");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      // Undeclared exception!
      try { 
        defaultParser0.parse(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("o", "o", true, "o");
      DefaultParser defaultParser0 = new DefaultParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "--o";
      stringArray0[1] = "--o";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: o
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("o", true, "-o");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-o";
      stringArray0[1] = "-]='Ic|H6K@KY}l6V ";
      stringArray0[2] = "o";
      stringArray0[3] = "-o";
      stringArray0[4] = "o";
      CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "-='Ic|HK@KY}l6V ";
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -='Ic|HK@KY}l6V 
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "X96z`~!)-";
      stringArray0[1] = "-";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "org.apache.commons.cli.DefaultParser$1";
      stringArray0[1] = "--";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "-]='(c|H6K@KY}l6Vr";
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Options options0 = new Options();
      Option option0 = new Option("TaB", false, "-TaB");
      Options options1 = options0.addOption(option0);
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-TaB";
      CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-\"oa%smr=?xROA";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Options options0 = new Options();
      DefaultParser defaultParser0 = new DefaultParser();
      Properties properties0 = new Properties();
      properties0.put("tru", defaultParser0);
      String[] stringArray0 = new String[0];
      try { 
        defaultParser0.parse(options0, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Default option wasn't defined
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addOption("o", "org.apache.commons.cli.Option$Builder", true, "o");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "o";
      stringArray0[1] = "--o";
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
  public void test30()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[7];
      stringArray0[0] = ",0bxl";
      stringArray0[1] = "%q%p0Ri`P5Nv)";
      stringArray0[2] = "I";
      stringArray0[3] = "--bT+j=-}s*";
      try { 
        defaultParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --bT+j=-}s*
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addOption("o", "' X){ll\"ChNo", true, "o");
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[0];
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("To");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-h5JrgE}";
      CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("o", "o", true, "o");
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      Boolean boolean0 = Boolean.valueOf("o");
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setStripLeadingAndTrailingQuotes(boolean0);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "--o";
      stringArray0[2] = "--o";
      stringArray0[4] = "--o";
      stringArray0[6] = "o";
      Properties properties0 = new Properties();
      defaultParser0.parse(options0, stringArray0, properties0, false);
      defaultParser0.handleConcatenatedOptions("J$>YK[{xOGiJU*Gx8");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Options options0 = new Options();
      options0.addOption("o", "o", true, "o");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "o";
      stringArray0[1] = "o";
      stringArray0[2] = "--o";
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      defaultParser_Builder0.setAllowPartialMatching(false);
      DefaultParser defaultParser0 = defaultParser_Builder0.build();
      Properties properties0 = new Properties();
      // Undeclared exception!
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "o";
      stringArray0[1] = "o";
      stringArray0[2] = "--o";
      DefaultParser.Builder defaultParser_Builder0 = DefaultParser.builder();
      DefaultParser.Builder defaultParser_Builder1 = defaultParser_Builder0.setAllowPartialMatching(false);
      DefaultParser defaultParser0 = defaultParser_Builder1.build();
      Properties properties0 = new Properties();
      try { 
        defaultParser0.parse(options0, stringArray0, properties0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: --o
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      options0.addOption("o", "' X){ll\"ChNo", true, "o");
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[0];
      defaultParser0.parse(options0, stringArray0, properties0, true);
      defaultParser0.handleConcatenatedOptions("Boz]");
      defaultParser0.handleConcatenatedOptions("Boz]");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultParser defaultParser0 = new DefaultParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("o", "v!.kj+.w:!*MlqB`7", true, "-o");
      Properties properties0 = new Properties();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-o";
      stringArray0[1] = "-o";
      try { 
        defaultParser0.parse(options1, stringArray0, properties0, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option: o
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }
}