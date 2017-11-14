package com.gentleware.poseidon.custom.diagrams.freeform.image;

import com.gentleware.poseidon.gem.*;


public interface ImagableFacet extends Facet
{
  public Object setImage(String type, byte[] imageData);
  public void unSetImage(Object memento);
}
