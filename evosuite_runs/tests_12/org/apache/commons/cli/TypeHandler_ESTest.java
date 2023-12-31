/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 23:32:55 GMT 2023
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
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("U<,em?=+MV");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = TypeHandler.openFile("U<,em?=+MV");
      assertEquals(5, fileInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = TypeHandler.createValue("org.apache.commons.cli.TypeHandler", (Object) class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      File file0 = TypeHandler.createFile("");
      assertEquals("", file0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = TypeHandler.createFile("/Lt");
      assertEquals("/", file0.getParent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".F@");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = TypeHandler.createFile(".F@");
      assertEquals(0L, file0.getUsableSpace());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createValue(")", (Object) ")");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class java.lang.String cannot be cast to class java.lang.Class (java.lang.String and java.lang.Class are in module java.base of loader 'bootstrap')
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        TypeHandler.createValue((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
      try { 
        TypeHandler.createClass("=\"Vs<y@Irm^lCY");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find the class: =\"Vs<y@Irm^lCY
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      try { 
        TypeHandler.createValue("?Y1lTG,e./k{3CHT`F", class0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to handle the class: class java.lang.Integer
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = TypeHandler.createObject("org.apache.commons.cli.PatternOptionBuilder");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      try { 
        TypeHandler.createNumber("org.apache.commons.cli.PatternOptionBuilder");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // For input string: \"org.apache.commons.cli.PatternOptionBuilder\"
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Number number0 = TypeHandler.createNumber("7");
      assertEquals(7L, number0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = TypeHandler.createValue("org.apache.commons.cli.TypeHandler", class0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createDate("Unable to parse the URL: ");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not yet implemented
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        TypeHandler.createURL(".F@");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to parse the URL: .F@
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TypeHandler typeHandler0 = new TypeHandler();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeHandler.createFiles("/0Omoe_zji#57Ssq?]");
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
        TypeHandler.openFile("SDV<%7ntONPDTIiC");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find file: SDV<%7ntONPDTIiC
         //
         verifyException("org.apache.commons.cli.TypeHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<?> class0 = TypeHandler.createClass("org.apache.commons.cli.ParseException");
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
