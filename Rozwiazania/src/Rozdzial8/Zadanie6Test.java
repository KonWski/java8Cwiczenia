package Rozdzial8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Zadanie6Test {

    private Rozdzial8.Zadanie6 zadanie;

    @Before
    public void zainicjuj(){
        zadanie = new Rozdzial8.Zadanie6();
    }

    @Test
    public void sprawdzCiagLiter(){
        Assert.assertTrue(zadanie.czyJedynieLitery("abcdefgh"));
    }

    @Test
    public void sprawdzCiagMieszany(){
        Assert.assertFalse(zadanie.czyJedynieLitery("1a2b3c4d"));
    }
}