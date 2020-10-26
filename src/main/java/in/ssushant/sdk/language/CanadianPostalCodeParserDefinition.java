package in.ssushant.sdk.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import in.ssushant.sdk.language.parser.CanadianPostalCodeParser;
import in.ssushant.sdk.language.psi.CanadianPostCodeFile;
import in.ssushant.sdk.language.psi.CanadianPostalCodeTypes;
import org.jetbrains.annotations.NotNull;

public class CanadianPostalCodeParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(CanadianPostalCodeTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(CanadianPostalCodeLanguage.INSTANCE);
    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new CanadianPostalCodeLexerAdapter();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new CanadianPostalCodeParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return CanadianPostalCodeTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new CanadianPostCodeFile(viewProvider);
    }

    @Override
    public @NotNull TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
