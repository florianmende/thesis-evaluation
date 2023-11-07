/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 06 00:50:08 GMT 2023
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
      MissingOptionException missingOptionException0 = new MissingOptionException("=O-R@9u\"q*_");
      List list0 = missingOptionException0.getMissingOptions();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = List.of((Object) linkedList0, (Object) linkedList0, (Object) linkedList0, (Object) linkedList0, (Object) linkedList0);
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      MissingOptionException missingOptionException0 = new MissingOptionException(linkedList0);
      List list0 = missingOptionException0.getMissingOptions();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null);
      MissingOptionException missingOptionException0 = new MissingOptionException(list0);
      List list1 = missingOptionException0.getMissingOptions();
      assertEquals(0, list1.size());
  }
}