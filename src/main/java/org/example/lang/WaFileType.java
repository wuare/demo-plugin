package org.example.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class WaFileType extends LanguageFileType {

    public static final WaFileType INSTANCE = new WaFileType();

    private WaFileType() {
        super(WaLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Wa File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Wa language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "wa";
    }

    @Override
    public @Nullable Icon getIcon() {
        return WaIcons.FILE;
    }
}
