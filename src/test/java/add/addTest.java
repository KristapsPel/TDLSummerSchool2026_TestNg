package add;

//Add TestNG dependency and plugin Done
//Create add folder inside project/src/test/java Done
//Create addTest class Done
//Inside class addTest Create 4 test method with @Test annotation Done
//In each metode use different values for add method from Calculatore.java class Done
//Check if result is correct and print in console result (If test pass or failed) Done

import calculator.Calculator;
import org.testng.annotations.Test;

public class addTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddPositiveInt(){
        int result = calculator.add(2, 3);
        if(result==-1){
            System.out.println("Test Pass!");
        } else {
            System.out.println("Test Failed!");
        }
    }

    @Test
    public void testAddNegativeInt(){
        int result = calculator.add(-2, -3);
        if(result==-5){
            System.out.println("Test Pass!");
        } else {
            System.out.println("Test Failed!");
        }
    }

    @Test
    public void testAddNegativeAndPositiveInt(){
        int result = calculator.add(2, -3);
        if(result==-1){
            System.out.println("Test Pass!");
        } else {
            System.out.println("Test Failed!");
        }
    }

    @Test
    public void testAddWithZero(){
        int result = calculator.add(2, 0);
        if(result==2){
            System.out.println("Test Pass!");
        } else {
            System.out.println("Test Failed!");
        }
    }
}
