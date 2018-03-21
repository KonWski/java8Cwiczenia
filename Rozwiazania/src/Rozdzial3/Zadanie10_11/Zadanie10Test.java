package Rozdzial3.Zadanie10_11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Zadanie10Test {

    @Before
    public void initialiseTest(){
        path = Paths.get("D:\\JAVA\\TestZadanie10");
        rozw = new Zadanie10();
    }

    @Test
    public void checkGetAllSubdirectories(){
        List<File> allSubdirectories = rozw.getAllSubdirectories(path);
        Assert.assertNotNull(allSubdirectories);
    }

    @Test
    public void CheckGetAllFilesWithSpecifiedEnding(){
        List<File> specifiedFiles = rozw.getAllFilesWithSpecifiedEnding(path, "txt");
        System.out.println(specifiedFiles.size());
        Assert.assertEquals(1, specifiedFiles.size());
    }

    private Path path;
    private Zadanie10 rozw;

}