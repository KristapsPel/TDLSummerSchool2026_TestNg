package divide;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DivideByZeroTest {
    Calculator calculator = new Calculator();

    @BeforeMethod
    public void checkEmptyList(){
        Assert.assertEquals(calculator.getHistory().size(),
                0,
                "History is not empty");
    }

    @AfterMethod
    public void cleanList(){
        calculator.clearHistory();
    }

    @Test(testName = "Divide By Zero with Exception",
    description = "Test Expected exception when divide by zero",
    expectedExceptions = ArithmeticException.class)
    public void testDivideByZeroWithExpectedException(Method method){
        String description = method.getAnnotation(Test.class).description();
        System.out.println(description);

        calculator.divide(10, 0);
    }

    @Test(testName = "Divide By Zero with Exception",
            description = "Test without Expected exception when divide by zero")
    public void testDivideByZeroWithoutExpectedException(Method method){
        String description = method.getAnnotation(Test.class).description();
        System.out.println(description);

        calculator.divide(10, 0);
    }
}
