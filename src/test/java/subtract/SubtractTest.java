package subtract;

import calculator.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SubtractTest {
    Calculator calculator = new Calculator();

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
        if(actualResult==expectedResult){
            System.out.println("Pass");
        } else {
            System.out.println("Actual result:"+actualResult+" Expected result:"+expectedResult);
        }
    }
}
