package org.example.lang.psi;

import com.intellij.psi.tree.IElementType;
import org.example.lang.WaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class WaElementType extends IElementType {

    public WaElementType(@NotNull @NonNls String debugName) {
        super(debugName, WaLanguage.INSTANCE);
    }

}
