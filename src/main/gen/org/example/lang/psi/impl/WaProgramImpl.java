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

public class WaProgramImpl extends ASTWrapperPsiElement implements WaProgram {

  public WaProgramImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull WaVisitor visitor) {
    visitor.visitProgram(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WaVisitor) accept((WaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WaStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WaStmt.class);
  }

}
