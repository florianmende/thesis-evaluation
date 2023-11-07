/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:39:09 GMT 2023
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
      Option option0 = new Option("", "", true, "");
      commandLine_Builder0.addOption(option0);
      Object object0 = commandLine0.getOptionObject("-=%5M!qZv;m(X");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("?", true, "cy}.Py.aY");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Option option1 = (Option)option0.clone();
      String string0 = commandLine0.getOptionValue(option1);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("?", "?", true, "?");
      option0.addValueForProcessing("?");
      option0.setArgs(4378);
      option0.addValueForProcessing("?");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("?");
      Properties properties0 = commandLine0.getOptionProperties("?");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("?", "?", true, "?");
      option0.addValueForProcessing("?");
      option0.setArgs(4367);
      option0.addValueForProcessing("Unable to parse the URL: ");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("Unable to parse the URL: ");
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("?", true, "cy}.Py.aY");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Option option1 = (Option)option0.clone();
      Properties properties0 = commandLine0.getOptionProperties(option1);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("n", "#", true, "#");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("n");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Class<Option> class0 = Option.class;
      option0.setType(class0);
      Object object0 = commandLine0.getOptionObject("#");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("", "n", true, "");
      commandLine_Builder0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption("n");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "", true, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('-');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "n", true, "");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("n");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue("");
      assertEquals("n", object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("&lrfq/[4");
      Object object0 = commandLine0.getParsedOptionValue('l');
      assertEquals("&lrfq/[4", object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("?", "?", true, "?");
      commandLine_Builder0.addOption(option0);
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(1, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("n", "#", true, "#5iL#\"2^%*2O");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("{_H.0b%Kz?#Xj:d");
      String[] stringArray0 = commandLine0.getOptionValues("n");
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("l");
      String[] stringArray0 = commandLine0.getOptionValues('l');
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("", true, "(IY8@`@|=,I|r^");
      String string0 = commandLine0.getOptionValue(option0, "?migz$");
      assertEquals("?migz$", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "n", true, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue("|i-i", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((String) null, "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("n", "#", true, "5iL#\"2^%*O");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("bZ_jb}2(sQ%+Lu*");
      String string0 = commandLine0.getOptionValue("n");
      assertEquals("bZ_jb}2(sQ%+Lu*", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("", true, "");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      String string0 = commandLine0.getOptionValue("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('i', (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue(')', "");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", true, "l");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("l");
      String string0 = commandLine0.getOptionValue('l');
      assertEquals("l", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("", "", true, "");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      String string0 = commandLine0.getOptionValue('-');
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("n", "#", true, "#5iL#\"2^%*2O");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("{_H.0b%Kz?#Xj:d");
      Object object0 = commandLine0.getOptionObject("#");
      assertEquals("{_H.0b%Kz?#Xj:d", object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addArg("");
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine0.addArg("wLDCI-wq{]oC");
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.contains("wLDCI-wq{]oC"));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = new Option("", true, "");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      option0.addValueForProcessing("");
      try { 
        commandLine0.getParsedOptionValue("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: 
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("n", "n", true, "n");
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
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
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "", true, "");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      Object object0 = commandLine0.getParsedOptionValue(option0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Object object0 = commandLine0.getParsedOptionValue((Option) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("l");
      String[] stringArray0 = commandLine0.getOptionValues(option0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("", "n", true, "");
      commandLine_Builder0.addOption(option0);
      Option option1 = new Option("n", false, "");
      String[] stringArray0 = commandLine0.getOptionValues(option1);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "n", true, "");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("");
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue(option0, "n");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "n", true, "");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("n");
      CommandLine commandLine0 = commandLine_Builder1.build();
      String string0 = commandLine0.getOptionValue(option0);
      assertEquals("n", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue((Option) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue("");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      String string0 = commandLine0.getOptionValue("m");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      boolean boolean0 = commandLine0.hasOption(option0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("", "", true, "");
      commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getOptionObject('-');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      String[] stringArray0 = commandLine0.getOptionValues((String) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option("o", "o", true, "o");
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("o");
      String string0 = commandLine0.getOptionValue("o", "o");
      assertEquals("o", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("l");
      Object object0 = commandLine0.getOptionObject('l');
      assertEquals("l", object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      String string0 = commandLine0.getOptionValue(option0, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("n", "#", true, "#");
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("n");
      CommandLine commandLine0 = commandLine_Builder0.build();
      Properties properties0 = commandLine0.getOptionProperties("#");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("?", "?", true, "?");
      option0.addValueForProcessing("?");
      option0.setArgs(4367);
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("?");
      Properties properties0 = commandLine0.getOptionProperties("?");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      Option option0 = new Option("n", "#", true, "#");
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addOption(option0);
      CommandLine commandLine0 = commandLine_Builder1.build();
      Properties properties0 = commandLine0.getOptionProperties("#");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("l", "l", true, "l");
      commandLine_Builder0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties("m");
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option option0 = new Option("?", "?", true, "?");
      option0.addValueForProcessing("?");
      option0.setArgs(4367);
      commandLine_Builder0.addOption(option0);
      option0.addValueForProcessing("?");
      Properties properties0 = commandLine0.getOptionProperties(option0);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      Option option0 = new Option((String) null, (String) null);
      commandLine0.addOption(option0);
      Properties properties0 = commandLine0.getOptionProperties((Option) null);
      assertNotNull(properties0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      commandLine0.addOption((Option) null);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine.Builder commandLine_Builder1 = commandLine_Builder0.addArg((String) null);
      assertSame(commandLine_Builder1, commandLine_Builder0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String[] stringArray0 = commandLine0.getArgs();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String string0 = commandLine0.getOptionValue('-');
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      String[] stringArray0 = commandLine0.getOptionValues('l');
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Option[] optionArray0 = commandLine0.getOptions();
      assertEquals(0, optionArray0.length);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      String string0 = commandLine0.getOptionValue('_', "4[O*9oN mQ 8vf");
      assertEquals("4[O*9oN mQ 8vf", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CommandLine commandLine0 = new CommandLine();
      List<String> list0 = commandLine0.getArgList();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Iterator<Option> iterator0 = commandLine0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      boolean boolean0 = commandLine0.hasOption('B');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CommandLine.Builder commandLine_Builder0 = new CommandLine.Builder();
      CommandLine commandLine0 = commandLine_Builder0.build();
      Object object0 = commandLine0.getParsedOptionValue('l');
      assertNull(object0);
  }
}