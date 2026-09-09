package subtract;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SubtractTest {
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

    @DataProvider(name = "subtractTestData")
    public Object[][] createSubtractTestData() {
        return new Object[][]{
                {6, 2, 4},
                {2, 3, -2},
                {-1, 2, -3},
                {10, 10, 0},
        };
    }

    @Test(testName = "Subtract test",
            description = "Test subtract methode in Calculator",
            dataProvider = "subtractTestData",
            groups = {"Regression"})
    public void testSubtraction(int a, int b, int expectedResult, Method method){
        String description = method.getAnnotation(Test.class).description();
        System.out.println(description);

        int actualResult = calculator.subtract(a ,b);
        Assert.assertTrue(actualResult==expectedResult);
    }
}
