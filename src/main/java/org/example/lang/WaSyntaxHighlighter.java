package org.example.lang;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.example.lang.psi.WaTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class WaSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("WA_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("WA_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey IDENT =
            createTextAttributesKey("WA_IDENT", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("WA_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("WA_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("WA_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("WA_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] IDENT_KEYS = new TextAttributesKey[]{IDENT};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new WaLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(WaTypes.NUMBER)) {
            return NUMBER_KEYS;
        }

        if (tokenType.equals(WaTypes.IDENT)) {
            return IDENT_KEYS;
        }

        if (tokenType.equals(WaTypes.STRING)) {
            return STRING_KEYS;
        }

        if (tokenType.equals(WaTypes.IF) || tokenType.equals(WaTypes.ELSE) || tokenType.equals(WaTypes.WHILE)
                || tokenType.equals(WaTypes.RETURN) || tokenType.equals(WaTypes.VAR) || tokenType.equals(WaTypes.FUNC)) {
            return KEYWORD_KEYS;
        }

        if (tokenType.equals(WaTypes.LPAREN) || tokenType.equals(WaTypes.RPAREN)) {
            return PARENTHESES_KEYS;
        }

        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        }
        return EMPTY_KEYS;
    }
}
