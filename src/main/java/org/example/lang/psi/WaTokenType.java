package org.example.lang.psi;

import com.intellij.psi.tree.IElementType;
import org.example.lang.WaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class WaTokenType extends IElementType {

    public WaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, WaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "WaTokenType." + super.toString();
    }
}
