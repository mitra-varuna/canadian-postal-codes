package in.ssushant.sdk.language;

import com.intellij.lang.Language;

public class CanadianPostalCodeLanguage extends Language {
    public static final CanadianPostalCodeLanguage INSTANCE = new CanadianPostalCodeLanguage();

    private CanadianPostalCodeLanguage() {
        super("CanadianPostalCodeLanguage");
    }
}
