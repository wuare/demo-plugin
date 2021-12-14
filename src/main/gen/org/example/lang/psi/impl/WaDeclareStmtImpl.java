// This is a generated file. Not intended for manual editing.
package org.example.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.example.lang.psi.WaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.example.lang.psi.*;

public class WaDeclareStmtImpl extends ASTWrapperPsiElement implements WaDeclareStmt {

  public WaDeclareStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WaVisitor visitor) {
    visitor.visitDeclareStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WaVisitor) accept((WaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WaFuncDeclareStmt getFuncDeclareStmt() {
    return findChildByClass(WaFuncDeclareStmt.class);
  }

  @Override
  @Nullable
  public WaVarDeclareStmt getVarDeclareStmt() {
    return findChildByClass(WaVarDeclareStmt.class);
  }

}
