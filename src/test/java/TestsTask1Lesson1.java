package test.java;

import main.java.Server;
import main.java.lesson1.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask1Lesson1 {
    @Test
    public void FirstNumberIsMinimumPositive(){
        Task1 task1 = new Task1();
        task1.setA(2);
        task1.setB(5);
        task1.setC(3);
        int minActual = task1.min(task1.getA(), task1.getB(), task1.getB());
        int minExpected = 2;

        assertEquals(minActual, minExpected);



    }

    @Test
    public void SecondNumberIsMinimumPositive(){
        Task1 task1 = new Task1();
        task1.setA(5);
        task1.setB(-2);
        task1.setC(7);
        int minActual = task1.min(task1.getA(), task1.getB(), task1.getB());
        int minExpected = -2;

        assertEquals(minActual, minExpected);



    }

    @Test
    public void ThirdNumberIsMinimumPositive(){
        Task1 task1 = new Task1();
        task1.setA(5);
        task1.setB(20);
        task1.setC(0);
        int minActual = task1.min(task1.getA(), task1.getB(), task1.getC());
        int minExpected = 0;

        assertEquals(minActual, minExpected);

    }
}
