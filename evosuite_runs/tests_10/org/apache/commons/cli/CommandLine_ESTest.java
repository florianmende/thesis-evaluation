/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:19:27 GMT 2023
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
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option((String) null, "true");
      commandLine_Builder0.addOption(option0);
      Option option1 = new Option((String) null, false, "~iSJ");
      Object object0 = commandLine0.getParsedOptionValue(option1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("3Q", "3Q");
      option0.setArgs((-2));
      option0.addValueForProcessing("3Q");
      commandLine0.addOption(option0);
      option0.addValueForProcessing("3Q");
      option0.addValueForProcessing("3Q");
      Properties properties0 = commandLine0.getOptionProperties("3Q");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs(940);
      option0.addValueForProcessing("$%BjP~*0U,ADH;JS4&");
      commandLine0.addOption(option0);
      option0.addValueForProcessing("w 7c;68");
      option0.addValueForProcessing(">kWm|Yopp");
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", "");
      commandLine0.addOption(option0);
      Option option1 = new Option("", true, "Z");
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs((-2));
      Class<Option> class0 = Option.class;
      option0.setType(class0);
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getOptionObject("N");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", false, "-");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option("N", "C<Ug\"XwHc|3QmIU");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      boolean boolean0 = commandLine0.hasOption('N');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs((-2));
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getParsedOptionValue('N');
      assertEquals("N", object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", false, "N");
      commandLine0.addOption(option0);
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues("");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("M", "$i1=_Ykq9XQzzPOj<`", true, "$i1=_Ykq9XQzzPOj<`");
      option0.addValueForProcessing((String) null);
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues('M');
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, "U<6rD\"q:}", false, (String) null);
      String string0 = commandLine0.getOptionValue(option0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("true", true, "~iSJ");
      String string0 = commandLine0.getOptionValue(option0, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setArgs(63);
      option0.addValueForProcessing("");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "'");
      option0.setArgs((-2));
      option0.addValueForProcessing("4/\"Z%%|C-");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("N");
      assertEquals("4/\"Z%%|C-", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", false, "");
      option0.setArgs((-2));
      option0.addValueForProcessing("");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('q', "\"}*9~X;vJ\"n%H");
      assertNotNull(string0);
      assertEquals("\"}*9~X;vJ\"n%H", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("e", true, "e");
      option0.addValueForProcessing("e");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue('e');
      assertEquals("e", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue('-');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs((-2));
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getOptionObject("N");
      assertEquals("N", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs((-2));
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      option0.setLongOpt("");
      Object object0 = commandLine0.getOptionObject('-');
      assertEquals("N", object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg("Unable to parse the URL: ");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      commandLine_Builder0.addArg("-6|cJ");
      CommandLine commandLine0 = commandLine_Builder0.build();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("-6|cJ"));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", false, "org.apache.commons.cli.CommandLine");
      option0.setArgs(1990);
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      Class<Option> class0 = Option.class;
      option0.setType(class0);
      try { 
        commandLine0.getParsedOptionValue(option0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to handle the class: class org.apache.commons.cli.Option
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, true, (String) null);
      option0.addValueForProcessing((String) null);
      commandLine0.addOption(option0);
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("", true, "");
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "'");
      option0.setArgs((-2));
      option0.addValueForProcessing("4/\"Z%%|C-");
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertEquals("4/\"Z%%|C-", object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((Option) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, true, (String) null);
      option0.addValueForProcessing((String) null);
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", true, "org.apache.commons.cli.CommandLine");
      commandLine0.addOption(option0);
      Option option1 = new Option("M", "$i1=_Ykq9XQzzPOj<`", true, "$i1=_Ykq9XQzzPOj<`");
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", false, "-");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "eL%ZVm");
      assertEquals("eL%ZVm", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "'");
      option0.setArgs((-2));
      option0.addValueForProcessing("4/\"Z%%|C-");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue(option0, " to desired type: ");
      assertEquals("4/\"Z%%|C-", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs((-2));
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", false, "-");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption("N");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      commandLine0.addOption(option0);
      option0.setLongOpt("");
      Object object0 = commandLine0.getOptionObject('-');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((String) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", true, "org.apache.commons.cli.CommandLine");
      commandLine0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs((-2));
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      Object object0 = commandLine0.getParsedOptionValue("N");
      assertEquals("N", object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", true, "org.apache.commons.cli.CommandLine");
      commandLine0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues("org.apache.commons.cli.CommandLine");
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", true, "N");
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      String string0 = commandLine0.getOptionValue("N", "N");
      assertEquals("N", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", false, "N");
      option0.setArgs(1829);
      option0.addValueForProcessing("N");
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("N");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("3Q", "3Q");
      option0.setArgs((-2));
      option0.addValueForProcessing("3Q");
      commandLine0.addOption(option0);
      option0.addValueForProcessing("3Q");
      Properties properties0 = commandLine0.getOptionProperties("3Q");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "e", true, "e");
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("e");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", "N", true, "org.apache.commons.cli.CommandLine");
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("M");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("N", false, "N");
      option0.setArgs(940);
      option0.addValueForProcessing("$%BjP~*0U,ADH;JS4&");
      commandLine0.addOption(option0);
      option0.addValueForProcessing("w 7c;68");
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option("psjAq0xk", "psjAq0xk");
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties((Option) null);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addArg((String) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('0', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('e');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getOptionValues('M');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue(' ', "");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      List<String> list0 = commandLine0.getArgList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      boolean boolean0 = commandLine0.hasOption('k');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue('\'');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue("#W,Iq.Io1@%A");
      assertNull(string0);
  }
}