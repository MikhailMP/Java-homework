package test.java;

import main.java.Server;
import main.java.lesson1.Task1;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask1Lesson1 {
    Task1 task1;

    @BeforeMethod
    public void setUp(){
       task1 = new Task1();
    }

    @Test
    public void FirstNumberIsMinimumPositive(){
        //Task1 task1 = new Task1();

        task1.setA(2);
        task1.setB(5);
        task1.setC(3);
        int minActual = task1.min(task1.getA(), task1.getB(), task1.getB());
        int minExpected = 2;

        assertEquals(minActual, minExpected);
    }

    @Test
    public void SecondNumberIsMinimumPositive(){

        task1.setA(5);
        task1.setB(-2);
        task1.setC(7);
        int minActual = task1.min(task1.getA(), task1.getB(), task1.getB());
        int minExpected = -2;

        assertEquals(minActual, minExpected);
    }

    @Test (dataProvider = "DProvider")
    public void ThirdNumberIsMinimumPositive(int a, int b, int c, int minExpected){
        task1.setA(a);
        task1.setB(b);
        task1.setC(c);
        int minActual = task1.min(task1.getA(), task1.getB(), task1.getC());

        assertEquals(minActual, minExpected);

    }
    @DataProvider
    public  Object [][] DProvider(){
        return new Object[][]{
                {2, 5, 3, 2},
                {5, -2, 7,-2},
                {5, 20, 0, 0}
        };
    }
}
