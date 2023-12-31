/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:46:43 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CommandLine_ESTest extends CommandLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("s", "z", true, "");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getOptionObject("- :Z:]Y:z");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      Option option1 = new Option((String) null, "c)9ls");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      CommandLine commandLine0 = new CommandLine();
      option0.setArgs((-2));
      option0.addValueForProcessing(" to desired type: ");
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      Properties properties0 = commandLine0.getOptionProperties("z");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      CommandLine commandLine0 = new CommandLine();
      option0.setArgs(1563);
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      option0.addValueForProcessing("\"");
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("z", "6", false, "s");
      Option option1 = new Option("z", "6", false, " :: ");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option1);
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option("3", "3", true, "3");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("3");
      Object object0 = commandLine0.getOptionObject("3");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("z", "z", false, "z");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption('z');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      Object object0 = commandLine0.getParsedOptionValue('z');
      assertEquals("z", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option("3", "3", true, "3");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("3");
      String[] stringArray0 = commandLine0.getOptionValues("3");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("y");
      String[] stringArray0 = commandLine0.getOptionValues('z');
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("");
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("@", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      String string0 = commandLine0.getOptionValue("z");
      assertEquals("z", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("", true, "");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("");
      String string0 = commandLine0.getOptionValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('-', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('w', "");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option("r", "r", true, "r");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      option0.addValueForProcessing("l4>pR}E");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue('r');
      assertEquals("l4>pR}E", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("", true, "");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("");
      String string0 = commandLine0.getOptionValue('-');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      Object object0 = commandLine0.getOptionObject("z");
      assertEquals("z", object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getOptionObject('z');
      assertEquals("z", object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("p^m3n^4]");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("p^m3n^4]");
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("p^m3n^4]"));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option("3", "3", true, "3");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("3");
      try { 
        commandLine0.getParsedOptionValue(option0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: 3
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Option option0 = new Option("@", "@", true, "@");
      Class<Option> class0 = Option.class;
      option0.setType(class0);
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("@");
      try { 
        commandLine0.getParsedOptionValue("@");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to handle the class: class org.apache.commons.cli.Option
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      try { 
        commandLine0.getParsedOptionValue('z');
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: z
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing((String) null);
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties(option0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      commandLine0.addOption(option0);
      // Undeclared exception!
      try { 
        commandLine0.getOptionProperties((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, ")M%^w CE;", false, ")M%^w CE;");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option option0 = new Option("3", "3", true, "3");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("3");
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertEquals("3", object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = new Option("3", "3", true, "3");
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((Option) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("FD", "FD", true, "FD");
      Option option1 = new Option("FD", true, "Emc. <YF|JsVC'{");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option1);
      CommandLine commandLine0 = commandLine_Builder1.build();
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option((String) null, "k3J&KW-&r", true, (String) null);
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "|<.A0c @^+U");
      assertEquals("|<.A0c @^+U", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("FD", "FD", true, "org.apache.commons.cli.PatternOptionBuilder");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      option0.addValueForProcessing("[ option: FD FD  [ARG] :: org.apache.commons.cli.PatternOptionBuilder :: class java.lang.String ]");
      String string0 = commandLine0.getOptionValue(option0, "Exception found converting ");
      assertEquals("[ option: FD FD  [ARG] :: org.apache.commons.cli.PatternOptionBuilder :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("z", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue((Option) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("a", "a");
      String string0 = commandLine0.getOptionValue(option0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getOptionObject((String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues("y");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option("@", "@", true, "@");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("@");
      String string0 = commandLine0.getOptionValue("@", "@");
      assertEquals("@", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option option0 = new Option("s", "t", true, "i");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("t");
      Object object0 = commandLine0.getParsedOptionValue("t");
      assertEquals("t", object0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option option0 = new Option("s", "t", true, "i");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getParsedOptionValue("t");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option option0 = new Option("s", "t", true, "i");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      option0.addValueForProcessing("t");
      Properties properties0 = commandLine0.getOptionProperties("t");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      CommandLine commandLine0 = new CommandLine();
      option0.setArgs((-2));
      option0.addValueForProcessing(" to desired type: ");
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("z");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("s", "t", true, "i");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("t");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("y");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      CommandLine commandLine0 = new CommandLine();
      option0.setArgs(1563);
      commandLine0.addOption(option0);
      option0.addValueForProcessing("z");
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", "");
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties((Option) null);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('-');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues('z');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getOptionObject('z');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('\"', "Exception found converting ");
      assertEquals("Exception found converting ", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      List<String> list0 = commandLine0.getArgList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('z');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue('E');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("z");
      assertNull(string0);
  }
}
