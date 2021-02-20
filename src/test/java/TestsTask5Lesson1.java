package test.java;

import main.java.lesson1.Task2;
import main.java.lesson1.Task5;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestsTask5Lesson1 {
    Task5 task5;

    @BeforeMethod
    public void setUp(){
        task5 = new Task5();
    }

    @Parameters({"someString"})
    @Test
    public void CheckReversString(@Optional("Рама") String someString){
        task5.setSomeString(someString);


        String stringExpected = "амаР";
        String stringActual = task5.reverse(task5.getSomeString());;

        assertEquals(stringActual, stringExpected);
    }
}
