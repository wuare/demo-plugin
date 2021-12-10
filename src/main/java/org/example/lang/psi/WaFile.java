package org.example.lang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.example.lang.WaFileType;
import org.example.lang.WaLanguage;
import org.jetbrains.annotations.NotNull;

public class WaFile extends PsiFileBase {

    public WaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, WaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return WaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Wa File";
    }
}
