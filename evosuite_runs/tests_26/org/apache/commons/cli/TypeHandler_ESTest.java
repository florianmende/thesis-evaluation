/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:03:24 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.cli.TypeHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TypeHandler_ESTest extends TypeHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        TypeHandler.createObject("org.apache.commons.cli.ParseException");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NoSuchMethodException; Unable to create an instance of: org.apache.commons.cli.ParseException
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.apache.commons.cli.PatternOptionBuilder");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = TypeHandler.openFile("org.apache.commons.cli.PatternOptionBuilder");
      assertEquals(0, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/$<ILrgqspKv*<76");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "lPh*D");
      FileInputStream fileInputStream0 = TypeHandler.openFile("/$<ILrgqspKv*<76");
      assertEquals(6, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = TypeHandler.createValue("org.apache.commons.cli.TypeHandler", class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = TypeHandler.createObject("org.apache.commons.cli.PatternOptionBuilder");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/$<ILrgqspKv*<76");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "lPh*D");
      File file0 = TypeHandler.createFile("/$<ILrgqspKv*<76");
      assertTrue(file0.canWrite());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      File file0 = TypeHandler.createFile("/$<ILrgqspKv*<76");
      assertEquals("/", file0.getParent());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = TypeHandler.createFile("");
      assertNull(file0.getParent());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.openFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        TypeHandler.createValue((String) null, (Object) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createValue("", (Object) "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        TypeHandler.createValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createNumber((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      try { 
        TypeHandler.createClass("-=%-lKyS");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: -=%-lKyS
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Object> class0 = Object.class;
      try { 
        TypeHandler.createValue("", class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: 
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      try { 
        TypeHandler.createValue("#NK`d`cX:a*", class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to handle the class: class java.lang.Integer
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TypeHandler typeHandler0 = new TypeHandler();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      try { 
        TypeHandler.createNumber("org.apache.comons.cli.Options");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // For input string: \"org.apache.comons.cli.Options\"
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Number number0 = TypeHandler.createNumber("7");
      assertEquals(7L, number0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      File file0 = TypeHandler.createFile(".#D&i");
      assertFalse(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createDate((String) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not yet implemented
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      try { 
        TypeHandler.createURL("sZ'R8");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to parse the URL: sZ'R8
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = TypeHandler.createValue("org.apache.commons.cli.TypeHandler", (Object) class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFiles("Unable to parse the URL: ");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not yet implemented
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      try { 
        TypeHandler.openFile("/$<ILrgqspKv*<76");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find file: /$<ILrgqspKv*<76
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.TypeHandler");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      try { 
        TypeHandler.createValue((String) null, (Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to handle the class: null
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }
}