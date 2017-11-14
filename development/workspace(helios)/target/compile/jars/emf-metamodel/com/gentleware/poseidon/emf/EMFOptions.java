package com.gentleware.poseidon.emf;



public class EMFOptions
{
  /**
   * if false, no lists are lazily created, and you must call settable_getXXX
   * if true, the lists are lazily created by just calling getXXX
   */
  public static boolean CREATE_LISTS_LAZILY_FOR_GET = false;  
}
