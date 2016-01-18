package io.salaikumar;


import io.salaikumar.parsers.Parser;

import java.util.Map;

public class InvertedIndex {

    Map<String, WordInformation> index;
    Parser parser;

//  Default Constructor
    public InvertedIndex(){

    }

//  Copy Constructor
    public InvertedIndex(Map<String,WordInformation> index){
        this.index = index;
    }

}
