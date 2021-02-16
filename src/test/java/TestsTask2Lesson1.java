package test.java;

import main.java.lesson1.Task1;
import main.java.lesson1.Task2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask2Lesson1 {
    @Test
    public void CountOfRow(){
        Task2 task2 = new Task2();
        task2.setWord("eryhfgjnghj");

        String string = task2.PrintWord(task2.getWord());
        int stringNumberExpected = 6;
        int stringNumberActual = string.split("\n").length;

        assertEquals(stringNumberActual, stringNumberExpected);
    }

    @Test
    public void CountOfWordsInRow(){
        Task2 task2 = new Task2();
        task2.setWord("eryhfgjnghj");

        String string = task2.PrintWord(task2.getWord());
        int countStringNumberExpected = 50;
        int countStringNumberActual = string.trim().split(" ").length;
        System.out.println(string);
        assertEquals(countStringNumberActual, countStringNumberExpected);
    }

}
