/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:27:39 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Option_ESTest extends Option_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.numberOfArgs((-1053));
      option_Builder1.longOpt("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals((-1053), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option option0 = new Option("", "jDc3WnI9+");
      option0.setArgs((-1002));
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("(6P(2E~=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      option0.setRequired(true);
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      option0.addValueForProcessing("1Kar)");
      option0.getValuesList();
      assertFalse(option0.hasLongOpt());
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.valueSeparator('6');
      Option option0 = option_Builder1.build();
      char char0 = option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertEquals('6', char0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option((String) null, " ]");
      option0.setValueSeparator('g');
      char char0 = option0.getValueSeparator();
      assertEquals('g', char0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option("", "b%23hjZ$,h@\"ixVQ~b");
      option0.getValue((String) null);
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertEquals("b%23hjZ$,h@\"ixVQ~b", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgs(2);
      option0.addValueForProcessing("hJK");
      option0.getValue(0);
      assertEquals(2, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.option("");
      option_Builder1.hasArg();
      Option option0 = option_Builder0.build();
      assertEquals(1, option0.getArgs());
      
      option0.addValueForProcessing("{c*18k]/<");
      String string0 = option0.getValue();
      assertFalse(option0.hasValueSeparator());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      option0.setType((Object) null);
      Object object0 = option0.getType();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      String string0 = option0.getOpt();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getOpt();
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt("C7\"n;mq+S,73P");
      Option option0 = option_Builder1.build();
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option option0 = new Option("", "", true, (String) null);
      String string0 = option0.getLongOpt();
      assertNotNull(string0);
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("WeTZ");
      Option option0 = option_Builder0.build();
      option0.getKey();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option option0 = new Option("", "b%23hjZ$,h@\"ixVQ~b");
      String string0 = option0.getKey();
      assertEquals("b%23hjZ$,h@\"ixVQ~b", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("w");
      Option.Builder option_Builder1 = option_Builder0.desc("w");
      Option option0 = option_Builder1.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getDescription();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.numberOfArgs(0);
      Option option0 = option_Builder0.build();
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option option0 = new Option("A", "A");
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.longOpt(">4");
      option_Builder1.argName(">4");
      Option option0 = option_Builder1.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      option0.setArgName("");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Option option0 = new Option("4", "4");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs((-2));
      option0.acceptsArg();
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.acceptsArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      // Undeclared exception!
      try { 
        option0.setType((Object) "NO_ARGS_ALLOWED");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.addValueForProcessing("");
      try { 
        option0.getValue((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("[ option: ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '[ option: ' contains an illegal character : '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.setValueSeparator('q');
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
  public void test31()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("-", true, "-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '-'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("@\"", "@\"", true, "@\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '@\"' contains an illegal character : '@'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("Either opt or longOpt must be specified", "Either opt or longOpt must be specified");
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
      Option option0 = new Option("a", "a");
      boolean boolean0 = option0.hasValueSeparator();
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = new Option("g", "g");
      option0.setValueSeparator(' ');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals(' ', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Ff");
      option_Builder0.hasArgs();
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option option0 = new Option((String) null, false, (String) null);
      boolean boolean0 = option0.hasArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.hasArg();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.hasArg();
      assertTrue(boolean0);
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.hasOptionalArg();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertNull(option0.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option option0 = new Option("4", "4");
      String string0 = option0.toString();
      assertEquals("[ option: 4  :: 4 :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option option0 = new Option("rbx", "rbx", true, "rbx");
      String string0 = option0.toString();
      assertEquals("[ option: rbx rbx  [ARG] :: rbx :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option option0 = new Option("w", "w");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("w");
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("w", "w");
      assertFalse(option0.hasArg());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.requiresArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Ff");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      option_Builder1.valueSeparator();
      Option option0 = option_Builder0.build();
      option0.addValueForProcessing("L=R%");
      assertTrue(option0.hasArg());
      assertEquals("L", option0.getValue());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option option0 = new Option("", "b%23hjZ$,h@\"ixVQ~b");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("");
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasLongOpt();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArg());
      
      option0.setArgs((-2));
      String string0 = option0.toString();
      assertEquals("[ option:  [ARG...] ::  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgs(1638);
      boolean boolean0 = option0.hasArgs();
      assertEquals(1638, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option option0 = new Option("w", "w");
      option0.setArgName("w");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option option0 = new Option("", "");
      String[] stringArray0 = option0.getValues();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option("", "");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs((-2));
      option0.addValueForProcessing("");
      option0.getValues();
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null, true, (String) null);
      option0.addValueForProcessing("1LRwycRG[2");
      String string0 = option0.getValue("+%P=DLd$>q!tn2zX_t");
      assertFalse(option0.hasValueSeparator());
      assertEquals("1LRwycRG[2", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option option0 = new Option("", false, "");
      String string0 = option0.getValue("");
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      option0.getValue((-1002));
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option option0 = new Option("", "");
      assertFalse(option0.hasArgs());
      
      option0.setArgs((-2));
      assertTrue(option0.hasArgs());
      
      option0.addValueForProcessing("");
      option0.getValue(0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Option option0 = new Option("", false, "");
      option0.getValue();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgs(1638);
      option0.addValueForProcessing("");
      option0.getValue();
      assertEquals(1638, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
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
  public void test66()  throws Throwable  {
      Option option0 = new Option("w", "w");
      Option option1 = new Option("", "w");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertFalse(option1.hasLongOpt());
      assertEquals("w", option1.getDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option option0 = new Option("", "");
      Option option1 = new Option("", "", true, "");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      boolean boolean0 = option0.equals((Object) null);
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Option option0 = new Option("4", "4");
      boolean boolean0 = option0.equals(option0);
      assertEquals((-1), option0.getArgs());
      assertTrue(boolean0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option0.equals(option1);
      assertNotSame(option1, option0);
      assertEquals((-1), option1.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Option option0 = new Option("w", "w");
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Option option0 = new Option("w", "w", true, "w");
      option0.addValueForProcessing("w");
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("w");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
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
  public void test77()  throws Throwable  {
      Option option0 = new Option("G", true, "l!46eJB pMK<98<Uv");
      String string0 = option0.getOpt();
      assertEquals("l!46eJB pMK<98<Uv", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      Class class0 = (Class)option0.getType();
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      // Undeclared exception!
      try { 
        option0.addValue((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.hashCode();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option option0 = new Option("", false, "");
      option0.isRequired();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("w");
      Option option0 = option_Builder0.build();
      option0.getDescription();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      int int0 = option0.getArgs();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      option0.setDescription("");
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.clearValues();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Ff");
      Option option0 = option_Builder0.build();
      int int0 = option0.getId();
      assertEquals((-1), option0.getArgs());
      assertEquals(70, int0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      option0.getValuesList();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setArgs(0);
      // Undeclared exception!
      try { 
        option0.addValueForProcessing("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setOptionalArg(true);
      option0.setArgs(0);
      option0.addValueForProcessing("");
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Option option0 = new Option("Ff", true, "Ff");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setValueSeparator('H');
      option0.addValueForProcessing("hHmsw`N{GA*-m2");
      assertEquals('H', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Option option0 = new Option("", false, "");
      option0.setType((Object) null);
      String string0 = option0.toString();
      assertEquals("[ option:   ::  ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Class<Object> class0 = Object.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required();
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.argName("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgName();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("Ff");
      option_Builder0.valueSeparator();
      Option option0 = option_Builder0.build();
      option0.setArgs(1459);
      option0.addValueForProcessing("L=R%");
      assertEquals(1459, option0.getArgs());
  }
}
