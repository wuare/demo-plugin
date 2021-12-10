// This is a generated file. Not intended for manual editing.
package org.example.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.example.lang.psi.impl.*;

public interface WaTypes {

  IElementType PROPERTY = new WaElementType("PROPERTY");

  IElementType COMMENT = new WaTokenType("COMMENT");
  IElementType CRLF = new WaTokenType("CRLF");
  IElementType KEY = new WaTokenType("KEY");
  IElementType SEPARATOR = new WaTokenType("SEPARATOR");
  IElementType VALUE = new WaTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new WaPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
