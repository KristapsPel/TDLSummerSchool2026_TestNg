package add;

//Create dataProviderMethod with @DataProvider annotation that returns Object[][] Done
//Provide 3 variable (a, b and expected result) add all values from previous created tests Done
//Add dataProvider data to test Done
//Use data from dataProvider in test Done
//Add testName and description Done
//Print in terminal testDescription Done
//Run the same 4 tests that we did run on previous practical task using just one test method Done


import calculator.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class AddTest {

    Calculator calculator = new Calculator();

    @DataProvider(name = "addTestData")
    public Object[][] createTestDataForAdd(){
        return new Object[][]{
                {2 , 3, -1},
                {-2, -3, -5},
                {2, -3, -1},
                {2, 0, 2}
        };
    }

    @Test(dataProvider = "addTestData",
            testName = "Add Test case",
            description = "Testing add methode for Calculator class")
    public void testAddCalculator(int a, int b, int result, Method method){
        String description = method.getAnnotation(Test.class).description();
        System.out.println("Description:"+description);
        int actualResult=calculator.add(a,b);
        if(actualResult==result){
            System.out.println("PASS");
        } else {
            System.out.println("Actual result:"+actualResult+" but expected:"+result);
        }
    }

//    @Test
//    public void testAddPositiveInt(){
//        int result = calculator.add(2, 3);
//        if(result==-1){
//            System.out.println("Test Pass!");
//        } else {
//            System.out.println("Test Failed!");
//        }
//    }
//
//    @Test
//    public void testAddNegativeInt(){
//        int result = calculator.add(-2, -3);
//        if(result==-5){
//            System.out.println("Test Pass!");
//        } else {
//            System.out.println("Test Failed!");
//        }
//    }
//
//    @Test
//    public void testAddNegativeAndPositiveInt(){
//        int result = calculator.add(2, -3);
//        if(result==-1){
//            System.out.println("Test Pass!");
//        } else {
//            System.out.println("Test Failed!");
//        }
//    }
//
//    @Test
//    public void testAddWithZero(){
//        int result = calculator.add(2, 0);
//        if(result==2){
//            System.out.println("Test Pass!");
//        } else {
//            System.out.println("Test Failed!");
//        }
//    }
}
