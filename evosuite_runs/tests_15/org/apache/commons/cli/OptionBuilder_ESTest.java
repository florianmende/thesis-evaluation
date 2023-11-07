/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:02:31 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OptionBuilder_ESTest extends OptionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withType((Object) null);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create((String) null);
      assertEquals('=', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptionBuilder.withLongOpt("org.apache.commons.cli.OptionBuilder");
      Option option0 = OptionBuilder.create("");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionBuilder.withArgName("G:z`|_]j<OI]9|m");
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Option option0 = OptionBuilder.create("$");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create((String) null);
      assertTrue(option0.hasOptionalArg());
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create("");
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create('S');
      assertEquals((-1), option0.getArgs());
      assertTrue(option0.isRequired());
      assertEquals("S", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionBuilder.withLongOpt("p~");
      Option option0 = OptionBuilder.create('j');
      assertEquals((-1), option0.getArgs());
      assertEquals("j", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionBuilder.withArgName(" :: ");
      Option option0 = OptionBuilder.create('j');
      assertEquals((-1), option0.getArgs());
      assertEquals("j", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create('V');
      assertEquals(0, option0.getArgs());
      assertEquals("V", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionBuilder.hasArg();
      Option option0 = OptionBuilder.create('S');
      assertEquals(1, option0.getArgs());
      assertEquals("S", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionBuilder.withLongOpt("3lM_~");
      OptionBuilder.withArgName("3lM_~");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptionBuilder.withLongOpt("G:z`|_]j<OI]9|m");
      OptionBuilder.hasArgs(0);
      Option option0 = OptionBuilder.create();
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(2);
      OptionBuilder.withLongOpt("TSFdw_ZCC|$");
      Option option0 = OptionBuilder.create();
      assertEquals(2, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        OptionBuilder.create("Cannot add value, list full.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option 'Cannot add value, list full.' contains an illegal character : ' '
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      try { 
        OptionBuilder.create();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must specify longopt
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withDescription("");
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      OptionBuilder.hasOptionalArgs();
      Option option0 = OptionBuilder.create('3');
      assertEquals((-2), option0.getArgs());
      assertTrue(option0.hasOptionalArg());
      assertEquals("3", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OptionBuilder.hasArgs();
      Option option0 = OptionBuilder.create("");
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      try { 
        OptionBuilder.create('.');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '.'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create('S');
      assertEquals('=', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
      assertEquals("S", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<String> class0 = String.class;
      OptionBuilder optionBuilder0 = OptionBuilder.withType(class0);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasOptionalArg();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.isRequired(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OptionBuilder.withValueSeparator(')');
      OptionBuilder.withLongOpt("TSFdw_ZCC|$");
      Option option0 = OptionBuilder.create();
      assertEquals(')', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OptionBuilder.isRequired();
      OptionBuilder.withLongOpt("3lM_~");
      Option option0 = OptionBuilder.create();
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg();
      // Undeclared exception!
      try { 
        OptionBuilder.withType((Object) optionBuilder0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.apache.commons.cli.OptionBuilder cannot be cast to class java.lang.Class (org.apache.commons.cli.OptionBuilder is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @5e4ab26d; java.lang.Class is in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }
}
