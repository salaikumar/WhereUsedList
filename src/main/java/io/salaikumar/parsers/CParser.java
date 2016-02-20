package io.salaikumar.parsers;


import org.eclipse.cdt.core.dom.ast.IASTDeclaration;
import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import java.util.HashMap;
import java.util.Map;

/*
 * C Parser
 * Class that uses Eclipse CDT Project - added as Library
 * It helps to parse the given C file and build and AST
 * Inverted Index will be built on the top of AST
 */
public class CParser {

    public static IASTTranslationUnit testITranslationUnit() throws CoreException {
        FileContent fileContent = FileContent.createForExternalFileLocation("/home/salaikumar/WebApps/sourcecode/redis-unstable/src/sparkline.c");
        Map definedSymbols = new HashMap();
        String[] includePaths = new String[0];
        IScannerInfo info = new ScannerInfo(definedSymbols,includePaths);
        IParserLogService log = new DefaultLogService();
        IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();
        int opts = 8;
        IASTTranslationUnit translationUnit = GPPLanguage.getDefault().getASTTranslationUnit(fileContent, info, emptyIncludes, null, opts, log);

//      Get all Declarations. both active and inactive
        IASTDeclaration[] allDeclarations = translationUnit.getDeclarations(true);

//      I need to know what is inside allDeclarations.
        for (IASTDeclaration current : allDeclarations){

        }
        return translationUnit;
    }
}
