/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:40:50 GMT 2023
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
      Option option0 = new Option("NOiARGS6ALNO$QED", true, "NOiARGS6ALNO$QED");
      option0.setArgs(1405);
      option0.setValueSeparator('i');
      option0.addValueForProcessing("NOiARGS6ALNO$QED");
      assertTrue(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setArgs((-2421));
      boolean boolean0 = option0.requiresArg();
      assertEquals((-2421), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.required(true);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option option0 = new Option("7Ej", "7Ej", true, "7Ej");
      option0.setOptionalArg(true);
      boolean boolean0 = option0.hasOptionalArg();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      option_Builder0.option("");
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      option0.getValuesList();
      assertTrue(option0.hasArgs());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setValueSeparator('4');
      char char0 = option0.getValueSeparator();
      assertEquals('4', char0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Option option0 = new Option("?", true, "?");
      option0.setValueSeparator('C');
      char char0 = option0.getValueSeparator();
      assertEquals('C', char0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      option0.getValue((String) null);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLWED", "NO_ARGS_ALLWED", true, "NO_ARGS_ALLWED");
      option0.addValueForProcessing("NO_ARGS_ALLWED");
      String string0 = option0.getValue(0);
      assertEquals("NO_ARGS_ALLWED", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("");
      String string0 = option0.getValue(0);
      assertNotNull(string0);
      assertTrue(option0.hasArg());
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.setType((Object) null);
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Option option0 = new Option((String) null, " [ARG]", false, " [ARG]");
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Option option0 = new Option("ug_ef", "'", false, "'");
      option0.getOpt();
      assertEquals("'", option0.getDescription());
      assertEquals("'", option0.getLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Option option0 = new Option("", true, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("Kjn%&*I]#");
      option0.getLongOpt();
      assertEquals("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Option option0 = new Option("", "", false, "");
      option0.getLongOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Option option0 = new Option((String) null, "Illegal option name '");
      String string0 = option0.getKey();
      assertNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Option option0 = new Option("p3", true, "");
      String string0 = option0.getKey();
      assertEquals("", option0.getDescription());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      String string0 = option0.getKey();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Option option0 = new Option("", (String) null);
      String string0 = option0.getDescription();
      assertFalse(option0.hasLongOpt());
      assertNull(string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Option option0 = new Option("", "org.apache.commons.cli.Option", true, "s");
      String string0 = option0.getDescription();
      assertEquals("org.apache.commons.cli.Option", option0.getLongOpt());
      assertEquals("s", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs(0);
      int int0 = option0.getArgs();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.numberOfArgs(121);
      option_Builder0.longOpt("");
      Option option0 = option_Builder0.build();
      int int0 = option0.getArgs();
      assertEquals(121, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setArgName("HIRhj#]");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Option option0 = new Option("P", "P");
      option0.setOptionalArg(true);
      option0.acceptsArg();
      assertFalse(option0.hasArg());
      assertFalse(option0.hasArgs());
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      Option option0 = new Option("", "");
      // Undeclared exception!
      try { 
        option0.getId();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        Option.builder("[ARG...]");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '[ARG...]' contains an illegal character : '['
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Option option0 = new Option((String) null, true, (String) null);
      option0.setValueSeparator('i');
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
  public void test28()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("F{#", true, "F{#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'F{#' contains an illegal character : '{'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("' contains an illegal character : '", "' contains an illegal character : '", false, "' contains an illegal character : '");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '' contains an illegal character : '' contains an illegal character : '''
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Option option0 = null;
      try {
        option0 = new Option("\"", "\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '\"'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.hasValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setValueSeparator('-');
      boolean boolean0 = option0.hasValueSeparator();
      assertEquals('-', option0.getValueSeparator());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Option option0 = new Option("NOiSARGS6ALlO$QEd", "NOiSARGS6ALlO$QEd", true, "NOiSARGS6ALlO$QEd");
      option0.setArgs(3445);
      boolean boolean0 = option0.hasArgs();
      assertEquals(3445, option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.longOpt("M>l9EYO|/? ");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgs();
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Option option0 = new Option("", "");
      boolean boolean0 = option0.hasArg();
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.hasArg();
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Option option0 = new Option("ug_ef", "'", false, "'");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArg();
      assertTrue(option0.hasArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      Option option0 = option_Builder0.build();
      option0.getValue();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValueSeparator();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Option option0 = new Option("7Ej", "7Ej", true, "7Ej");
      boolean boolean0 = option0.hasOptionalArg();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Option option0 = new Option("OD", false, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      Class<Object> class0 = Object.class;
      option0.setType(class0);
      assertEquals("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      String string0 = option0.toString();
      assertEquals("[ option: null  :: null :: class java.lang.String ]", string0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Option option0 = new Option("", true, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("Kjn%&*I]#");
      String string0 = option0.toString();
      assertEquals("[ option:  Kjn%&*I]#  [ARG] :: The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead.  :: class java.lang.String ]", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("");
      boolean boolean0 = option0.requiresArg();
      assertTrue(option0.hasArg());
      assertTrue(option0.hasArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.option("");
      option_Builder0.optionalArg(true);
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertEquals(1, option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.requiresArg();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setValueSeparator('H');
      option0.addValueForProcessing("aTHek5.aI<b_B'");
      assertEquals('H', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("NO_ARGS_ALLOWED");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      option_Builder1.valueSeparator('K');
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("o2KK");
      assertEquals("o2", option0.getValue());
      assertTrue(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Option option0 = new Option((String) null, "rb]xYVWX");
      assertFalse(option0.hasLongOpt());
      
      option0.setLongOpt("U.CuAjHrcusns@t");
      boolean boolean0 = option0.hasLongOpt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Option option0 = new Option("", "|Ihu2Hi1])cCN{~");
      boolean boolean0 = option0.hasLongOpt();
      assertEquals("|Ihu2Hi1])cCN{~", option0.getDescription());
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Option option0 = new Option("", "");
      assertEquals((-1), option0.getArgs());
      
      option0.setArgs((-2));
      boolean boolean0 = option0.hasArgs();
      assertEquals((-2), option0.getArgs());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setArgs(61);
      option0.toString();
      assertEquals(61, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setArgName("HIRhj#]");
      boolean boolean0 = option0.hasArgName();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Option option0 = new Option("", "");
      option0.setArgName("");
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.hasArgName();
      assertFalse(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      String[] stringArray0 = option0.getValues();
      assertEquals((-1), option0.getArgs());
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Option option0 = new Option((String) null, true, "cOi0_3z%|I");
      option0.addValueForProcessing("v$@EV3r89(-,1RC3m\"");
      String[] stringArray0 = option0.getValues();
      assertNotNull(stringArray0);
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Option option0 = new Option("", true, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      option0.addValueForProcessing("");
      String string0 = option0.getValue("J+qxK!V%j");
      assertFalse(option0.hasLongOpt());
      assertEquals("", string0);
      assertEquals("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Option option0 = new Option((String) null, "rb]xYVWX");
      option0.getValue((-2));
      assertFalse(option0.hasLongOpt());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Option option0 = new Option((String) null, true, "cOi0_3z%|I");
      option0.addValueForProcessing("v$@EV3r89(-,1RC3m\"");
      try { 
        option0.getValue(34);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Option option0 = new Option("OD", false, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      String string0 = option0.getValue("OD");
      assertNotNull(string0);
      assertEquals("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ", option0.getDescription());
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      option_Builder0.option("");
      Option option0 = option_Builder1.build();
      option0.addValueForProcessing("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertTrue(option0.hasArg());
      assertTrue(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
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
  public void test64()  throws Throwable  {
      Option option0 = new Option("ug_ef", "'", false, "'");
      Option option1 = (Option)option0.clone();
      boolean boolean0 = option0.equals(option1);
      assertNotSame(option1, option0);
      assertTrue(boolean0);
      assertEquals("'", option1.getDescription());
      assertEquals((-1), option1.getArgs());
      assertEquals("'", option1.getLongOpt());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Option option0 = new Option("O_KRGS_AL4ED", "O_KRGS_AL4ED");
      Option option1 = new Option("XB", false, "XB");
      boolean boolean0 = option0.equals(option1);
      assertEquals((-1), option1.getArgs());
      assertFalse(boolean0);
      assertFalse(option1.hasLongOpt());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Option option0 = new Option("p", "p");
      Option option1 = new Option("p", "p", true, "p");
      boolean boolean0 = option1.equals(option0);
      assertEquals((-1), option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Option option0 = new Option("", "'", false, "'");
      boolean boolean0 = option0.equals(option0);
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
      assertEquals("'", option0.getLongOpt());
      assertEquals("'", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Option option0 = new Option((String) null, true, "cOi0_3z%|I");
      boolean boolean0 = option0.equals((Object) null);
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
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
      Option option0 = new Option((String) null, true, "cOi0_3z%|I");
      assertEquals(1, option0.getArgs());
      
      option0.addValueForProcessing("v$@EV3r89(-,1RC3m\"");
      boolean boolean0 = option0.acceptsArg();
      assertFalse(option0.hasLongOpt());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.optionalArg(false);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.hasArg(false);
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
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
  public void test74()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option option0 = option_Builder0.build();
      option0.getOpt();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getType();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      // Undeclared exception!
      try { 
        option0.addValue("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Option option0 = new Option("", true, "");
      String string0 = option0.getLongOpt();
      assertNull(string0);
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Option option0 = new Option((String) null, true, "cOi0_3z%|I");
      option0.hashCode();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.isRequired();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Option option0 = new Option("", "");
      String string0 = option0.getDescription();
      assertEquals((-1), option0.getArgs());
      assertFalse(option0.hasLongOpt());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      int int0 = option0.getArgs();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.clearValues();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
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
  public void test84()  throws Throwable  {
      Option option0 = new Option("", true, "");
      option0.setDescription("DuC*Y=9XJ^[");
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLWED", "NO_ARGS_ALLWED", true, "NO_ARGS_ALLWED");
      int int0 = option0.getId();
      assertEquals(1, option0.getArgs());
      assertEquals(78, int0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Option option0 = new Option((String) null, (String) null);
      option0.getValuesList();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Option option0 = new Option((String) null, true, "cOi0_3z%|I");
      option0.setArgs(123);
      option0.addValueForProcessing("v$@EV3r89(-,1RC3m\"");
      option0.addValueForProcessing((String) null);
      option0.setArgs(1);
      boolean boolean0 = option0.acceptsArg();
      assertEquals(1, option0.getArgs());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Option option0 = new Option("NO_ARGS_ALLOWED", "NO_ARGS_ALLOWED");
      option0.setRequired(true);
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      Option option0 = new Option("", "", true, "");
      option0.setOptionalArg(true);
      option0.setArgs(0);
      assertTrue(option0.hasOptionalArg());
      
      option0.addValueForProcessing("");
      assertFalse(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Option option0 = new Option("", true, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ");
      option0.getArgName();
      assertFalse(option0.hasLongOpt());
      assertEquals(1, option0.getArgs());
      assertEquals("The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ", option0.getDescription());
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Option option0 = new Option("N_ARGS_ALLWED", true, "N_ARGS_ALLWED");
      option0.setType((Object) null);
      String string0 = option0.toString();
      assertEquals("[ option: N_ARGS_ALLWED  [ARG] :: N_ARGS_ALLWED ]", string0);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Class<Object> class0 = Object.class;
      Option.Builder option_Builder1 = option_Builder0.type(class0);
      assertSame(option_Builder1, option_Builder0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      Option.Builder option_Builder1 = option_Builder0.hasArgs();
      Option option0 = option_Builder1.build();
      boolean boolean0 = option0.requiresArg();
      assertTrue(boolean0);
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("");
      option_Builder0.hasArg();
      Option option0 = option_Builder0.build();
      assertTrue(option0.hasArg());
      
      option0.addValueForProcessing("");
      String string0 = option0.getValue();
      assertNotNull(string0);
      assertFalse(option0.hasValueSeparator());
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder("g");
      Option.Builder option_Builder1 = option_Builder0.desc("g");
      assertSame(option_Builder0, option_Builder1);
  }

  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      option_Builder0.required();
      option_Builder0.option("");
      Option option0 = option_Builder0.build();
      boolean boolean0 = option0.isRequired();
      assertTrue(boolean0);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test97()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.argName("");
      option_Builder0.longOpt("");
      Option option0 = option_Builder1.build();
      option0.getArgName();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test98()  throws Throwable  {
      Option.Builder option_Builder0 = Option.builder();
      Option.Builder option_Builder1 = option_Builder0.valueSeparator();
      assertSame(option_Builder0, option_Builder1);
  }
}