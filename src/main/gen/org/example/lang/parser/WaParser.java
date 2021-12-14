// This is a generated file. Not intended for manual editing.
package org.example.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.example.lang.psi.WaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class WaParser implements PsiParser, LightPsiParser {

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
    return waFile(b, l + 1);
  }

  /* ********************************************************** */
  // stmt*
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // varDeclareStmt | funcDeclareStmt
  public static boolean declareStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declareStmt")) return false;
    if (!nextTokenIs(b, "<declare stmt>", FUNC, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARE_STMT, "<declare stmt>");
    r = varDeclareStmt(b, l + 1);
    if (!r) r = funcDeclareStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // literal_expr (ADD literal_expr)*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR, "<expr>");
    r = literal_expr(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ADD literal_expr)*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!expr_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
    }
    return true;
  }

  // ADD literal_expr
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ADD);
    r = r && literal_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr SEMICOLON
  public static boolean exprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = expr(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FUNC IDENT LPAREN RPAREN LBRACE block RBRACE
  public static boolean funcDeclareStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "funcDeclareStmt")) return false;
    if (!nextTokenIs(b, FUNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FUNC, IDENT, LPAREN, RPAREN, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, FUNC_DECLARE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IF LPAREN expr RPAREN LBRACE block RBRACE ELSE LBRACE block RBRACE
  public static boolean ifStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStmt")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF, LPAREN);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACE, ELSE, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER|STRING|IDENT
  public static boolean literal_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL_EXPR, "<literal expr>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stmt*
  public static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    Marker m = enter_section_(b, l, _NONE_, PROGRAM, "<program>");
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "program", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // RETURN expr SEMICOLON
  public static boolean returnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStmt")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RETURN_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // ifStmt|whileStmt|returnStmt|exprStmt|declareStmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = ifStmt(b, l + 1);
    if (!r) r = whileStmt(b, l + 1);
    if (!r) r = returnStmt(b, l + 1);
    if (!r) r = exprStmt(b, l + 1);
    if (!r) r = declareStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VAR IDENT (ASSIGN expr)? SEMICOLON
  public static boolean varDeclareStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDeclareStmt")) return false;
    if (!nextTokenIs(b, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VAR, IDENT);
    r = r && varDeclareStmt_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, VAR_DECLARE_STMT, r);
    return r;
  }

  // (ASSIGN expr)?
  private static boolean varDeclareStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDeclareStmt_2")) return false;
    varDeclareStmt_2_0(b, l + 1);
    return true;
  }

  // ASSIGN expr
  private static boolean varDeclareStmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "varDeclareStmt_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // program
  static boolean waFile(PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // WHILE LPAREN expr RPAREN LBRACE block RBRACE
  public static boolean whileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStmt")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE, LPAREN);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, WHILE_STMT, r);
    return r;
  }

}
