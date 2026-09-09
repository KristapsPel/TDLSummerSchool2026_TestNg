package multiply;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class MultiplyTest {
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

    @DataProvider(name = "multiplyTestData")
    public Object[][] createMultiplyTestData() {
        return new Object[][]{
                {6, 2, 12},
                {2, 3, 7},
                {-1, 2, -2},
                {10, 0, 0},
        };
    }

    @Test(testName = "Multiply test",
            description = "Test multiply methode in Calculator",
            dataProvider = "multiplyTestData",
            groups = {"Regression"})
    public void testMultiply(int a, int b, int expectedResult, Method method){
        String description = method.getAnnotation(Test.class).description();
        System.out.println(description);

        int actualResult = calculator.multiply(a ,b);
        Assert.assertEquals(actualResult, expectedResult, "Multiply result did not return expected value:");
    }
}
