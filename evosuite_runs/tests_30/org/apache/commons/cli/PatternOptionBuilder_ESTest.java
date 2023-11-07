/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 02:48:20 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PatternOptionBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PatternOptionBuilder_ESTest extends PatternOptionBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        PatternOptionBuilder.parsePattern((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.PatternOptionBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('%');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode(':');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('<');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('!');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('#');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('>');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('/');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('@');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('\'');
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('+');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = PatternOptionBuilder.isValueCode('*');
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('@');
      assertEquals("class java.lang.Object", object0.toString());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class class0 = (Class)PatternOptionBuilder.getValueClass('%');
      assertNotNull(class0);
      assertEquals(1025, class0.getModifiers());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('+');
      assertEquals("class java.lang.Class", object0.toString());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('<');
      assertNotNull(object0);
      assertEquals("class java.io.FileInputStream", object0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('/');
      assertNotNull(object0);
      assertEquals("class java.net.URL", object0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('#');
      assertEquals("class java.util.Date", object0.toString());
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('>');
      assertNotNull(object0);
      assertEquals("class java.io.File", object0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class class0 = (Class)PatternOptionBuilder.getValueClass('*');
      assertNotNull(class0);
      assertTrue(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Options options0 = PatternOptionBuilder.parsePattern("e*");
      assertNotNull(options0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Options options0 = PatternOptionBuilder.parsePattern(" :: ");
      assertNotNull(options0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('[');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('?');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('=');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        PatternOptionBuilder.parsePattern("uDd<j@ orgyWD(m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '('
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass(';');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass(':');
      assertNotNull(object0);
      assertEquals("class java.lang.String", object0.toString());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('9');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('8');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('7');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('6');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('5');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('4');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('3');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('2');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('1');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('0');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Options options0 = PatternOptionBuilder.parsePattern("J/DQ");
      assertNotNull(options0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('-');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass(',');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        PatternOptionBuilder.parsePattern("CB!B+oe>di\"-AE");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal option name '\"'
         //
         verifyException("org.apache.commons.cli.OptionValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass(')');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('(');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('\'');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('&');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('$');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object object0 = PatternOptionBuilder.getValueClass('.');
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      PatternOptionBuilder patternOptionBuilder0 = new PatternOptionBuilder();
  }
}
