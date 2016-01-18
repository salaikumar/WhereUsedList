package io.salaikumar.parsers;

import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.core.runtime.CoreException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CParserTest {

    /*5
     * I have no idea what AST looks like.
     * First time actually. So, I just want to see it out.
     */
    @Test
    public void shouldTestAST(){

        IASTTranslationUnit expected = null;
        try {
            expected = CParser.testITranslationUnit();
        } catch (CoreException e) {
            e.printStackTrace();
        }
        System.out.println(expected);

        IASTDeclaration[] declarations = expected.getDeclarations();
            assertTrue(1==1);
    }
}