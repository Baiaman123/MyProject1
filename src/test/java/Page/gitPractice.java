package Page;

import org.testng.Assert;
import org.testng.annotations.Test;

public class gitPractice {
    @Test
    public void test1 (){
        int a =3;
        int b= 10;
        int sum = (a + b) + (a + b) ;
        System.out.println("Sum:" + sum);
    }
    @Test
    public void test2 (){
        String message = "Welcome to USA - the land apport";
        Assert.assertTrue(message.toLowerCase().contains("usa"));
    }
}
