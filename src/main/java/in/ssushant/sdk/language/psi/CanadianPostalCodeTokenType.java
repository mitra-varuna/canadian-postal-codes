package in.ssushant.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import in.ssushant.sdk.language.CanadianPostalCodeLanguage;
import org.jetbrains.annotations.NotNull;

public class CanadianPostalCodeTokenType extends IElementType {
    public CanadianPostalCodeTokenType(@NotNull String debugName) {
        super(debugName, CanadianPostalCodeLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CanadianPostalCodeTokenType." + super.toString();
    }
}
