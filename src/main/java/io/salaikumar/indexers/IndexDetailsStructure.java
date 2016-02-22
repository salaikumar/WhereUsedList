package io.salaikumar.indexers;

/**
 * Structure of the Inverted Index
 */
public class IndexDetailsStructure {
    private ElementType elementType;
    private String filePath;
    private int lineNumber;

    public IndexDetailsStructure(ElementType elementType,String filePath,int lineNumber){
        this.elementType = elementType;
        this.filePath = filePath;
        this.lineNumber = lineNumber;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
