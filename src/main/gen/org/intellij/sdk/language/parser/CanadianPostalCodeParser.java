// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static in.ssushant.sdk.language.psi.SCanadianPostalCodeTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CanadianPostalCodeParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return postalcode(b, l + 1);
  }

  /* ********************************************************** */
  // 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
  public static boolean digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "digit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIGIT, "<digit>");
    r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <provarea> <loctype> <letter>
  public static boolean forwardsortationarea(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forwardsortationarea")) return false;
    if (!nextTokenIs(b, _PROVAREA_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = provarea(b, l + 1);
    r = r && loctype(b, l + 1);
    r = r && letter(b, l + 1);
    exit_section_(b, m, FORWARDSORTATIONAREA, r);
    return r;
  }

  /* ********************************************************** */
  // A | B | C | E | G | H | J | K | L | M | N |
  //                              P | R | S | T | V | W | X | Y | Z
  public static boolean letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = consumeToken(b, A);
    if (!r) r = consumeToken(b, B);
    if (!r) r = consumeToken(b, C);
    if (!r) r = consumeToken(b, E);
    if (!r) r = consumeToken(b, G);
    if (!r) r = consumeToken(b, H);
    if (!r) r = consumeToken(b, J);
    if (!r) r = consumeToken(b, K);
    if (!r) r = consumeToken(b, L);
    if (!r) r = consumeToken(b, M);
    if (!r) r = consumeToken(b, N);
    if (!r) r = consumeToken(b, P);
    if (!r) r = consumeToken(b, R);
    if (!r) r = consumeToken(b, S);
    if (!r) r = consumeToken(b, T);
    if (!r) r = consumeToken(b, V);
    if (!r) r = consumeToken(b, W);
    if (!r) r = consumeToken(b, X);
    if (!r) r = consumeToken(b, Y);
    if (!r) r = consumeToken(b, Z);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <digit> <letter> <digit>
  public static boolean localdeliveryunit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "localdeliveryunit")) return false;
    if (!nextTokenIs(b, _DIGIT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = digit(b, l + 1);
    r = r && letter(b, l + 1);
    r = r && digit(b, l + 1);
    exit_section_(b, m, LOCALDELIVERYUNIT, r);
    return r;
  }

  /* ********************************************************** */
  // <rural> | <urban>
  public static boolean loctype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "loctype")) return false;
    if (!nextTokenIs(b, "<loctype>", _RURAL_, _URBAN_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOCTYPE, "<loctype>");
    r = rural(b, l + 1);
    if (!r) r = urban(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <forwardsortationarea> <space> <localdeliveryunit>
  static boolean postalcode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postalcode")) return false;
    if (!nextTokenIs(b, _FORWARDSORTATIONAREA_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = forwardsortationarea(b, l + 1);
    r = r && consumeTokens(b, 0, _SPACE_, _LOCALDELIVERYUNIT_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // A | B | C | E | G | H | J | K | L | M | N |
  //                              P | R | S | T | V | X | Y
  public static boolean provarea(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "provarea")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROVAREA, "<provarea>");
    r = consumeToken(b, A);
    if (!r) r = consumeToken(b, B);
    if (!r) r = consumeToken(b, C);
    if (!r) r = consumeToken(b, E);
    if (!r) r = consumeToken(b, G);
    if (!r) r = consumeToken(b, H);
    if (!r) r = consumeToken(b, J);
    if (!r) r = consumeToken(b, K);
    if (!r) r = consumeToken(b, L);
    if (!r) r = consumeToken(b, M);
    if (!r) r = consumeToken(b, N);
    if (!r) r = consumeToken(b, P);
    if (!r) r = consumeToken(b, R);
    if (!r) r = consumeToken(b, S);
    if (!r) r = consumeToken(b, T);
    if (!r) r = consumeToken(b, V);
    if (!r) r = consumeToken(b, X);
    if (!r) r = consumeToken(b, Y);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 0
  public static boolean rural(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rural")) return false;
    if (!nextTokenIs(b, 0)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "0");
    exit_section_(b, m, RURAL, r);
    return r;
  }

  /* ********************************************************** */
  // 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
  public static boolean urban(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "urban")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, URBAN, "<urban>");
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
