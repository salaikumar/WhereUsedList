package io.salaikumar.indexers;

import java.util.HashMap;

/**
 * Inverted Index
 * Stores the Inverted Index for the Code Search
 * Supports the Add and Retrieve Queries
 * Implemented using HashTable
 */
public class InvertedIndex {
    private HashMap<String, IndexDetailsStructure> functionIV;
    private HashMap<String, IndexDetailsStructure> variablesIV;
    private HashMap<String, IndexDetailsStructure> structureIV;
    private HashMap<String, IndexDetailsStructure> macroIV;
    private HashMap<String, IndexDetailsStructure> includesIV;

}
