package io.salaikumar.parsers;


import org.eclipse.cdt.core.dom.ast.IASTTranslationUnit;
import org.eclipse.cdt.core.dom.ast.gnu.cpp.GPPLanguage;
import org.eclipse.cdt.core.parser.*;
import org.eclipse.core.runtime.CoreException;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * C Parser
 * Class that uses Eclipse CDT Project - added as Library
 * It helps to parse the given C file and build and AST
 * Inverted Index will be built on the top of AST
 */
public class CParser {

    private IASTTranslationUnit ast;

    public CParser(File file){
        try {
            ast = getAST(file.getAbsolutePath());
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    /*
     *
     */
    public List getAllFunctions(){

        return null;
    }

    public List getAllIncludes(){
        return null;
    }

    /*
     * Get all Declarations in the given file
     */
    public List getAllDeclarations(){
        return Arrays.asList(ast.getDeclarations(true));
    }

    public void parse(){
    }


    /*
     * The below code is kept in order to experiment with extracting data from Parser
     */
    private IASTTranslationUnit getAST(String filepath) throws CoreException {
        FileContent fileContent = FileContent.createForExternalFileLocation(filepath);
        Map definedSymbols = new HashMap();
        String[] includePaths = new String[0];
        IScannerInfo info = new ScannerInfo(definedSymbols,includePaths);
        IParserLogService log = new DefaultLogService();
        IncludeFileContentProvider emptyIncludes = IncludeFileContentProvider.getEmptyFilesProvider();
        int opts = 8;
        IASTTranslationUnit translationUnit = GPPLanguage.getDefault().getASTTranslationUnit(fileContent,
                                                info, emptyIncludes, null, opts, log);

//        IASTDeclaration[] allDeclarations = translationUnit.getDeclarations(true);
//
////      I need to know what is inside allDeclarations.
//        for (IASTDeclaration current : allDeclarations){
//
//        }
        return translationUnit;
    }



}
