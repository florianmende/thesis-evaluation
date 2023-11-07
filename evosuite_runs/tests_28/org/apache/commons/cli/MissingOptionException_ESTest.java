/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:57:28 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.cli.MissingOptionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MissingOptionException_ESTest extends MissingOptionException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MissingOptionException missingOptionException0 = new MissingOptionException("org.apache.commons.cli.ParseException");
      List list0 = missingOptionException0.getMissingOptions();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1);
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
      List list1 = missingOptionException0.getMissingOptions();
      assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      List<Object> list0 = List.of((Object) linkedList0, object0, object0, object0, (Object) linkedList0, (Object) linkedList0, object0, object0);
      linkedList0.add((Object) list0);
      MissingOptionException missingOptionException0 = null;
      try {
        missingOptionException0 = new MissingOptionException(linkedList0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MissingOptionException missingOptionException0 = null;
      try {
        missingOptionException0 = new MissingOptionException((List) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.MissingOptionException", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      List<Object> list0 = List.of((Object) linkedList0, (Object) linkedList0);
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(0);
      linkedList0.add(0, (Object) integer0);
      MissingOptionException missingOptionException0 = new MissingOptionException(linkedList0);
      List list0 = missingOptionException0.getMissingOptions();
      assertEquals(1, list0.size());
  }
}
