package divide;

import calculator.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DivideTest {
    Calculator calculator = new Calculator();

    @DataProvider(name = "divideTestData")
    public Object[][] createDivideTestData() {
        return new Object[][]{
                {6, 2, 3},
                {2, 4, 0.5},
                {-1, -1, 1},
                {10, 10, 1},
        };
    }

    @Test(testName = "Divide test",
            description = "Test divide methode in Calculator",
            dataProvider = "divideTestData",
            groups = {"Regression", "Smoke"})
    public void testDivide(int a, int b, double expectedResult, Method method){
        String description = method.getAnnotation(Test.class).description();
        System.out.println(description);

        double actualResult = calculator.divide(a ,b);
        if(actualResult==expectedResult){
            System.out.println("Pass");
        } else {
            System.out.println("Actual result:"+actualResult+" Expected result:"+expectedResult);
        }
    }
}
