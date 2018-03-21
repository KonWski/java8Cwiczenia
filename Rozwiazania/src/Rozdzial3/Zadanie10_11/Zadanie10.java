package Rozdzial3.Zadanie10_11;

/*
* Korzystając z metod listFiles(FileFilter) i isDirectory z klasy java.io.File,
* napisz metodę zwracającą wszystkie podkatalogi wskazanego katalogu. Wykorzystaj wyrażenie lambda
* zamiast obiektu Filefilter
* */

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie10 {

    public List<File> getAllSubdirectories(Path path){

        final FilenameFilter subDirectoriesFilter = (dir, name) -> dir.isDirectory();
        File startFile = path.toFile();
        File[] filesArray = startFile.listFiles(subDirectoriesFilter);
        ArrayList<File> subdirectoriesList = new ArrayList<>(Arrays.asList(filesArray));

        return subdirectoriesList;
    }

    /*
    * Zadanie11
    * Korzystając z metody list(FileNameFilter) klasy java.io.File napisz metodę zwracającą wszystkie
    * pliki ze wskazanego katalogu ze wskazanym rozszerzeniem. Użyj wyrażenia lambda, a nie FileNameFilter.
    * Jakie zmienne zewnętrzne wykorzystasz?
    */

    public List<File> getAllFilesWithSpecifiedEnding(Path path, String ending){

        //dir - parentdirectory, name - name of file
        final FilenameFilter fileEndingFilter = (dir, name) -> {
            return name.endsWith(ending);
        };

        File startFile = path.toFile();
        File[] filesArray = startFile.listFiles(fileEndingFilter);
        ArrayList<File> specifiedFilesList = new ArrayList<>(Arrays.asList(filesArray));

        return specifiedFilesList;
    }

}
