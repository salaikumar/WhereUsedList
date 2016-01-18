package io.salaikumar.parsers;

import java.util.Set;

/**
 * Parser Interface
 * The Inverted Index should be used with any programming language of choice.
 * So, the Language Specific Properties are moved out of Inverted Index
 */
public interface Parser {
    public String[] parse();
    public void addFileExtensions();
    public void addLanguageComponent();
    public void addKeyWork();
    public void addStopWord();
}
