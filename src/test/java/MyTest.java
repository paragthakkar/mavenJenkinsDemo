package test.java;

import main.java.HelloWorld;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest {

    @Test
    public void test1() {
        HelloWorld.main(new String[]{"Hello", "world"});
    }
}
