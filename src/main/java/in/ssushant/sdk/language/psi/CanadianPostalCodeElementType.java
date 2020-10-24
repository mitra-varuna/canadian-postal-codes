package in.ssushant.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import in.ssushant.sdk.language.CanadianPostalCodeLanguage;
import org.jetbrains.annotations.NotNull;

public class CanadianPostalCodeElementType extends IElementType {
    public CanadianPostalCodeElementType(@NotNull String debugName) {
        super(debugName, CanadianPostalCodeLanguage.INSTANCE);
    }
}
