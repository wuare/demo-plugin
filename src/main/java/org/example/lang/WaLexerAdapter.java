package org.example.lang;

import com.intellij.lexer.FlexAdapter;

public class WaLexerAdapter extends FlexAdapter {
    public WaLexerAdapter() {
        super(new WaLexer(null));
    }
}
