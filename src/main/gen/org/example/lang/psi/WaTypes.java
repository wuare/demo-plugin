// This is a generated file. Not intended for manual editing.
package org.example.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.example.lang.psi.impl.*;

public interface WaTypes {

  IElementType BLOCK = new WaElementType("BLOCK");
  IElementType DECLARE_STMT = new WaElementType("DECLARE_STMT");
  IElementType EXPR = new WaElementType("EXPR");
  IElementType EXPR_STMT = new WaElementType("EXPR_STMT");
  IElementType FUNC_DECLARE_STMT = new WaElementType("FUNC_DECLARE_STMT");
  IElementType IF_STMT = new WaElementType("IF_STMT");
  IElementType LITERAL_EXPR = new WaElementType("LITERAL_EXPR");
  IElementType PROGRAM = new WaElementType("PROGRAM");
  IElementType RETURN_STMT = new WaElementType("RETURN_STMT");
  IElementType STMT = new WaElementType("STMT");
  IElementType VAR_DECLARE_STMT = new WaElementType("VAR_DECLARE_STMT");
  IElementType WHILE_STMT = new WaElementType("WHILE_STMT");

  IElementType ADD = new WaTokenType("ADD");
  IElementType ASSIGN = new WaTokenType("ASSIGN");
  IElementType ELSE = new WaTokenType("ELSE");
  IElementType FUNC = new WaTokenType("FUNC");
  IElementType IDENT = new WaTokenType("IDENT");
  IElementType IF = new WaTokenType("IF");
  IElementType LBRACE = new WaTokenType("LBRACE");
  IElementType LPAREN = new WaTokenType("LPAREN");
  IElementType NUMBER = new WaTokenType("NUMBER");
  IElementType RBRACE = new WaTokenType("RBRACE");
  IElementType RETURN = new WaTokenType("RETURN");
  IElementType RPAREN = new WaTokenType("RPAREN");
  IElementType SEMICOLON = new WaTokenType("SEMICOLON");
  IElementType STRING = new WaTokenType("STRING");
  IElementType VAR = new WaTokenType("VAR");
  IElementType WHILE = new WaTokenType("WHILE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BLOCK) {
        return new WaBlockImpl(node);
      }
      else if (type == DECLARE_STMT) {
        return new WaDeclareStmtImpl(node);
      }
      else if (type == EXPR) {
        return new WaExprImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new WaExprStmtImpl(node);
      }
      else if (type == FUNC_DECLARE_STMT) {
        return new WaFuncDeclareStmtImpl(node);
      }
      else if (type == IF_STMT) {
        return new WaIfStmtImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new WaLiteralExprImpl(node);
      }
      else if (type == PROGRAM) {
        return new WaProgramImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new WaReturnStmtImpl(node);
      }
      else if (type == STMT) {
        return new WaStmtImpl(node);
      }
      else if (type == VAR_DECLARE_STMT) {
        return new WaVarDeclareStmtImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new WaWhileStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
