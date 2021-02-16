package test.java;

import main.java.lesson1.Task5;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask5Lesson1 {
    @Test
    public void CheckReversString(){
        Task5 task5 = new Task5();
        task5.setSomeString("Мама мыла раму");

        String string = task5.reverse(task5.getSomeString());
        String stringExpected = "умар алым амаМ";
        String stringActual = string;

        assertEquals(stringActual, stringExpected);
    }
}
