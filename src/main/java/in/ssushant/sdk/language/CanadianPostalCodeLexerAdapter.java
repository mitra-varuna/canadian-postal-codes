package in.ssushant.sdk.language;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class CanadianPostalCodeLexerAdapter extends FlexAdapter {
    public CanadianPostalCodeLexerAdapter() {
        super(new _CanadianPostalCodeLexer(null));
    }
}
