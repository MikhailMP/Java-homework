package test.java;

import main.java.Server;
import org.testng.annotations.Test;

import static java.lang.String.format;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FIrst_test {
    @Test
    public void FirstTestMethod(){
       Server server = new Server();
       server.setAge(15);

       String expectedStatus = "student";
       String actualdStatus = server.getStatus();


       assertEquals(expectedStatus, actualdStatus);
    }

    @Test

    public void FirstTestForWorker(){
        Server server = new Server();
        server.setAge(55);

        String expectedStatus = "worker";
        String actualdStatus = server.getStatus();


        assertEquals(expectedStatus, actualdStatus);
    }

    @Test

    public void FirstTestForPensioner(){
        Server server = new Server();
        server.setAge(65);

        String expectedStatus = "pensioner";
        String actualdStatus = server.getStatus();


        assertEquals(expectedStatus, actualdStatus);
        int a = 11;
        assertTrue(a > 10, "text сообщения которое будет выводится в случае падения теста");
    }
}
