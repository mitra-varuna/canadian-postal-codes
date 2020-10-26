package in.ssushant.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import in.ssushant.sdk.language.CanadianPostalCodeFileType;
import in.ssushant.sdk.language.CanadianPostalCodeLanguage;
import org.jetbrains.annotations.NotNull;

public class CanadianPostCodeFile extends PsiFileBase {
    public CanadianPostCodeFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CanadianPostalCodeLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return CanadianPostalCodeFileType.INSTANCE;
    }
}
