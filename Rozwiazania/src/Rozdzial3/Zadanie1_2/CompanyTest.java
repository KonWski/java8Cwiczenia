package Rozdzial3.Zadanie1_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CompanyTest {

    private Company comp;
    private Employee emp1;
    private Employee emp2;
    private Employee emp3;

    @Before
    public void initialise(){
        comp = new Company();
        emp1 = new Employee("Krzysztof", "Jarzyna", 22, 2600.00);
        emp2 = new Employee("Stefan", "Stefanski", 28, 3000.00);
        emp3 = new Employee("Bemol", "Bemol", 31, 2200.00);
        comp.setEmployees(new ArrayList<>(Arrays.asList(emp1, emp2, emp3)));
    }

    @Test
    public void checkGetBestPaidEmployee(){
        Assert.assertEquals(emp2, comp.getBestPaidEmployee());
    }

    @Test
    public void checkGetOldestEmployee(){
        Assert.assertEquals(emp3, comp.getOldestEmployee());
    }

}