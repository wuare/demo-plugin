package org.example.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.example.lang.psi.WaTypes.*;

%%

%{
  public WaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class WaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+
IDENT=[a-z]+
STRING=\".*\"
NUMBER=[0-9]+


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "if"               { return IF; }
  "else"             { return ELSE; }
  "while"            { return WHILE; }
  "return"           { return RETURN; }
  "var"              { return VAR; }
  "func"             { return FUNC; }
  "("                { return LPAREN; }
  ")"                { return RPAREN; }
  "{"                { return LBRACE; }
  "}"                { return RBRACE; }
  ";"                { return SEMICOLON; }
  "="                { return ASSIGN; }
  "+"                { return ADD; }
//  "-"                { return SUB; }
//  "*"                { return MUL; }
//  "/"                { return DIV; }
//  "."                { return DOT; }

  {STRING}           { return STRING; }
  {IDENT}            { return IDENT; }
  {NUMBER}           { return NUMBER; }

}

[^] { return BAD_CHARACTER; }
