// This is a generated file. Not intended for manual editing.
package in.ssushant.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static in.ssushant.sdk.language.psi.SCanadianPostalCodeTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import in.ssushant.sdk.language.psi.*;

public class CanadianPostalCodeLocaldeliveryunitImpl extends ASTWrapperPsiElement implements CanadianPostalCodeLocaldeliveryunit {

  public CanadianPostalCodeLocaldeliveryunitImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CanadianPostalCodeVisitor visitor) {
    visitor.visitLocaldeliveryunit(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CanadianPostalCodeVisitor) accept((CanadianPostalCodeVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CanadianPostalCodeDigit> getDigitList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CanadianPostalCodeDigit.class);
  }

  @Override
  @NotNull
  public CanadianPostalCodeLetter getLetter() {
    return findNotNullChildByClass(CanadianPostalCodeLetter.class);
  }

}
