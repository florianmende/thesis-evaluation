/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 30 09:48:02 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.setArgs((-1497));
      boolean boolean0 = option0.requiresArg();
      assertFalse(option0.hasArg());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option option0 = new Option("T", "T", true, "");
      option0.setArgs(45);
      option0.setValueSeparator('O');
      option0.addValueForProcessing("org.apache.commons.cli.Option$1");
      assertEquals('O', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.setArgs((-1739));
      option0.toString();
      assertEquals((-1739), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("4d");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('b');
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.required(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.required();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("L");
      option_Builder1.optionalArg(true);
      Option option0 = option_Builder0.build();
      option0.hasOptionalArg();
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option("T", "T", true, "");
      option0.addValueForProcessing("T");
      option0.getValuesList();
      assertEquals("", option0.getDescription());
      assertEquals("T", option0.getLongOpt());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("B", true, "B");
      option0.setValueSeparator('7');
      char char0 = option0.getValueSeparator();
      assertEquals('7', char0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option option0 = new Option("", "", true, "4;B!IJinc;");
      option0.setValueSeparator('s');
      char char0 = option0.getValueSeparator();
      assertEquals('s', char0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option("", false, "");
      String string0 = option0.getValue("");
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String string0 = option0.getValue(0);
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setType((Object) null);
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option("Rw5Mu", true, "Rw5Mu");
      option0.getOpt();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option option0 = new Option("", false, "");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getLongOpt();
      assertNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option("", "6kJ.3BmNpjB}b}O", true, "");
      assertEquals("6kJ.3BmNpjB}b}O", option0.getLongOpt());
      
      option0.setLongOpt("");
      option0.getLongOpt();
      assertEquals("", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option((String) null, true, "COVr,}yY");
      String string0 = option0.getKey();
      assertNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Rw5Mu");
      Option option0 = option_Builder0.build();
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option option0 = new Option("", false, "\"");
      option0.getKey();
      assertEquals("\"", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option("i", "i");
      option0.getId();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      String string0 = option0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("", "6`1s", true, "6`1s");
      String string0 = option0.getDescription();
      assertEquals("6`1s", string0);
      assertEquals("6`1s", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("4");
      option_Builder0.numberOfArgs(0);
      Option option0 = option_Builder0.build();
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      int int0 = option0.getArgs();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      option_Builder0.argName("T");
      Option option0 = option_Builder0.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder0.argName("");
      Option option0 = option_Builder1.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.acceptsArg();
      assertTrue(option0.hasOptionalArg());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      boolean boolean0 = option0.acceptsArg();
      assertFalse(boolean0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.setType((Object) "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option option0 = new Option("i", true, "i");
      option0.addValueForProcessing("i");
      try { 
        option0.getValue((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("Either opt or longOpt must be specified");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Either opt or longOpt must be specified' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setValueSeparator('@');
      // Undeclared exception!
      try { 
        option0.addValueForProcessing((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option(" ", false, " ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("`: ", "`: ", false, "`: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '`: ' contains an illegal character : '`'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("JYY~u_1(5bxY_Md[t=C", "JYY~u_1(5bxY_Md[t=C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'JYY~u_1(5bxY_Md[t=C' contains an illegal character : '~'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option option0 = new Option("i", "i");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setValueSeparator('.');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('.', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("");
      option_Builder1.numberOfArgs(3475);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
      assertEquals(3475, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("", "TF;gJm>??N2R", true, "6`1s");
      boolean boolean0 = option0.hasArgs();
      assertEquals("6`1s", option0.getDescription());
      assertFalse(boolean0);
      assertEquals("TF;gJm>??N2R", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option option0 = new Option("", false, "\"");
      boolean boolean0 = option0.hasArg();
      assertEquals("\"", option0.getDescription());
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option("", "", true, (String) null);
      option0.hasArg();
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option option0 = new Option("", "TF;gJm>??N2R", true, "6`1s");
      option0.hasOptionalArg();
      assertEquals("6`1s", option0.getDescription());
      assertEquals("TF;gJm>??N2R", option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("", " >\t");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertEquals(" >\t", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option("B", true, "B");
      String string0 = option0.toString();
      assertEquals("[ option: B  [ARG] :: B :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertTrue(option0.hasArg());
      assertFalse(option0.hasValueSeparator());
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("L");
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals(1, option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option option0 = new Option("P", "P", true, "P");
      option0.setValueSeparator('P');
      option0.addValueForProcessing("P");
      assertEquals('P', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("", "", true, (String) null);
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option("", true, (String) null);
      boolean boolean0 = option0.hasLongOpt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option("", false, "");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArgs();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option option0 = new Option("", " >\t");
      String[] stringArray0 = option0.getValues();
      assertEquals(" >\t", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      String[] stringArray0 = option0.getValues();
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
      assertNotNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option option0 = new Option("z", "z", true, "z");
      option0.addValueForProcessing("z");
      option0.getValue("z");
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option option0 = new Option("", " >\t");
      option0.getValue((-1619));
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals(" >\t", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option("i", true, "i");
      option0.addValueForProcessing("i");
      String string0 = option0.getValue(0);
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getValue();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Option option0 = new Option("4d", true, "4d");
      option0.addValueForProcessing("");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Option option0 = new Option("", "", true, "<)'+{");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Option option0 = new Option("z", "z");
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option0.equals(option1);
      assertTrue(boolean0);
      assertEquals((-1), option1.getArgs());
      assertFalse(option1.hasLongOpt());
      assertNotSame(option1, option0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Option option0 = new Option("", "");
      Option option1 = new Option("", "", false, "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(boolean0);
      assertEquals((-1), option1.getArgs());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option option0 = new Option("i", "i");
      Option option1 = new Option("", "");
      boolean boolean0 = option0.equals(option1);
      assertFalse(option1.hasLongOpt());
      assertEquals((-1), option1.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option option0 = new Option("z", "z");
      boolean boolean0 = option0.equals(option0);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      // Undeclared exception!
      try { 
        option0.addValueForProcessing((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Option option0 = new Option("i", true, "i");
      assertTrue(option0.hasArg());
      
      option0.addValueForProcessing("i");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.optionalArg(true);
      option_Builder0.numberOfArgs(0);
      Option option0 = option_Builder0.build();
      assertTrue(option0.hasOptionalArg());
      
      option0.addValueForProcessing("D^7WFWE");
      assertFalse(option0.hasArg());
      assertFalse(option0.hasArgs());
      assertEquals(0, option0.getArgs());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      // Undeclared exception!
      try { 
        option_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Either opt or longOpt must be specified
         //
         verifyException("org.apache.commons.cli.Option$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("jHjBmC@`Axx_eJ");
      Option option0 = option_Builder0.build();
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Option option0 = new Option("", " >\t");
      Object object0 = option0.getType();
      boolean boolean0 = option0.equals(object0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
      assertEquals(" >\t", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Option option0 = new Option("", "", true, "4;B!IJinc;");
      // Undeclared exception!
      try { 
        option0.addValue("+`");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option("", "TF;gJm>??N2R", true, "6`1s");
      String string0 = option0.getLongOpt();
      assertEquals("6`1s", option0.getDescription());
      assertTrue(option0.hasArg());
      assertEquals("TF;gJm>??N2R", string0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option("J", "J");
      option0.hashCode();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.getDescription();
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("4");
      Option option0 = option_Builder0.build();
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option option0 = new Option("", " >\t");
      option0.clearValues();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals(" >\t", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.numberOfArgs(0);
      Option option0 = option_Builder0.build();
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("D^7WFWE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Option option0 = new Option("", " >\t");
      assertEquals(" >\t", option0.getDescription());
      
      option0.setDescription((String) null);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Option option0 = new Option("", " >\t");
      option0.setArgName(" >\t");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Option option0 = new Option("T", "T", true, "");
      option0.getValuesList();
      assertEquals("T", option0.getLongOpt());
      assertEquals("T", option0.getOpt());
      assertEquals("", option0.getDescription());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Option option0 = new Option("T", "T", true, "");
      option0.setArgs(45);
      option0.toString();
      assertEquals(45, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setRequired(false);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Option option0 = new Option("z", "z");
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setType((Object) null);
      String string0 = option0.toString();
      assertEquals("[ option: null  :: null ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Class<Object> class0 = Object.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      option0.setValueSeparator('e');
      option0.addValueForProcessing("f0,[oz/{U0;JJe");
      assertEquals('e', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArg();
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.desc("");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.argName("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder0, option_Builder1);
  }
}
