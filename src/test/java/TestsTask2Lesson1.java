package test.java;

import main.java.lesson1.Task1;
import main.java.lesson1.Task2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask2Lesson1 {
    Task2 task2;

    @BeforeMethod
    public void setUp(){
        task2 = new Task2();
    }

    @Test
    public void CountOfRow(){
        task2.setWord("eryhfgjnghj");

        String string = task2.PrintWord(task2.getWord());
        int stringNumberExpected = 6;
        int stringNumberActual = string.split("\n").length;

        assertEquals(stringNumberActual, stringNumberExpected);
    }

    @Test
    public void CountOfWordsInRow(){
        task2.setWord("eryhfgjnghj");

        String string = task2.PrintWord(task2.getWord());
        int countStringNumberExpected = 50;
        int countStringNumberActual = string.trim().split(" ").length;

        assertEquals(countStringNumberActual, countStringNumberExpected);
    }

}
