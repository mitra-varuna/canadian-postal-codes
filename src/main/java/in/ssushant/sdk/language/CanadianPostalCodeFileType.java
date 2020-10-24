package in.ssushant.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CanadianPostalCodeFileType extends LanguageFileType {
    public static final CanadianPostalCodeFileType INSTANCE = new CanadianPostalCodeFileType();
    public static final String CANADIAN_POSTAL_CODE = "Canadian Postal Code";
    public static final String CANADIAN_POSTAL_CODE_FILE = "Canadian Postal Code File";
    public static final String CPC_EXTENSION = "cpc";

    private CanadianPostalCodeFileType() {
        super(CanadianPostalCodeLanguage.INSTANCE);
    }

    @Override
    public @NotNull
    String getName() {
        return CANADIAN_POSTAL_CODE;
    }

    @Override
    public @NotNull
    @NlsContexts.Label String getDescription() {
        return CANADIAN_POSTAL_CODE_FILE;
    }

    @Override
    public @NotNull
    String getDefaultExtension() {
        return CPC_EXTENSION;
    }

    @Override
    public @Nullable
    Icon getIcon() {
        return CanadianPostCodeIcons.FILE;
    }
}
