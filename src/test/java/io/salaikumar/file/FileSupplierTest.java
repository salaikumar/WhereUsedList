package io.salaikumar.file;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * File Supplier Class TestCases
 */
public class FileSupplierTest {

    @Test
    public void shouldTestgetFiles(){
        FileSupplier cFiles = new FileSupplier("/home/salaikumar/redis-stable/src");
        List<File> files  = cFiles.getFiles();
        assertThat(files.contains(new File("/home/salaikumar/redis-stable/src/adlist.c")),is(true));
        assertThat(files.contains(new File("/home/salaikumar/redis-stable/src/adlist.o")),is(false));
    }
}