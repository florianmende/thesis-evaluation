/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:01:12 GMT 2023
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
      OptionBuilder.isRequired();
      Option option0 = OptionBuilder.create((String) null);
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptionBuilder.withLongOpt(" [ARG]");
      Option option0 = OptionBuilder.create("");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptionBuilder.withArgName("q-GqEC Mi");
      Option option0 = OptionBuilder.create("");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Option option0 = OptionBuilder.create("KgW9");
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create("");
      assertEquals(0, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      OptionBuilder.isRequired(true);
      Option option0 = OptionBuilder.create('r');
      assertEquals((-1), option0.getArgs());
      assertEquals("r", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptionBuilder.withValueSeparator('>');
      Option option0 = OptionBuilder.create('r');
      assertEquals('>', option0.getValueSeparator());
      assertEquals((-1), option0.getArgs());
      assertEquals("r", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptionBuilder.withLongOpt("must specify longopt");
      Option option0 = OptionBuilder.create('w');
      assertEquals((-1), option0.getArgs());
      assertEquals(119, option0.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      Option option0 = OptionBuilder.create('r');
      assertTrue(option0.hasOptionalArg());
      assertEquals(0, option0.getArgs());
      assertEquals("r", option0.getOpt());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(1598);
      Option option0 = OptionBuilder.create('H');
      assertTrue(option0.hasOptionalArg());
      assertEquals(72, option0.getId());
      assertEquals(1598, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptionBuilder.withLongOpt("");
      OptionBuilder.hasArgs();
      Option option0 = OptionBuilder.create();
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      OptionBuilder.withLongOpt("The option '");
      OptionBuilder.withArgName("must specify longopt");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptionBuilder.hasOptionalArgs(0);
      OptionBuilder.withLongOpt("org.apache.commons.cli.OptionBuilder");
      Option option0 = OptionBuilder.create();
      assertTrue(option0.hasOptionalArg());
      assertEquals(0, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptionBuilder.withLongOpt("The option '");
      OptionBuilder.hasOptionalArg();
      Option option0 = OptionBuilder.create();
      assertTrue(option0.hasOptionalArg());
      assertEquals(1, option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        OptionBuilder.withType(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.Object cannot be cast to class java.lang.Class (java.lang.Object and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.OptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        OptionBuilder.create("/Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The option '/Z' contains an illegal character : '/'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        OptionBuilder.create('*');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '*'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      OptionBuilder optionBuilder0 = OptionBuilder.withType(class0);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(true);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withDescription(";k=s");
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasOptionalArgs();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      OptionBuilder.hasArgs();
      Option option0 = OptionBuilder.create((String) null);
      assertEquals((-2), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      OptionBuilder.withValueSeparator();
      Option option0 = OptionBuilder.create("KgW9");
      assertEquals((-1), option0.getArgs());
      assertEquals('=', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OptionBuilder.hasOptionalArg();
      Option option0 = OptionBuilder.create((String) null);
      assertEquals(1, option0.getArgs());
      assertTrue(option0.hasOptionalArg());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OptionBuilder.withArgName("must specify longopt");
      Option option0 = OptionBuilder.create('w');
      assertEquals((-1), option0.getArgs());
      assertEquals(119, option0.getId());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArg();
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OptionBuilder.withValueSeparator('7');
      OptionBuilder.withLongOpt("The option '");
      Option option0 = OptionBuilder.create();
      assertEquals((-1), option0.getArgs());
      assertEquals('7', option0.getValueSeparator());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      OptionBuilder.isRequired();
      OptionBuilder.withLongOpt("");
      Option option0 = OptionBuilder.create();
      assertTrue(option0.isRequired());
      assertEquals((-1), option0.getArgs());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.withType((Object) null);
      assertNotNull(optionBuilder0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      OptionBuilder optionBuilder0 = OptionBuilder.hasArgs((-1));
      assertNotNull(optionBuilder0);
  }
}
