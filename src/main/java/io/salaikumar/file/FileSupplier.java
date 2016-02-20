package io.salaikumar.file;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Class: File Supplier
 * Desc: Given a folder, this guy will decide on the list of files to be indexed.
 *       In our case, we are going to read all files with extensions .c and .h
 */
public class FileSupplier {

    private File directoryPath;
    private FileFilter cFileFilter;

    public FileSupplier(String path){
        directoryPath = new File(path);
        cFileFilter = new CFileFilter();
    }

    public List<File> getFiles(){
        return Arrays.asList(directoryPath.listFiles(cFileFilter));
    }
}


/*
 * cFileFilter class
 */
class CFileFilter implements FileFilter{

    /*
     * Check if the file name has extensions as either .c or .h
     */
    public boolean accept(File pathname) {
        String extension = "";
        String absolutePath = pathname.getAbsolutePath();
        int dotPosition = absolutePath.lastIndexOf('.');
        extension = absolutePath.substring(dotPosition+1);
        return (extension.equals("c") || extension.equals("h"));
    }
}
