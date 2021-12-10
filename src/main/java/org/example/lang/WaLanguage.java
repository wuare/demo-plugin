package org.example.lang;

import com.intellij.lang.Language;

public class WaLanguage extends Language {
    public static final WaLanguage INSTANCE = new WaLanguage();
    private WaLanguage() {
        super("Wa");
    }
}
