/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 01:11:57 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
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
      MissingOptionException missingOptionException0 = new MissingOptionException("t<l1h");
      List list0 = missingOptionException0.getMissingOptions();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList1, locale_FilteringMode0);
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
      List list1 = missingOptionException0.getMissingOptions();
      assertTrue(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
      Object object0 = new Object();
      linkedList0.add(object0);
      List list1 = missingOptionException0.getMissingOptions();
      MissingOptionException missingOptionException1 = null;
      try {
        missingOptionException1 = new MissingOptionException(list1);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList$SubList", e);
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
      List<Object> list0 = List.of((Object) "v2`&WBR~H8m9Ju2);i", (Object) "v2`&WBR~H8m9Ju2);i", (Object) "v2`&WBR~H8m9Ju2);i");
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) null);
      MissingOptionException missingOptionException0 = new MissingOptionException(linkedList0);
      List list0 = missingOptionException0.getMissingOptions();
      assertFalse(list0.isEmpty());
  }
}
