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

public class WaStmtImpl extends ASTWrapperPsiElement implements WaStmt {

  public WaStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WaVisitor visitor) {
    visitor.visitStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WaVisitor) accept((WaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public WaDeclareStmt getDeclareStmt() {
    return findChildByClass(WaDeclareStmt.class);
  }

  @Override
  @Nullable
  public WaExprStmt getExprStmt() {
    return findChildByClass(WaExprStmt.class);
  }

  @Override
  @Nullable
  public WaIfStmt getIfStmt() {
    return findChildByClass(WaIfStmt.class);
  }

  @Override
  @Nullable
  public WaReturnStmt getReturnStmt() {
    return findChildByClass(WaReturnStmt.class);
  }

  @Override
  @Nullable
  public WaWhileStmt getWhileStmt() {
    return findChildByClass(WaWhileStmt.class);
  }

}
