// This is a generated file. Not intended for manual editing.
package in.ssushant.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.CanadianPostalCodeElementType;
import org.intellij.sdk.language.psi.CanadianPostalCodeTokenType;
import in.ssushant.sdk.language.psi.impl.*;

public interface SCanadianPostalCodeTypes {

  IElementType DIGIT = new CanadianPostalCodeElementType("DIGIT");
  IElementType FORWARDSORTATIONAREA = new CanadianPostalCodeElementType("FORWARDSORTATIONAREA");
  IElementType LETTER = new CanadianPostalCodeElementType("LETTER");
  IElementType LOCALDELIVERYUNIT = new CanadianPostalCodeElementType("LOCALDELIVERYUNIT");
  IElementType LOCTYPE = new CanadianPostalCodeElementType("LOCTYPE");
  IElementType PROVAREA = new CanadianPostalCodeElementType("PROVAREA");
  IElementType RURAL = new CanadianPostalCodeElementType("RURAL");
  IElementType URBAN = new CanadianPostalCodeElementType("URBAN");

  IElementType A = new CanadianPostalCodeTokenType("A");
  IElementType B = new CanadianPostalCodeTokenType("B");
  IElementType C = new CanadianPostalCodeTokenType("C");
  IElementType E = new CanadianPostalCodeTokenType("E");
  IElementType G = new CanadianPostalCodeTokenType("G");
  IElementType H = new CanadianPostalCodeTokenType("H");
  IElementType J = new CanadianPostalCodeTokenType("J");
  IElementType K = new CanadianPostalCodeTokenType("K");
  IElementType L = new CanadianPostalCodeTokenType("L");
  IElementType M = new CanadianPostalCodeTokenType("M");
  IElementType N = new CanadianPostalCodeTokenType("N");
  IElementType P = new CanadianPostalCodeTokenType("P");
  IElementType R = new CanadianPostalCodeTokenType("R");
  IElementType S = new CanadianPostalCodeTokenType("S");
  IElementType T = new CanadianPostalCodeTokenType("T");
  IElementType V = new CanadianPostalCodeTokenType("V");
  IElementType W = new CanadianPostalCodeTokenType("W");
  IElementType X = new CanadianPostalCodeTokenType("X");
  IElementType Y = new CanadianPostalCodeTokenType("Y");
  IElementType Z = new CanadianPostalCodeTokenType("Z");
  IElementType _SPACE_ = new CanadianPostalCodeTokenType("<space>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DIGIT) {
        return new CanadianPostalCodeDigitImpl(node);
      }
      else if (type == FORWARDSORTATIONAREA) {
        return new CanadianPostalCodeForwardsortationareaImpl(node);
      }
      else if (type == LETTER) {
        return new CanadianPostalCodeLetterImpl(node);
      }
      else if (type == LOCALDELIVERYUNIT) {
        return new CanadianPostalCodeLocaldeliveryunitImpl(node);
      }
      else if (type == LOCTYPE) {
        return new CanadianPostalCodeLoctypeImpl(node);
      }
      else if (type == PROVAREA) {
        return new CanadianPostalCodeProvareaImpl(node);
      }
      else if (type == RURAL) {
        return new CanadianPostalCodeRuralImpl(node);
      }
      else if (type == URBAN) {
        return new CanadianPostalCodeUrbanImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
